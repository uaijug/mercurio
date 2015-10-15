package br.com.uaijug.mercurio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.uaijug.mercurio.model.repository.AccountRepository;

@SpringBootApplication
public class MercurioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MercurioApplication.class, args);
	}

	@Bean
	CommandLineRunner init(final AccountRepository accountRepository) {

		return new CommandLineRunner() {

			@Override
			public void run(String... arg0) throws Exception {
				//accountRepository.save(new Account("root", "root"));
			}

		};

	}

}
