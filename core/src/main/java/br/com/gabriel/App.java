package br.com.gabriel;

import br.com.gabriel.ecommerce.model.domain.ProductDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        ProductDTO productDTO = new ProductDTO();

        System.out.println(productDTO.test);
    }
}
