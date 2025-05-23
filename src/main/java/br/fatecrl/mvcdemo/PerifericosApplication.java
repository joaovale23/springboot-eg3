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
			repository.save(new Perifericos("Mouse", "Um mouse leve e de fácil adaptação, com uma ampla gama de configurações", "preto", "Tera", "/images/mouse.jpg", 18f, 500f));
			repository.save(new Perifericos("Teclado", "Teclado mecânico de 70% de tamanho, de aço e bluetooth", "branco", "Rex", "/images/teclado.jpg", 56f, 2.300f));
		};
	}

}
