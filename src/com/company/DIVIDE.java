package com.company;

import com.company.CException.DEVIDE_Exception;

import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Logger;

public class DIVIDE implements ICalculate {


    private static final Logger log = Logger.getLogger(Main.class.getName());


    public Context perform(Context context, ArrayList<String> args){
        try {
            Double a = context.POP();
            Double b = context.POP();
            if(b == 0){
                throw new DEVIDE_Exception("DevisionbyZero");
            }
            context.PUSH(a / b);
            log.info(a + " " + "divided" + " " + b);
        }catch (DEVIDE_Exception ex){

        }
        return context;
    }
}
