package com.meghaSolution.AduraApp.Controller;

import com.meghaSolution.AduraApp.dto.CustomerDto;
import com.meghaSolution.AduraApp.dto.CustomerType;
import com.meghaSolution.AduraApp.model.Customer;
import com.meghaSolution.AduraApp.service.CustomerServices;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
    CustomerServices customerServices;
    public CustomerController(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }
    public Mono<Customer> updateCustomer(@RequestBody CustomerDto customerDto){
        return customerServices.loadCustomer(customerDto);
    }








}
