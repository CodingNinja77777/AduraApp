package com.meghaSolution.AduraApp.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CustomerDto {
    private String customerName;
    private Long customerId;
    private Country country;

    private CustomerType customerType;


}
