package com.ghostdovahkiin.librapi.userservice.user.services;

import com.ghostdovahkiin.librapi.userservice.user.User;

import java.util.List;

@FunctionalInterface
public interface ListUserService {
    List<User> findAll();
}
