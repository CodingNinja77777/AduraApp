package com.meghaSolution.AduraApp.model;

import com.meghaSolution.AduraApp.dto.Country;
import com.meghaSolution.AduraApp.dto.CustomerDto;
import com.meghaSolution.AduraApp.dto.CustomerType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Customer {
    private String customerName;
    @Id
    private Long customerId;
    private Country country;

    private CustomerType customerType;

    public Customer(Long customerId, String customerName, CustomerDto customerDto, CustomerType goldType) {
    }
}
