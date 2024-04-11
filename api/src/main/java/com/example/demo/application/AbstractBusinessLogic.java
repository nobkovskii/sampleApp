package com.example.demo.application;

/**
 * 基底クラス
 */
public abstract class AbstractBusinessLogic<I,O> implements BusinessLogic<I,O>{
    public O execute(I input){
        try{
            preExecute(input);
            O output = doExecute(input);
            return output;
        }finally{

        }
    }
    protected abstract void preExecute(I input);
    protected abstract O doExecute(I input);
}
