package com.company;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static double main(String[] args) {
        try {
            //args[0] = "C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\input.txt";
            ReadFile readFile = new ReadFile(args/*"C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\input.txt"*/);
            Parser parser = new Parser(readFile.getText());
            parser.parse();
            log.info("Parsing has done");
            Cfactory cfactory = new Cfactory();
            log.info("Making factory has done");
            StackCalculation stackCalculation = new StackCalculation(cfactory,parser);
            stackCalculation.Prepare();
            stackCalculation.Process();
            log.info("stackCalculation has finished");
            return stackCalculation.getContext().PEEK();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            log.log(Level.WARNING,ex.getMessage(),ex);
            //System.out.println(e.getNumberAction());
        }
        return 0;
    }

}
