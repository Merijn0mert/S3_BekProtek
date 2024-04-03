package com.bekprotek.bekprotek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@EntityScan(basePackages = "com.bekprotek.bekprotek.*")
@EnableAsync
@EnableJpaRepositories("com.bekprotek.bekprotek.*")
public class BekprotekApplication {

	public static void main(String[] args) {
		SpringApplication.run(BekprotekApplication.class, args);
	}
	@Bean
   public WebMvcConfigurer corsConfigurer() {
      return new WebMvcConfigurer() {
         @Override
         public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**").allowedOrigins("http://localhost:8080");
         }
      };
   }
/*    @Bean
    public AdressbookService adressbookService(AdressbookDAO repo) {
        return new AdressbookService(repo);
    }*/
}
