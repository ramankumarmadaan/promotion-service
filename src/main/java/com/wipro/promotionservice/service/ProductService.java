package com.wipro.promotionservice.service;

import com.wipro.promotionservice.entity.Product;
import com.wipro.promotionservice.entity.ProductResponse;

public interface ProductService {

  ProductResponse getPromotionByProductId(int id);

  void addPromotionToProductByProductId(Product product);

  void addNewProduct(Product product);

  void updateNewProduct(Product product);

  void deleteProductById(Integer id);

}
