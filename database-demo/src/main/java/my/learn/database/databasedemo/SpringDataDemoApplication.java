package my.learn.database.databasedemo;

import my.learn.database.databasedemo.entity.Person;
import my.learn.database.databasedemo.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonSpringDataRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("User id 10001 -> {}", repository.findById(10001));
        logger.info("Inserting -> {}", repository.save(new Person("Tara", "Berlin", new Date())));
        logger.info("Updating 10003 -> {}", repository.save(new Person(10003, "Pieter", "Utrecht", new Date())));
        repository.deleteById(10002);
        logger.info("All users -> {}", repository.findAll());
    }
}
