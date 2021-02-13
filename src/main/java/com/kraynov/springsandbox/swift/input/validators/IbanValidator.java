package com.kraynov.springsandbox.swift.input.validators;

import com.kraynov.springsandbox.swift.input.TransferCreationStep;
import org.springframework.stereotype.Component;

@com.kraynov.springsandbox.swift.input.validators.StepValidator(step = TransferCreationStep.STEP_1)
@Component
public class IbanValidator implements com.kraynov.springsandbox.swift.input.validators.Validator {
    @Override
    public boolean validate(String value) {
        System.out.println("    "+this.toString());
        return false;
    }
}
