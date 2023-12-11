package ma.enset.inventoryservice;

import ma.enset.inventoryservice.entities.Product;
import ma.enset.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {
			productRepository.save(Product.builder()
							.id(UUID.randomUUID().toString())
							.name("Computer")
							.quantity(12)
							.price(5300)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("PHONE")
					.quantity(10)
					.price(4200)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("TABLET")
					.quantity(6)
					.price(12000)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("PRINTER")
					.quantity(4)
					.price(1200)
					.build());
		};
	}
}
