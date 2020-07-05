package com.wipro.promotionservice.controller;

import com.wipro.promotionservice.entity.Customer;
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
    public Customer getPromotionByCustomerId(@PathVariable int customerId){

        return customerService.getPromotionByCustomerId(customerId);
    }

    @PostMapping("/promotion/customer")
    @ResponseStatus(value= HttpStatus.ACCEPTED)
    public void addPromotionToCustomerId(@RequestBody Customer customer){

        customerService.addPromotionToCustomerByCustomerId(customer);

    }

    @PostMapping("/promotion/newCustomer")
    @ResponseStatus(value= HttpStatus.ACCEPTED)
    public void addNewCustomer(@RequestBody Customer customer){

        customerService.addNewCustomer(customer);

    }

    @PostMapping("/promotion/appliedPromotionCode")
    @ResponseStatus(value= HttpStatus.ACCEPTED)
    public void updateAppliedPromotionCode(@RequestBody Customer customer){

        customerService.updateNewCustomer(customer);

    }

    @DeleteMapping("/promotion/customer/{customerId}")
    public void deleteCustomerById(@PathVariable int customerId){

        customerService.deleteCustomerbyId(customerId);

    }
}
