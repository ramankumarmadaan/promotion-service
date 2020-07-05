package com.wipro.promotionservice.service;

import com.wipro.promotionservice.entity.Customer;

public interface CustomerService {

    Customer getPromotionByCustomerId(int id);

    void addPromotionToCustomerByCustomerId(Customer customer);

    void addNewCustomer(Customer customer);

    void updateNewCustomer(Customer customer);

    void deleteCustomerbyId(Integer id);

}
