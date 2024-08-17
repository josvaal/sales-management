package com.josval.sales_management.service;

import com.josval.sales_management.model.dto.SaleDTO;
import com.josval.sales_management.model.entity.Sale;
import com.josval.sales_management.model.entity.User;

import java.util.List;

public interface ISaleService {
    List<Sale> listAll();
    List<Sale> listAllByUserId(Integer id);
    Sale save(SaleDTO sale, User user);
    Sale findById(Integer id);
    void delete(Sale sale);
    boolean existsById(Integer id);
}
