package com.marcortiz.ledger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LedgerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LedgerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
