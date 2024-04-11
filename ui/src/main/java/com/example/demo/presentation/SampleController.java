package com.example.demo.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.application.SampleBusinessLogic;
import com.example.demo.application.SampleInput;
import com.example.demo.application.SampleOutput;

@Controller
public class SampleController {
    @Autowired
    SampleBusinessLogic bLogic;

    @GetMapping("/test001")
    public String test(Model model){
        SampleInput input = new SampleInput();
        SampleOutput output = bLogic.execute(input);
        model.addAttribute("id", output.getId());
        return "test001";
    }
}
