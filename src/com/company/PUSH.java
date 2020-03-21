package com.company;

import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Logger;

public class PUSH implements ICalculate{


    private static final Logger log = Logger.getLogger(Main.class.getName());


    @Override
    public Context perform(Context context, ArrayList<String> args){

        if(context.FIND(args.get(0))) {
            context.PUSH(context.GET(args.get(0)));//stack.push(variables.get(args.get(0)));
            log.info(args.get(0) + (context.GET(args.get(0))) + "has pushed in stack");
        }
        else {
            context.PUSH(Double.parseDouble(args.get(0)));
            log.info(args.get(0) +" "+ "has pushed in stack");
        }
        return context;
    }
}
