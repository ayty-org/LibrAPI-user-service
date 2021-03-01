package com.ghostdovahkiin.librapi.userservice.user.services;

import com.ghostdovahkiin.librapi.userservice.user.UserDTO;

@FunctionalInterface
public interface UpdateUserService {
    void update(UserDTO user, Long id);
}
