package com.bit_etland.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class CustomerDTO {
	private String  customerID, customerName, password, ssn, phone,
					photo, city, address, postalcode, count ;

}
