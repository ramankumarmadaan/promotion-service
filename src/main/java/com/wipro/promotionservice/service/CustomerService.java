package com.wipro.promotionservice.service;

import com.wipro.promotionservice.entity.Customer;
import com.wipro.promotionservice.entity.CustomerResponse;

public interface CustomerService {

    CustomerResponse getPromotionByCustomerId(int id);

    void addPromotionToCustomerByCustomerId(Customer customer);

    void addNewCustomer(Customer customer);

    void updateNewCustomer(Customer customer);

    void deleteCustomerbyId(Integer id);

}
