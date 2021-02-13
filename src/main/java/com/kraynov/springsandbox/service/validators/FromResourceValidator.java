package com.kraynov.springsandbox.service.validators;

import com.kraynov.springsandbox.service.TransferCreationStep;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@StepValidator(step = TransferCreationStep.STEP_2)
@Component
@Scope("prototype")
public class FromResourceValidator implements Validator {

    @Value("someValue")
    private String val;

    @Override
    public boolean validate(String value) {
        System.out.println("    "+val);
        System.out.println("    "+this.toString());
        return false;
    }
}
