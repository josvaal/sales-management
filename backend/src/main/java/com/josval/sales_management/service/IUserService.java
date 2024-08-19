package com.josval.sales_management.service;

import com.josval.sales_management.model.dto.UserDTO;
import com.josval.sales_management.model.entity.User;

import java.util.List;

public interface IUserService {
    List<User> listAll();
    User save(UserDTO user);
    User findById(Integer id);
    User findByEmail(String email);
    void delete(User user);
    boolean existsById(Integer id);
}
