package com.example.demo.infra;

public interface SampleRepository extends BaseRepository<SampleEntity,String>{
    SampleEntity findByName(String name);
}
