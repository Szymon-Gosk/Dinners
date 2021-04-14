package gosk.szymon.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Person {

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 128)
    private String name;

    @Column(length = 128)
    private String surname;

    @Enumerated(EnumType.STRING)
    ClassType classType;

    @Enumerated(EnumType.STRING)
    ClassLevel classLevel;

}
