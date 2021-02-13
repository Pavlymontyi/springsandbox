package com.kraynov.springsandbox.service.validators;

import com.kraynov.springsandbox.service.TransferCreationStep;
import org.springframework.stereotype.Component;

@StepValidator(step = TransferCreationStep.STEP_1)
@Component
public class IbanValidator implements Validator {
    @Override
    public boolean validate(String value) {
        System.out.println("    "+this.toString());
        return false;
    }
}
