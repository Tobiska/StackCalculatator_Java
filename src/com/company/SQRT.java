package com.company;

import com.company.CException.SQRT_Exception;

import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Logger;

public class SQRT implements ICalculate {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    @Override
    public Context perform(Context context, ArrayList<String> args)throws Exception{
            Double a =context.POP();
                if (a < 0) {
                    throw new SQRT_Exception("negative number under the sqrt");
                }
                Double res = Math.sqrt(a);
                context.PUSH(res);
                log.info(res+" "+"divided");

        return context;
    }
}
