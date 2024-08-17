package com.josval.sales_management.service;

import com.josval.sales_management.model.dto.SaleDTO;
import com.josval.sales_management.model.entity.Sale;

import java.util.List;

public interface ISaleService {
    List<Sale> listAll();
    Sale save(SaleDTO sale);
    Sale findById(Integer id);
    void delete(Sale sale);
    boolean existsById(Integer id);
}
