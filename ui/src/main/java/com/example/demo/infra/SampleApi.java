package com.example.demo.infra;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.application.SampleOutput;

@Repository
public class SampleApi {
    
    private final RestTemplate restTemplate;
    public static final String URL = "http://localhost:8081/api001";

    public SampleApi(RestTemplateBuilder builder){
        this.restTemplate = builder.build();
    }

    public SampleOutput getApi001(){
        return restTemplate.getForObject(URL, SampleOutput.class);
    }
    
}
