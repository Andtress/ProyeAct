package com.example.ProyeAct;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProyeActApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyeActApplication.class, args);
	}
        
        private static void loadEnv(){

	Dotenv dotenv = Dotenv.load();
	System.setProperty("DB_URL",dotenv.get("DB_URL"));
	System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
	System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

	}
        

        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }



}
