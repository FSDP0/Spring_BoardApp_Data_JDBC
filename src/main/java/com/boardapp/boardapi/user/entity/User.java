package com.boardapp.boardapi.user.entity;

import org.springframework.data.relational.core.mapping.Table;
import lombok.Getter;

@Table(name = "user")
@Getter
public class User {
    private Long id;
    private String userId;
    private String userName;
    private String userPassword;
    private String userPhone;
    private String userAddress;
}
