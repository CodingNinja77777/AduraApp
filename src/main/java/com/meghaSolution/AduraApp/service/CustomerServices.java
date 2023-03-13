package com.meghaSolution.AduraApp.service;

import com.meghaSolution.AduraApp.Exceptions.CustomerIDNotFoundException;
import com.meghaSolution.AduraApp.dto.CustomerDto;
import com.meghaSolution.AduraApp.model.Customer;
import reactor.core.publisher.Mono;

public interface CustomerServices {
    CustomerDto customerGetById() throws CustomerIDNotFoundException;
    Mono<Customer> loadCustomer(CustomerDto customerDto) ;
}
