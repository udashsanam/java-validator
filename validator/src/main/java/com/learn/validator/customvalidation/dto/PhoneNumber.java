package com.learn.validator.customvalidation.dto;

import com.learn.validator.customvalidation.PhoneNumberConstraints;

public class PhoneNumber {

    @PhoneNumberConstraints
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
