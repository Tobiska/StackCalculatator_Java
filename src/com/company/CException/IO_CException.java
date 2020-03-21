package com.company.CException;

public class IO_CException extends CalculateException {
    int numberOfinstructures;
    public IO_CException(String msg,int num){
        super(msg);
        num = numberOfinstructures;
    }
    public int getNumberOfinstructures(){
        return numberOfinstructures;
    }
}
