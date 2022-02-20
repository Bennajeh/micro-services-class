package ma.ahmed.productsapp.repositories;

import ma.ahmed.productsapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
