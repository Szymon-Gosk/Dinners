package gosk.szymon;

import gosk.szymon.models.ClassLevel;
import gosk.szymon.models.ClassType;
import gosk.szymon.models.Dinner;
import gosk.szymon.models.DinnerType;
import gosk.szymon.models.Person;
import gosk.szymon.repositories.DinnerRepository;
import gosk.szymon.repositories.PersonRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
public class DinnersApplication {

    private static final Logger log = LogManager.getLogger(DinnersApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(DinnersApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner inject(PersonRepository pr, DinnerRepository dr) {
//        return (args) -> {
//            Person p = new Person(1, "Szymon", "Gosk", ClassType.HIGH_SCHOOL, ClassLevel.A1);
//            pr.save(p);
//
//            Dinner d = new Dinner(1, p, new Date(System.currentTimeMillis()), DinnerType.NORMAL);
//            dr.save(d);
//
//            Dinner dinner = dr.findAll().get(0);
//            System.out.println(dinner.getDate());
//            System.out.println(dinner.getPerson().getClassLevel());
//
//        };
//    }

}
