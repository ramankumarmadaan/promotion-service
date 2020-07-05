package com.wipro.promotionservice.service.impl;

import com.wipro.promotionservice.entity.Customer;
import com.wipro.promotionservice.entity.Product;
import com.wipro.promotionservice.exception.CustomerNotFoundException;
import com.wipro.promotionservice.repository.ProductRepository;
import com.wipro.promotionservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public Product getPromotionByProductId(int id) {
        return productRepository.findByProductId(id);
    }

    @Override
    public void addPromotionToProductByProductId(Product product) {
        Product retrievedProduct = productRepository.findByProductId(product.getProductId());
        if(null == retrievedProduct) {
            throw new CustomerNotFoundException("Customer Not Found with CustomerId:"+ product.getProductId());
        }
        retrievedProduct.setPromotionCode(product.getPromotionCode());
        productRepository.save(retrievedProduct);
    }

    @Override
    public void addNewProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateNewProduct(Product product) {
        Product retrievedProduct = productRepository.findByProductId(product.getProductId());
        if(null == retrievedProduct) {
            throw new CustomerNotFoundException("Customer Not Found with CustomerId:"+ product.getProductId());
        }
        retrievedProduct.setPromotionCode("");
        productRepository.save(retrievedProduct);
    }

    @Override
    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }

}
