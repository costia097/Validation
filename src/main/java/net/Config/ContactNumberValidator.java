package net.Config;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<PhoneCheck,String> {

    public void initialize(PhoneCheck phoneCheck) {

    }

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.matches("[0-9]+") && s.length() < 16 && s.length() > 12;
    }
}
