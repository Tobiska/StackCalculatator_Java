package com.company;

import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Logger;

public class PRINT implements ICalculate {

    private static final Logger log = Logger.getLogger(Main.class.getName());


    public Context perform(Context context, ArrayList<String> args){
        System.out.println(context.PEEK());
        return context;
    }
}
