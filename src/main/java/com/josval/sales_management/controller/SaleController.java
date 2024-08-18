package com.josval.sales_management.controller;

import com.josval.sales_management.model.dto.SaleDTO;
import com.josval.sales_management.model.entity.Sale;
import com.josval.sales_management.model.payload.MessageResponse;
import com.josval.sales_management.service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class SaleController {

  @Autowired
  private ISaleService saleService;

  @GetMapping("sales")
  public ResponseEntity<?> showAll() {
    List<Sale> getSales = saleService.listAll();
    if (getSales == null) {
      return new ResponseEntity<>(MessageResponse.builder()
          .message("No records found")
          .object(null)
          .build(),
          HttpStatus.OK
      );
    }
    return new ResponseEntity<>(MessageResponse.builder()
        .message("Success")
        .object(getSales)
        .build(),
        HttpStatus.OK
    );
  }

  @GetMapping("sales/user/{id}")
  public ResponseEntity<?> showAllByUserId(@PathVariable Integer id) {
    List<Sale> getSales = saleService.listAllByUserId(id);
    if (getSales == null) {
      return new ResponseEntity<>(MessageResponse.builder()
          .message("No records found")
          .object(null)
          .build(),
          HttpStatus.OK
      );
    }
    return new ResponseEntity<>(MessageResponse.builder()
        .message("Success")
        .object(getSales)
        .build(),
        HttpStatus.OK
    );
  }

  @PostMapping("sale")
  public ResponseEntity<?> create(@RequestBody SaleDTO saleDto) {
    Sale saleSave = null;
    try {
      saleSave = saleService.save(saleDto);
      return new ResponseEntity<>(MessageResponse.builder()
          .message("Save successfully")
          .object(SaleDTO.builder()
              .id(saleSave.getId())
              .createdDate(saleSave.getCreatedDate())
              .description(saleSave.getDescription())
              .amount(saleSave.getAmount())
              .user(saleSave.getUser())
          )
          .build(),
          HttpStatus.CREATED
      );
    } catch (DataAccessException e) {
      return new ResponseEntity<>(MessageResponse.builder()
          .message(e.getMessage())
          .object(null)
          .build(),
          HttpStatus.METHOD_NOT_ALLOWED
      );
    }
  }

  @PatchMapping("sale")
  public ResponseEntity<?> update(@RequestBody SaleDTO saleDto){
    Sale saleUpdate = null;
    try {
      if(!(saleService.existsById(saleDto.getId()))){
        return new ResponseEntity<>(MessageResponse.builder()
            .message("This user was not found")
            .object(null)
            .build(),
            HttpStatus.NOT_FOUND
        );
      }
      saleUpdate = saleService.save(saleDto);
      return new ResponseEntity<>(MessageResponse.builder()
          .message("Update successfully")
          .object(SaleDTO.builder()
              .id(saleUpdate.getId())
              .createdDate(saleUpdate.getCreatedDate())
              .description(saleUpdate.getDescription())
              .amount(saleUpdate.getAmount())
              .user(saleUpdate.getUser())
              .build()
          )
          .build(),
          HttpStatus.CREATED
      );
    } catch (DataAccessException e) {

      return new ResponseEntity<>(MessageResponse.builder()
          .message(e.getMessage())
          .object(null)
          .build(),
          HttpStatus.METHOD_NOT_ALLOWED
      );
    }
  }

  @DeleteMapping("sale/{id}")
  public ResponseEntity<?> delete(@PathVariable Integer id){
    try {
      Sale saleDelete = saleService.findById(id);
      saleService.delete(saleDelete);
      return new ResponseEntity<>(saleDelete, HttpStatus.NO_CONTENT);
    } catch (DataAccessException e){
      return new ResponseEntity<>(MessageResponse.builder()
          .message(e.getMessage())
          .object(null)
          .build(),
          HttpStatus.METHOD_NOT_ALLOWED
      );
    }
  }

  @GetMapping("sale/{id}")
  public ResponseEntity<?> showById(@PathVariable Integer id){
    Sale sale = saleService.findById(id);
    if(sale == null){
      return new ResponseEntity<>(MessageResponse.builder()
          .message("This sale was not found")
          .object(null)
          .build(),
          HttpStatus.NOT_FOUND
      );
    }
    return new ResponseEntity<>(MessageResponse.builder()
        .message("Success")
        .object(SaleDTO.builder()
            .id(sale.getId())
            .createdDate(sale.getCreatedDate())
            .description(sale.getDescription())
            .amount(sale.getAmount())
            .user(sale.getUser())
            .build()
        )
        .build(),
        HttpStatus.OK
    );
  }
}
