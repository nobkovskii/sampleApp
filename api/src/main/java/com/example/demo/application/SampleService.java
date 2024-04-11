package com.example.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.infra.SampleDatabase;
import com.example.demo.infra.SampleEntity;


@Service
public class SampleService extends AbstractBusinessLogic<SampleInput,SampleOutput> implements SampleBusinessLogic{

    @Autowired
    SampleDatabase database;
    
    @Override
    protected void preExecute(SampleInput input) {
        System.out.println("do preExecute!");
    }

    @Override
    protected SampleOutput doExecute(SampleInput input) {
        System.out.println("do Execute!");
        SampleOutput output = new SampleOutput();
        SampleEntity entity = database.findByName("aaa");
        output.setId(entity.getId());
        return output;
    }
    
}
