package com.kraynov.springsandbox.swift.input.validators;

import com.kraynov.springsandbox.swift.input.TransferCreationStep;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@StepValidator(step = TransferCreationStep.STEP_2)
public class FromResourceValidator implements com.kraynov.springsandbox.swift.input.validators.Validator {

    @Value("someValue")
    private String val;

    @Override
    public boolean validate(String value) {
        System.out.println("    "+val);
        System.out.println("    "+this.toString());
        return false;
    }
}
