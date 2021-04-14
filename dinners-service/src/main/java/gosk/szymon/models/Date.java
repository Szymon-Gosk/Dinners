package gosk.szymon.models;

import gosk.szymon.models.validators.DateAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DateAnnotation
public class Date {

    @Id
    @GeneratedValue
    private long id;

    private int day;

    private int month;

    private int year;

}
