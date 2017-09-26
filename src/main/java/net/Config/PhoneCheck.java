package net.Config;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ContactNumberValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneCheck {
    String message() default "Invalid number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
