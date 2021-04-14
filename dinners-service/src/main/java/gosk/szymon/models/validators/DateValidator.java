package gosk.szymon.models.validators;

import gosk.szymon.models.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<DateAnnotation, Date> {

    public void initialize(DateAnnotation constraintAnnotation) {
    }

    public boolean isValid(Date date, ConstraintValidatorContext context) {
        if (date == null) return false;
        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();

        if(day < 1) return false;
        if(month < 1 || month > 12) return false;

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return day <= 31;
        } else if(month == 2) {
            if(year % 4 != 0) {
                return day <= 28;
            } else if(year % 100 != 0) {
                return day <= 29;
            } else if(year % 400 != 0) {
                return day <= 28;
            } else {
                return day <= 29;
            }
        } else {
            return day <= 30;
        }
    }

}
