package com.example.demo.infra;

import org.springframework.stereotype.Repository;

@Repository
public class SampleDatabase implements SampleRepository{

    @Override
    public SampleEntity findById(String id) {
        SampleEntity entity = new SampleEntity();
        return entity;
    }

    @Override
    public SampleEntity findByName(String name) {
        SampleEntity entity = new SampleEntity();
        entity.setId("123-456-789");
        entity.setName(name);
        return entity;
    }
    
}
