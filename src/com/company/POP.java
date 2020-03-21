package com.company;

import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Logger;

public class POP implements ICalculate {


    private static final Logger log = Logger.getLogger(Main.class.getName());


    @Override
    public Context perform(Context context, ArrayList<String> args){
        Double a = context.POP();
        log.info(a+" "+"has poped from stack");
        return context;
    }
}
