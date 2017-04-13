package br.com.aps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAsync
@EnableScheduling
@EnableJpaRepositories
@EnableTransactionManagement
@ComponentScan(basePackages = {"br.com.aps"})
@EnableAutoConfiguration
@SpringBootApplication
public class Aps2017Application {

	public static void main(String[] args) {
		SpringApplication.run(Aps2017Application.class, args);
	}
}
