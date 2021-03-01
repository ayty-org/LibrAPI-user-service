package com.ghostdovahkiin.librapi.userservice.user.services;

import com.ghostdovahkiin.librapi.userservice.user.User;
import com.ghostdovahkiin.librapi.userservice.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ListUserServiceImpl implements ListUserService {

    private final UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
