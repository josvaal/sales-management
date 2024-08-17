package com.josval.sales_management.model.dao;

import com.josval.sales_management.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Integer> {
}
