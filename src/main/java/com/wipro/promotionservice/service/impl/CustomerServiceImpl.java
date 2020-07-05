package com.wipro.promotionservice.service.impl;

import com.wipro.promotionservice.entity.Customer;
import com.wipro.promotionservice.exception.CustomerNotFoundException;
import com.wipro.promotionservice.repository.CustomerRepository;
import com.wipro.promotionservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public Customer getPromotionByCustomerId(int id) {
        return customerRepository.findByCustomerId(id);

    }

    @Override
    public void addNewCustomer(Customer customer) {
          customerRepository.save(customer);
    }


    @Override
    public void addPromotionToCustomerByCustomerId(Customer customer) {
        Customer retrievedCustomer = customerRepository.findByCustomerId(customer.getCustomerId());
        if(null == retrievedCustomer) {
            throw new CustomerNotFoundException("Customer Not Found with CustomerId:"+ customer.getCustomerId());
        }
        retrievedCustomer.setPromotionCode(customer.getPromotionCode());
        customerRepository.save(retrievedCustomer);
    }


    @Override
    public void updateNewCustomer(Customer customer) {
        Customer retrievedCustomer = customerRepository.findByCustomerId(customer.getCustomerId());
        if(null == retrievedCustomer) {
            throw new CustomerNotFoundException("Customer Not Found with CustomerId:"+ customer.getCustomerId());
        }
        retrievedCustomer.setPromotionCode("");
        customerRepository.save(retrievedCustomer);
    }

    @Override
    public void deleteCustomerbyId(Integer id) {
        customerRepository.deleteById(id);
    }
}
