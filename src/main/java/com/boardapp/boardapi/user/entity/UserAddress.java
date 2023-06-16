package com.boardapp.boardapi.user.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Getter;

@Table(name = "user_zipcode")
@Getter
public class UserAddress {
    @Id
    private String userId;
    private String userAddress;
    private String userZipCode;
}
