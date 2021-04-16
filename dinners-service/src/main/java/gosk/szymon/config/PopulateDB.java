package gosk.szymon.config;

import gosk.szymon.models.ClassLevel;
import gosk.szymon.models.ClassType;
import gosk.szymon.models.Person;
import gosk.szymon.repositories.PersonRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PopulateDB {

    private static final Logger log = LogManager.getLogger(PopulateDB.class.getName());

    @Bean
    CommandLineRunner initDatabase(PersonRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(
                    new Person("Adam", "Kowalski", ClassType.HIGH_SCHOOL, ClassLevel.A3)
            ));
            log.info("Preloading " + repository.save(
                    new Person("Jan", "Nowak", ClassType.MID_SCHOOL, ClassLevel.B2)
            ));
            log.info("Preloading " + repository.save(
                    new Person("Jan", "Nowak", ClassType.EMPLOYEE, ClassLevel.EMPLOYEE)
            ));
        };
    }

}
