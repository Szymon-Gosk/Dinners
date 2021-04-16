package gosk.szymon.models.validators;

import gosk.szymon.models.Person;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PersonValidator implements ConstraintValidator<PersonAnnotation, Person> {

    public void initialize(PersonAnnotation constraintAnnotation) { }

    public boolean isValid(Person person, ConstraintValidatorContext context) {
        if(person == null) return false;
        String name = person.getName();
        String surname = person.getSurname();

        final String regex = "^[a-zA-Z]{2,}$";
        return name.matches(regex) && surname.matches(regex);
    }

}
