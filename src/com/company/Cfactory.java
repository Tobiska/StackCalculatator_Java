package com.company;

import com.company.CException.CalculateException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.logging.Logger;


public class Cfactory {
    //private Map<ICalculate, ArrayList<String>> mp = new LinkedHashMap<ICalculate,ArrayList<String>>();//list
    private List<MyEntry<ICalculate,ArrayList<String>>> mp = new ArrayList<MyEntry<ICalculate,ArrayList<String>>>();

    private static final Logger log = Logger.getLogger(Main.class.getName());
    private Map<String,Class<?>> prop = new HashMap<>();

    private String filename = "C:\\Users\\kiril\\IdeaProjects\\StackCalculatator(Factory)\\src\\com\\company\\Properties";

    public Cfactory() throws Exception {
        try(FileReader fr = new FileReader(filename);Scanner scan = new Scanner(fr)) {

            while(scan.hasNextLine()) {
                prop.put(scan.next(),Class.forName(scan.next()));
            }

        }catch (Exception ex) {
            throw ex;
        }
    }

    public ICalculate getInstance(String key) throws Exception {
        if(prop.containsKey(key)) {
            Class<?> a = prop.get(key);
            return (ICalculate) a.getConstructor().newInstance();
        }else {
            throw new CalculateException("Unkown key");//return null;
        }
    }




   /* String configurationFileName = "commands.properties";
    private final Map<String, Cfactory> commandMap = new HashMap<>();*/


   /* public Cfactory(List<MyEntry<String,ArrayList<String>>> sequence) {
        int i = 0;
        for (MyEntry<String, ArrayList<String>> it_map : sequence) {
            switch (it_map.getKey()) {
                case "DEFINE":
                    //mp.put(new DEFINE(),it_map.getValue());\
                    mp.add(new MyEntry<ICalculate, ArrayList<String>>(new DEFINE(), it_map.getValue()));
                    break;
                case "+":
                    mp.add(new MyEntry<ICalculate, ArrayList<String>>(new PLUS(), it_map.getValue()));
                    break;
                case "-":
                    mp.add(new MyEntry<ICalculate, ArrayList<String>>(new MINUS(), it_map.getValue()));
                    break;
                case "*":
                    mp.add(new MyEntry<ICalculate, ArrayList<String>>(new MULT(), it_map.getValue()));
                    break;
                case "/":
                    mp.add(new MyEntry<ICalculate, ArrayList<String>>(new DIVIDE(), it_map.getValue()));
                    break;
                case "SQRT":
                    mp.add(new MyEntry<ICalculate, ArrayList<String>>(new SQRT(), it_map.getValue()));
                    break;
                case "POP":
                    mp.add(new MyEntry<ICalculate, ArrayList<String>>(new POP(), it_map.getValue()));
                    break;
                case "PUSH":
                    mp.add(new MyEntry<ICalculate, ArrayList<String>>(new PUSH(), it_map.getValue()));
                    break;
                case "PRINT":
                    mp.add(new MyEntry<ICalculate, ArrayList<String>>(new PRINT(), it_map.getValue()));
                    break;
            }
        }*/




       /* public void InitFactory()
        {
            Properties prop = new Properties();

            try(InputStream in = BlockFactory.class.getResourceAsStream(configurationFileName))
            {
                prop.load(in);
            }
            catch (IOException e)
            {
                System.out.println("Problem in reading configuration file");
            }

            for (String key : prop.stringPropertyNames())
            {
                String value = prop.get(key).toString();

                try
                {
                    Class<?> prototype = Class.forName(value);
                    commandMap.put(key, (UniversalCommand) prototype.newInstance());
                }
                catch (Exception e)
                {
                    System.out.println("Problem with loading class " + key );
                }
            }
        }



    }
*/


}
