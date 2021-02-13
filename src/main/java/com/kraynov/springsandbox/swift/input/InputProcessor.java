package com.kraynov.springsandbox.swift.input;

import com.kraynov.springsandbox.swift.input.validators.StepValidator;
import com.kraynov.springsandbox.swift.input.validators.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class InputProcessor {

    @Autowired
    @StepValidator(step = TransferCreationStep.STEP_1)
    List<Validator> firstStepValidators;

    @Autowired
    @StepValidator(step = TransferCreationStep.STEP_2)
    List<Validator> secondStepValidators;

    public int processFirstStepInput(String param) {
        System.out.println(this.toString());
        firstStepValidators.forEach(validator -> {
            validator.validate(param);
            System.out.println("  "+validator.getClass());
        });
        return 0;
    }

    public int processSecondStepInput(String param) {
        System.out.println(this.toString());
        secondStepValidators.forEach(validator -> {
            validator.validate(param);
            System.out.println("  "+validator.getClass());
        });
        return 0;
    }
}
