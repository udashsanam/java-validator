package com.learn.validator.customvalidation;

import com.learn.validator.customvalidation.implementation.PhoneNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneNumberValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumberConstraints {


    String message() default "Invalid phone number";

    int maxSize() default 12;

    int minSize() default 8;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
