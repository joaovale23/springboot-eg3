package br.fatecrl.mvcdemo;

import br.fatecrl.mvcdemo.models.Perifericos;
import br.fatecrl.mvcdemo.repository.PerifericosRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PerifericosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerifericosApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PerifericosRepository repository) {
		return (args) -> {
			repository.save(new Perifericos("Dom Casmurro", "Machado de Assis", "azul", "logi", 18, 50));
		};
	}

}
