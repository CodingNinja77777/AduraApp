package com.meghaSolution.AduraApp.repository;

import com.meghaSolution.AduraApp.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface CustomerRepository extends ReactiveCrudRepository<Customer,Long> {
    Mono<Customer> loadGovtCustomer(Customer customer);
}
