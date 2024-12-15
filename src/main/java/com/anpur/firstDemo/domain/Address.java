package com.anpur.firstDemo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String City;
    private String State;
    private String Country;
    private int areaCode;
}
