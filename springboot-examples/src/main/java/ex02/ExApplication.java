package ex02;

import java.util.Map;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import ex02.runner.HelloWorldRunner;

@SpringBootApplication // 어노테이션인데 어노테이션이 달려있는 어노테이션? - 메타 어노테이션
public class ExApplication {

	@Bean
	public Map<?, ?> myMap() {
		return Map.of("greetings", "hello!!!");
	}
	
	@Bean
	public ApplicationRunner applicationRunner() {
		return new HelloWorldRunner(myMap());
	}

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args)){}
	}
	
}
