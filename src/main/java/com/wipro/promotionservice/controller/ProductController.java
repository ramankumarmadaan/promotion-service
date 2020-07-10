package com.wipro.promotionservice.controller;

import com.wipro.promotionservice.entity.Product;
import com.wipro.promotionservice.entity.ProductResponse;
import com.wipro.promotionservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/promotion/product/{productId}")
    @ResponseStatus(value= HttpStatus.OK)
    public ProductResponse getPromotionByProductId(@PathVariable int productId){
        return productService.getPromotionByProductId(productId);
    }

    @PostMapping("/promotion/product/updateProduct")
    @ResponseStatus(value= HttpStatus.ACCEPTED)
    public void updateProduct(@RequestBody Product product){
        productService.addPromotionToProductByProductId(product);
    }

    @PostMapping("/promotion/product/addProduct")
    @ResponseStatus(value= HttpStatus.CREATED)
    public void addNewProduct(@RequestBody Product product){
        productService.addNewProduct(product);
    }

    @PostMapping("/promotion/product/deletePromotionCode")
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void deletePromotionCode(@RequestBody Product product){
        productService.updateNewProduct(product);
    }

    @DeleteMapping("/promotion/product/{customerId}")
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void deleteProductById(@PathVariable int productId){
        productService.deleteProductById(productId);
    }

}
