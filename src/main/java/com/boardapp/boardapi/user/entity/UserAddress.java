package com.boardapp.boardapi.user.entity;

import org.springframework.data.relational.core.mapping.Table;
import lombok.Getter;

@Table(name = "user_zipcode")
@Getter
public class UserAddress {
    private String userId;
    private String userAddress;
    private String userZipCode;
}
