package nl.codecastle;

import nl.codecastle.models.AppUser;
import nl.codecastle.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import javax.annotation.PostConstruct;

@EnableResourceServer
@EnableAuthorizationServer
@SpringBootApplication
public class AuthenticationServerApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationServerApplication.class, args);
	}

	@PostConstruct
	public void addUsers() {
		// curl -X POST -vu acme:acmesecret http://localhost:8080/uaa/oauth/token -H "Accept: application/json" -d
		// "password=programirame&username=userOne&grant_type=password&scope=openid&client_secret=acmesecret&client_id=acme"

		userRepository.save(new AppUser("userOne", "programirame"));
		userRepository.save(new AppUser("userTwo", "programirame"));		
	}
}
