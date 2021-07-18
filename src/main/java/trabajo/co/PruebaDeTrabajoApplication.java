package trabajo.co;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PruebaDeTrabajoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaDeTrabajoApplication.class, args);
	}

}
