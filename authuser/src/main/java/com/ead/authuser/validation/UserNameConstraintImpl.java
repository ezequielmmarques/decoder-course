package com.ead.authuser.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserNameConstraintImpl implements ConstraintValidator<UserNameConstraint, String> {

    @Override
    public void initialize(UserNameConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String userName, ConstraintValidatorContext constraintValidatorContext) {
        return userName != null && !userName.trim().isEmpty() && !userName.contains(" ");
    }
}
