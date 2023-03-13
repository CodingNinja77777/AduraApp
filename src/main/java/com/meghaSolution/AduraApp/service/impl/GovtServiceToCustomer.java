package com.meghaSolution.AduraApp.service.impl;

import com.meghaSolution.AduraApp.Exceptions.CustomerIDNotFoundException;
import com.meghaSolution.AduraApp.dto.CustomerDto;
import com.meghaSolution.AduraApp.model.Customer;
import com.meghaSolution.AduraApp.repository.CustomerRepository;
import com.meghaSolution.AduraApp.service.CustomerServices;
import reactor.core.publisher.Mono;

public class GovtServiceToCustomer implements CustomerServices {

    CustomerRepository customerRepository;

    public GovtServiceToCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDto customerGetById() throws CustomerIDNotFoundException {
        return null;
    }

    @Override
    public Mono<Customer> loadCustomer(CustomerDto customerDto) {
        Customer customer=new Customer();
        Long customerId=customerDto.getCustomerId();
        String name=customerDto.getCustomerName();
        customer.setCustomerId(customerId);
        customer.setCustomerName(name);
        return customerRepository.loadGovtCustomer(customer);
    }
}
