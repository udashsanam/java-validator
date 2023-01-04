package com.learn.validator.customvalidation.implementation;

import com.learn.validator.customvalidation.PhoneNumberConstraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumberConstraints, String> {

    int maxSize;
    int minSize;


    @Override
    public void initialize(PhoneNumberConstraints constraintAnnotation) {
        this.maxSize = constraintAnnotation.maxSize();
        this.minSize = constraintAnnotation.minSize();
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext constraintValidatorContext) {

        if(contactField.length()>maxSize || contactField.length() < minSize){
            // code todo some thing
            return false;
        }
//
//        return contactField != null && contactField.matches("[0-9]+")
//                && (contactField.length() > 8) && (contactField.length() < 14);

        return true;
    }
}
