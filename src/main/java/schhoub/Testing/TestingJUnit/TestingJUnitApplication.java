package schhoub.Testing.TestingJUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import schhoub.Testing.TestingJUnit.DTOs.UsersDto;
import schhoub.Testing.TestingJUnit.model.Users;
import schhoub.Testing.TestingJUnit.service.UserServiceImpl;

@SpringBootApplication
public class TestingJUnitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingJUnitApplication.class, args);
	}

	@Bean
	CommandLineRunner  start(UserServiceImpl userService){
		return args -> {
			// boucle pour ajouter des utilisateur a mon table user
			for (int i = 0; i < 10; i++) {
				UsersDto user = UsersDto.builder()
						.username("salahe eddeine"+i)
						.email("salahechhoub"+i+"@gmail.com")
						.password("password"+i)
						.build();
				userService.save(user);

			}
			// affiche les utilisateur à une liste
			userService.getAllUsers().stream().toList().forEach(System.out::println);
		};
	}

}
