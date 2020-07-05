package com.wipro.promotionservice.service;

import com.wipro.promotionservice.entity.Product;

public interface ProductService {

  Product getPromotionByProductId(int id);

  void addPromotionToProductByProductId(Product product);

  void addNewProduct(Product product);

  void updateNewProduct(Product product);

  void deleteProductById(Integer id);

}
