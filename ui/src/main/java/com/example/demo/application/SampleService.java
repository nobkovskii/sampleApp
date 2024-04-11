package com.example.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.infra.SampleApi;

@Service
public class SampleService extends AbstractBusinessLogic<SampleInput,SampleOutput> implements SampleBusinessLogic{

    @Autowired
    SampleApi api;

    @Override
    protected void preExecute(SampleInput input) {
        System.out.println("do preExecute!");
    }

    @Override
    protected SampleOutput doExecute(SampleInput input) {
        System.out.println("do Execute!");
        SampleOutput output = new SampleOutput();
        output = api.getApi001();
        return output;
    }
    
}
