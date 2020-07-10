package com.wipro.promotionservice.controller;

import com.wipro.promotionservice.entity.Customer;
import com.wipro.promotionservice.entity.CustomerResponse;
import com.wipro.promotionservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/promotion/customer/{customerId}")
    @ResponseStatus(value= HttpStatus.OK)
    public CustomerResponse getPromotionByCustomerId(@PathVariable int customerId){
        return customerService.getPromotionByCustomerId(customerId);
    }

    @PostMapping("/promotion/customer/updateCustomer")
    @ResponseStatus(value= HttpStatus.ACCEPTED)
    public void updateCustomer(@RequestBody Customer customer){
        customerService.addPromotionToCustomerByCustomerId(customer);
    }

    @PostMapping("/promotion/customer/addCustomer")
    @ResponseStatus(value= HttpStatus.CREATED)
    public void addNewCustomer(@RequestBody Customer customer){
        customerService.addNewCustomer(customer);
    }

    @PostMapping("/promotion/customer/deletePromotionCode")
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void deletePromotionCode(@RequestBody Customer customer){
        customerService.updateNewCustomer(customer);
    }

    @DeleteMapping("/promotion/customer/{customerId}")
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void deleteCustomerById(@PathVariable int customerId){
        customerService.deleteCustomerbyId(customerId);
    }
}
