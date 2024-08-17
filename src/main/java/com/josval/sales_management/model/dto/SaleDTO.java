package com.josval.sales_management.model.dto;

import com.josval.sales_management.model.entity.User;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@Builder
public class SaleDTO implements Serializable {
    private Integer id;
    private Date createdDate;
    private String description;
    private Integer amount;
    private User user;
}
