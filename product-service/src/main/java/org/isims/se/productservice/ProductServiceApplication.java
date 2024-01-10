package org.isims.se.productservice;


import org.isims.se.productservice.entities.Product;
import org.isims.se.productservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;


@EnableDiscoveryClient
@SpringBootApplication
@CrossOrigin(origins = "http://localhost:9999")

public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return  args ->{
			productRepository.save(new Product(null , "product1","j"));
			productRepository.save(new Product(null , "product2","jj"));
			productRepository.save(new Product(null , "product3","fff"));

		};
	}
}
