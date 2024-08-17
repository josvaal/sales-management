package com.josval.sales_management.service.impl;

import com.josval.sales_management.model.dao.SaleDAO;
import com.josval.sales_management.model.dto.SaleDTO;
import com.josval.sales_management.model.entity.Sale;
import com.josval.sales_management.service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class SaleImplService implements ISaleService {
    @Autowired
    private SaleDAO saleDao;

    @Transactional(readOnly = true)
    @Override
    public List<Sale> listAll() {
        return (List<Sale>) saleDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Sale> listAllByUserId(Integer userId) {
        return saleDao.findAllByUserId(userId);
    }

    @Transactional
    @Override
    public Sale save(SaleDTO saleDto) {
        Sale sale = Sale.builder()
                .id(saleDto.getId())
                .createdDate(saleDto.getCreatedDate())
                .description(saleDto.getDescription())
                .amount(saleDto.getAmount())
                .user(saleDto.getUser())
                .build();
        return saleDao.save(sale);
    }

    @Transactional(readOnly = true)
    @Override
    public Sale findById(Integer id) {
        return saleDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Sale sale) {
        saleDao.delete(sale);
    }

    @Override
    public boolean existsById(Integer id) {
        return saleDao.existsById(id);
    }
}
