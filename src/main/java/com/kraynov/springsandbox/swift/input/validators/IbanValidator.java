package com.kraynov.springsandbox.swift.input.validators;

import com.kraynov.springsandbox.swift.input.TransferCreationStep;
import org.springframework.stereotype.Component;

@Component
@StepValidator(step = TransferCreationStep.STEP_1)
public class IbanValidator implements com.kraynov.springsandbox.swift.input.validators.Validator {
    @Override
    public boolean validate(String value) {
        System.out.println("    "+this.toString());
        return false;
    }
}
