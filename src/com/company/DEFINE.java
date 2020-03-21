package com.company;

import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Logger;

public class DEFINE implements ICalculate {


    private static final Logger log = Logger.getLogger(Main.class.getName());

    @Override
    public Context perform(Context context, ArrayList<String> args){
            context.ADD(args.get(0), Double.parseDouble(args.get(1)));
            log.info( args.get(0)+" "+ "variable has defined as"+" " +Double.parseDouble(args.get(1)));
            return context;
    }
}
