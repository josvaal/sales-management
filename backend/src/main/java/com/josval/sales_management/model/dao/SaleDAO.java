package com.josval.sales_management.model.dao;

import com.josval.sales_management.model.entity.Sale;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SaleDAO extends CrudRepository<Sale, Integer> {
    List<Sale> findAllByUserId(Integer userId);
}
