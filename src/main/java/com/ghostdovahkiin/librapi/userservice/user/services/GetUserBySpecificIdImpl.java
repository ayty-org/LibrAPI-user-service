package com.ghostdovahkiin.librapi.userservice.user.services;

import com.ghostdovahkiin.librapi.userservice.user.User;
import com.ghostdovahkiin.librapi.userservice.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetUserBySpecificIdImpl implements GetUserBySpecificId{
    private final UserRepository userRepository;

    @Override
    public User findBySpecificId(String uuid) {
        return userRepository.findBySpecificID(uuid);
    }
}
