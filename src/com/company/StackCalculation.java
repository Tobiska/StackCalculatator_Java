package com.company;

import com.company.CException.ArifmException;
import com.company.CException.CalculateException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class StackCalculation {

    private static final Logger log = Logger.getLogger(Main.class.getName());


    private Cfactory cfactory;
    private Context context;
    private Parser parser;


    List<MyEntry<ICalculate,ArrayList<String>>> tmpSeqIB;

    public StackCalculation(Cfactory cfactory,Parser parser){
        this.cfactory = cfactory;
        this.context = new Context();
        this.parser = parser;
    }

    public void Prepare() throws Exception{
        List<MyEntry<String,ArrayList<String>>> tmpStrSeq = parser.getSequence();
        tmpSeqIB = new ArrayList<MyEntry<ICalculate,ArrayList<String>>>();
        for(MyEntry<String,ArrayList<String>> it_seq:tmpStrSeq){
            try {
                ICalculate command = cfactory.getInstance(it_seq.getKey());

                if (command != null) {
                    tmpSeqIB.add(new MyEntry<ICalculate, ArrayList<String>>(command, it_seq.getValue()));
                }
            }catch(CalculateException e){

            }
        }
    }

    public void Process(){
        //List<MyEntry<ICalculate,ArrayList<String>>> tmpMap = cfactory.getSequence();
            for (MyEntry<ICalculate, ArrayList<String>> it_factory : tmpSeqIB) {
                try {
                    this.context = it_factory.getKey().perform(context, it_factory.getValue());
                }catch(Exception ex){

                }
            }

    }

    public Context getContext(){
        return context;
    }


}
