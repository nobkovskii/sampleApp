package com.example.demo.infra;

import java.io.Serializable;

import lombok.Data;

@Data
public class SampleEntity implements Serializable{
    private String id;
    private String name;
}
