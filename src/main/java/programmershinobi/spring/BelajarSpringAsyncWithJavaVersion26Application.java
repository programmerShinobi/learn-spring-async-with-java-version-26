package programmershinobi.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class BelajarSpringAsyncWithJavaVersion26Application {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringAsyncWithJavaVersion26Application.class, args);
	}

}
