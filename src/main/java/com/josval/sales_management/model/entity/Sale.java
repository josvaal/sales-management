package com.josval.sales_management.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "sales")
public class Sale implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "description")
    private String description;

    @Column(name = "amount")
    private Integer amount;
}
