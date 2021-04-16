package gosk.szymon.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dinner {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(optional = false)
    private Person person;

    private Date date;

    @Enumerated(EnumType.STRING)
    private DinnerType dinnerType;

    public Dinner(Person person, Date date, DinnerType dinnerType) {
        this.person = person;
        this.date = date;
        this.dinnerType = dinnerType;
    }
}
