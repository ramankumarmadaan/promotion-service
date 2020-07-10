package com.wipro.promotionservice.repository;

import com.wipro.promotionservice.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    Product findByProductId(Integer productId);

}
