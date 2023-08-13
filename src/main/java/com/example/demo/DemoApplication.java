package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return arg -> {
<<<<<<< HEAD
			//optionally use in addition to or in place of data.sql seeding
=======
			// optionally use in addition to or in place of data.sql seeding
>>>>>>> ca203c395631ba3dfabd5e12a8bb318089701d66
			Customer john = new Customer("John", "Alexander", "07/28/2023");
			customerRepository.save(john);

			Customer jenny = new Customer("Jenny", "Smith", "07/28/2023");
			customerRepository.save(jenny);
<<<<<<< HEAD
			
=======
>>>>>>> ca203c395631ba3dfabd5e12a8bb318089701d66

			// Q: see if you can figure out how to create Order records, next....
			// order table
			// unique id
			// foreign key to the customer record
			// shipped_location column for where the order gets sent to
			// purchase_total for how much the customer spent
			// establish the "relationship" between customer table and orders table
		};
	}


}
