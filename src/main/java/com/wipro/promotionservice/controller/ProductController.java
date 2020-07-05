package com.wipro.promotionservice.controller;

import com.wipro.promotionservice.entity.Product;
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
    public Product getPromotionByProductId(@PathVariable int productId){
        return productService.getPromotionByProductId(productId);
    }

    @PostMapping("/promotion/product")
    @ResponseStatus(value= HttpStatus.ACCEPTED)
    public void addPromotionToProductId(@RequestBody Product product){

        productService.addPromotionToProductByProductId(product);

    }

    @PostMapping("/promotion/newproduct")
    @ResponseStatus(value= HttpStatus.ACCEPTED)
    public void addNewProduct(@RequestBody Product product){

        productService.addNewProduct(product);

    }

    @PostMapping("/promotion/product/appliedPromotionCode")
    @ResponseStatus(value= HttpStatus.ACCEPTED)
    public void updateAppliedPromotionCode(@RequestBody Product product){

        productService.updateNewProduct(product);

    }

    @DeleteMapping("/promotion/product/{customerId}")
    public void deleteProductById(@PathVariable int productId){

        productService.deleteProductById(productId);

    }

}
