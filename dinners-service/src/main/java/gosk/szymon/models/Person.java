package gosk.szymon.models;

import gosk.szymon.models.validators.PersonAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Contract;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@PersonAnnotation
public class Person {

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 128)
    private String name;

    @Column(length = 128)
    private String surname;

    @Enumerated(EnumType.STRING)
    private ClassType classType;

    @Enumerated(EnumType.STRING)
    private ClassLevel classLevel;

    @Contract(pure = true)
    public Person(String name, String surname, ClassType classType, ClassLevel classLevel) {
        this.name = name;
        this.surname = surname;
        this.classType = classType;
        this.classLevel = classLevel;
    }

}
