package com.kraynov.springsandbox.service.validators;

import com.kraynov.springsandbox.service.TransferCreationStep;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface StepValidator {

    TransferCreationStep[] step() default TransferCreationStep.INIT;
}
