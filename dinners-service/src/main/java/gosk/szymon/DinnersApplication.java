package gosk.szymon;

import gosk.szymon.models.ClassLevel;
import gosk.szymon.models.ClassType;
import gosk.szymon.models.Date;
import gosk.szymon.models.Person;
import gosk.szymon.repositories.DinnerRepository;
import gosk.szymon.repositories.PersonRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DinnersApplication {

    private static final Logger log = LogManager.getLogger(DinnersApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(DinnersApplication.class, args);
    }

    @Bean
    public CommandLineRunner inject(PersonRepository pr, DinnerRepository dr) {
        return (args) -> {
            Person p = new Person(1, "Szymon", "Gosk", ClassType.HIGH_SCHOOL, ClassLevel.A1);
            pr.save(p);
        };
    }

}
