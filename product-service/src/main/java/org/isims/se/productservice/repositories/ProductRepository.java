package org.isims.se.productservice.repositories;

import org.isims.se.productservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:9999") // Specify the allowed origins

public interface ProductRepository extends JpaRepository<Product, Integer> {


}
