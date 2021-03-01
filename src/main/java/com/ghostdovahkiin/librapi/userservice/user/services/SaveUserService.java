package com.ghostdovahkiin.librapi.userservice.user.services;

import com.ghostdovahkiin.librapi.userservice.user.User;

@FunctionalInterface
public interface SaveUserService {
    void save(User user);
}
