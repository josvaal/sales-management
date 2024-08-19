package com.josval.sales_management.service.impl;

import com.josval.sales_management.model.dao.UserDAO;
import com.josval.sales_management.model.dto.UserDTO;
import com.josval.sales_management.model.entity.User;
import com.josval.sales_management.service.IUserService;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserImplService implements IUserService {
    @Autowired
    private UserDAO userDao;

    @Transactional(readOnly = true)
    @Override
    public List<User> listAll() {
        return (List<User>) userDao.findAll();
    }

    @Transactional
    @Override
    public User save(UserDTO userDto) {
        StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
        String passwordEncrypted = passwordEncryptor.encryptPassword(userDto.getPassword());

        User user = User.builder()
                .id(userDto.getId())
                .name(userDto.getName())
                .lastname(userDto.getLastname())
                .role(userDto.getRole())
                .email(userDto.getEmail())
                .password(passwordEncrypted)
                .build();
        return userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User findById(Integer id) {
        return userDao.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email).orElse(null);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public boolean existsById(Integer id) {
        return userDao.existsById(id);
    }
}
