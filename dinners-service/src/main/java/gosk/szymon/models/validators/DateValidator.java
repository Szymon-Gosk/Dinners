package gosk.szymon.models.validators;

import gosk.szymon.models.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<DateAnnotation, Date> {

    public void initialize(DateAnnotation constraintAnnotation) {
        // initialize the zipcode/city/country correlation service
    }

    public boolean isValid(Date date, ConstraintValidatorContext context) {
        if (date == null) return false;
        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();

        if(day < 1 || day > 31) return false;
        if(month < 1 || month > 12) return false;

        // check date



        return true;
    }

}
