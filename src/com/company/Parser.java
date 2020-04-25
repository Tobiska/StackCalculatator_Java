package com.company;


import com.company.CException.IO_CException;

import java.util.*;
import java.util.logging.Logger;

public class Parser {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    private ArrayList<String> Text = new ArrayList<String>();
    private List<MyEntry<String,ArrayList<String>>> sequence = new ArrayList<MyEntry<String,ArrayList<String>>>();

    public Parser(String text){
        StringBuilder tmp = new StringBuilder();
        for(int i = 0 ;i < text.length();i++){
            if(text.charAt(i) == '\n'){
                this.Text.add(tmp.toString());
                tmp.setLength(0);
                //tmp = new StringBuilder();
            }else {
                tmp.append(text.charAt(i));
            }
        }


    }

    public void parse()throws IO_CException{
        int numberOfInstructures = 0;
        for(String it_str:Text){
            //String[] b = { };
            numberOfInstructures++;
            ArrayList<String> r = new ArrayList<String>();
                String[] b = it_str.split(" ");

                for(int i = 0;i < b.length;i++)
                    r.add(b[i]);
            switch (r.get(0)) {
                case "#":
                    continue;
                case "DEFINE":
                    if ((r.get(1).contains("[^a-zA-Z]+"))) {
                        throw new IO_CException("Wrong arguments:Define", numberOfInstructures);
                    }
                    if ((r.size() != 3) || (r.get(2).contains("[^0-9]+")))
                        throw new IO_CException("Wrong arguments:Define", numberOfInstructures);

                    sequence.add(new MyEntry<String, ArrayList<String>>(r.remove(0), r));
                    break;
                case "POP":
                    if ((r.size() != 2) || (r.get(1).contains("[^0-9]+"))) {
                        throw new IO_CException("Wrong arguments:POP", numberOfInstructures);
                    }/*Цифры*/
                    sequence.add(new MyEntry<String, ArrayList<String>>(r.remove(0), r));

                    break;
                case "PUSH":
                    if ((r.size() != 2) || (r.get(1).contains("[^0-9]+"))) {
                        throw new IO_CException("Wrong arguments:PUSH", numberOfInstructures);
                    }/*Цифры*/
                    sequence.add(new MyEntry<String, ArrayList<String>>(r.remove(0), r));
                    break;
                case "+":
                    if ((r.size() != 1)) {
                        throw new IO_CException("Wrong arguments:PLUS(+)", numberOfInstructures);
                    }/*Цифры*/
                    sequence.add(new MyEntry<String, ArrayList<String>>(r.remove(0), r));

                    break;
                case "-":
                    if ((r.size() != 1)) {
                        throw new IO_CException("Wrong arguments:MINUS(-)", numberOfInstructures);
                    }/*Цифры*/
                    sequence.add(new MyEntry<String, ArrayList<String>>(r.remove(0), r));
                    break;
                case "*":
                    if ((r.size() != 1)) {
                        throw new IO_CException("Wrong arguments:MULTIPLY(*)", numberOfInstructures);
                    }/*Цифры*/
                    sequence.add(new MyEntry<String, ArrayList<String>>(r.remove(0), r));
                    break;
                case "/":
                    if ((r.size() != 1)) {
                        throw new IO_CException("Wrong arguments:DEVIDE(/)", numberOfInstructures);
                    }/*Цифры*/
                    sequence.add(new MyEntry<String, ArrayList<String>>(r.remove(0), r));
                    break;
                case "SQRT":
                    if ((r.size() != 1)) {
                        throw new IO_CException("Wrong arguments:SQRT", numberOfInstructures);
                    }/*Цифры*/
                    sequence.add(new MyEntry<String, ArrayList<String>>(r.remove(0), r));
                    break;
                case "PRINT":
                    if ((r.size() != 1)) {
                        throw new IO_CException("Wrong arguments:PRINT", numberOfInstructures);
                    }/*Цифры*/
                    sequence.add(new MyEntry<String, ArrayList<String>>(r.remove(0), r));
                    break;
                default:
                    throw new IO_CException("Wrong instructure:" + r.get(0), numberOfInstructures);
            }
        }
    }

    public List<MyEntry<String,ArrayList<String>>> getSequence(){
        return sequence;
    }


}
