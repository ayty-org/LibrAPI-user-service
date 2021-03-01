package com.ghostdovahkiin.librapi.userservice.user.services;

import com.ghostdovahkiin.librapi.userservice.user.User;

@FunctionalInterface
public interface GetUserService {
    User findById(Long id);
}
