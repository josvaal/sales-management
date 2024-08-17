package com.josval.sales_management.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@Builder
public class UserDTO implements Serializable {
    private Integer id;
    private String name;
    private String lastname;
    private String email;
    private String password;
}
