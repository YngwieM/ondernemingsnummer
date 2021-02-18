package be.vdab.ondernemingsnummer.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = OndernemingsNummerValidator.class)
public @interface OndernemingsNummer {
    String message() default "{be.vdab.OndernemingsNummer.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}