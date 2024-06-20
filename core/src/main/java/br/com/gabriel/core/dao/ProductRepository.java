package br.com.gabriel.core.dao;

import br.com.gabriel.ecommerce.model.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
