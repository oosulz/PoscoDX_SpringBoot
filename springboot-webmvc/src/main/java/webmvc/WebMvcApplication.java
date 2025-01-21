package webmvc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class WebMvcApplication {
	
	@RestController
	public static class MvcController {
		@GetMapping("/hello")
		public String hello() {
			return "hello world";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(WebMvcApplication.class, args);
	}
}
