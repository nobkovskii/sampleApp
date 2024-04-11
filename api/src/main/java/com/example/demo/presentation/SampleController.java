package com.example.demo.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.SampleBusinessLogic;
import com.example.demo.application.SampleOutput;


@RestController
public class SampleController {

    @Autowired
    SampleBusinessLogic bLogic;
    
    @GetMapping("/api001")
    // public SampleOutput getMethodName(@RequestParam SampleInput param) {
    public SampleOutput getMethodName() {
        SampleOutput output = new SampleOutput();
        output = bLogic.execute(null);
        return output;
    }
    
}
