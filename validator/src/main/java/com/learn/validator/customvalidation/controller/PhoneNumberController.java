package com.learn.validator.customvalidation.controller;

import com.learn.validator.customvalidation.dto.PhoneNumber;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PhoneNumberController {

    @RequestMapping(value = "/validTest", method = RequestMethod.POST)
    public String validate(@Valid @RequestBody PhoneNumber phoneNumber, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "not hello";
        }

        return "hello";
    }
}
