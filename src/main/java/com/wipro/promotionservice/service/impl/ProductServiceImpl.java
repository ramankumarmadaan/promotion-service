package com.wipro.promotionservice.service.impl;

import com.wipro.promotionservice.entity.Product;
import com.wipro.promotionservice.entity.ProductResponse;
import com.wipro.promotionservice.exception.ProductNotFoundException;
import com.wipro.promotionservice.repository.ProductRepository;
import com.wipro.promotionservice.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public ProductResponse getPromotionByProductId(int id) {
        ModelMapper model = new ModelMapper();
        Product product = productRepository.findByProductId(id);
        if (null == product) {
            throw new ProductNotFoundException("Product Not Found with ProductId");
        }
        return model.map(product, ProductResponse.class);

    }

    @Override
    public void addPromotionToProductByProductId(Product product) {
        Product retrievedProduct = productRepository.findByProductId(product.getProductId());
        if (null == retrievedProduct) {
            throw new ProductNotFoundException("Product Not Found with ProductId");
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
        if (null == retrievedProduct) {
            throw new ProductNotFoundException("Product Not Found with ProductId");
        }
        retrievedProduct.setPromotionCode("");
        productRepository.save(retrievedProduct);
    }

    @Override
    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }

}
