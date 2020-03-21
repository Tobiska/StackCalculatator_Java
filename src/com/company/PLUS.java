package com.company;

import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Logger;

public class PLUS implements ICalculate {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    @Override
    public Context perform(Context context, ArrayList<String> args){
        Double a = context.POP();
        Double b = context.POP();
        context.PUSH(a+b);
        log.info(a+" "+"folded"+" "+b);
        return context;
    }
}
