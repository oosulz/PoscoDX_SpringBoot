package ex01;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // 어노테이션인데 어노테이션이 달려있는 어노테이션? - 메타 어노테이션
public class ExApplication {

	@Bean
	public Map<?, ?> myMap() {
		return Map.of("greetings", "hello");
	}

	public static void main(String[] args) {
		/*
		 * ConfigurableApplicationContext ac = null; try { ac =
		 * SpringApplication.run(ExApplication.class, args);
		 * System.out.println(ac.getBean("myMap", Map.class).get("greetings")); } catch
		 * (Exception ignored) {
		 * 
		 * } finally { ac.close(); }
		 */
		
		try(ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args)){
			System.out.println(ac.getBean("myMap", Map.class).get("greetings"));
		}
	}
}
