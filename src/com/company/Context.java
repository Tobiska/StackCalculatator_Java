package com.company;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Context {

    private Stack<Double> doubleStack;
    private Map<String,Double> variables;//= new TreeMap<String, Double>();

    public Context(){
        this.doubleStack = new Stack<Double>();
        this.variables =  new TreeMap<String, Double>();
    }

    public void PUSH(Double v){
        doubleStack.push(v);
    }

    public Double POP(){
       return doubleStack.pop();
    }

    public double PEEK(){
        return doubleStack.peek();
    }

    public void ADD(String key,Double value){
        variables.put(key,value);
    }

    public boolean FIND(String key){
        return  variables.containsKey(key);
    }

    public Double GET(String key){
        return variables.get(key);
    }
}
