package com.josval.sales_management.controller;

import com.josval.sales_management.model.dto.UserDTO;
import com.josval.sales_management.model.entity.User;
import com.josval.sales_management.model.payload.MessageResponse;
import com.josval.sales_management.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
  @Autowired
  private IUserService userService;

  @GetMapping("users")
  public ResponseEntity<?> showAll() {
    List<User> getUsers = userService.listAll();
    if (getUsers == null) {
      return new ResponseEntity<>(MessageResponse.builder()
          .message("No records found")
          .object(null)
          .build(),
          HttpStatus.OK
      );
    }
    return new ResponseEntity<>(MessageResponse.builder()
        .message("Success")
        .object(getUsers)
        .build(),
        HttpStatus.OK
    );
  }

  @PostMapping("user")
  public ResponseEntity<?> create(@RequestBody UserDTO userDto) {
    User userSave = null;
    try {
      userSave = userService.save(userDto);
      return new ResponseEntity<>(MessageResponse.builder()
          .message("Save successfully")
          .object(UserDTO.builder()
              .id(userSave.getId())
              .name(userSave.getName())
              .lastname(userSave.getLastname())
              .role(userSave.getRole())
              .email(userSave.getEmail())
              .password(userSave.getPassword())
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

  @PatchMapping("user")
  public ResponseEntity<?> update(@RequestBody UserDTO userDto) {
    User userUpdate = null;
    try {
      if (!(userService.existsById(userDto.getId()))) {
        return new ResponseEntity<>(MessageResponse.builder()
            .message("This user was not found")
            .object(null)
            .build(),
            HttpStatus.NOT_FOUND
        );
      }
      userUpdate = userService.save(userDto);
      return new ResponseEntity<>(MessageResponse.builder()
          .message("Update successfully")
          .object(UserDTO.builder()
              .id(userUpdate.getId())
              .name(userUpdate.getName())
              .lastname(userUpdate.getLastname())
              .role(userUpdate.getRole())
              .email(userUpdate.getEmail())
              .password(userUpdate.getPassword())
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

  @DeleteMapping("user/{id}")
  public ResponseEntity<?> delete(@PathVariable Integer id){
    try {
      User userDelete = userService.findById(id);
      userService.delete(userDelete);
      return new ResponseEntity<>(userDelete, HttpStatus.NO_CONTENT);
    } catch (DataAccessException e){
      return new ResponseEntity<>(MessageResponse.builder()
          .message(e.getMessage())
          .object(null)
          .build(),
          HttpStatus.METHOD_NOT_ALLOWED
      );
    }
  }

  @GetMapping("user/{id}")
  public ResponseEntity<?> showById(@PathVariable Integer id){
    User user = userService.findById(id);
    if(user == null){
      return new ResponseEntity<>(MessageResponse.builder()
          .message("This user was not found")
          .object(null)
          .build(),
          HttpStatus.NOT_FOUND
      );
    }
    return new ResponseEntity<>(MessageResponse.builder()
        .message("Success")
        .object(UserDTO.builder()
            .id(user.getId())
            .name(user.getName())
            .lastname(user.getLastname())
            .role(user.getRole())
            .email(user.getEmail())
            .password(user.getPassword())
            .build()
        )
        .build(),
        HttpStatus.OK
    );
  }
}
