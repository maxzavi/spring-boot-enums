package pe.maxz.demoenums;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.maxz.demoenums.model.People;
import pe.maxz.demoenums.model.PeopleGender;
import pe.maxz.demoenums.model.PeopleStatus;

@SpringBootApplication
public class DemoenumsApplication implements CommandLineRunner {
	//Logger
	private final static Logger LOG = LoggerFactory.getLogger(DemoenumsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoenumsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Start ..");
		People people = new People();
		people.setName("Juan");
		people.setLastname("Perez");
		people.setGender(PeopleGender.MALE);
		people.setStatus(PeopleStatus.LIVE);
		LOG.info("People: {}",people);
		LOG.info("Gender {}", people.getGender());
		LOG.info("Gender Code {}", people.getGender().getCode());
		LOG.info("Status {}",  people.getStatus());
		LOG.info("End");
	}

}
