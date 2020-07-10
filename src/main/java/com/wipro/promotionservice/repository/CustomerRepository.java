package com.wipro.promotionservice.repository;

import com.wipro.promotionservice.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Customer findByCustomerId(Integer customerId);
}
