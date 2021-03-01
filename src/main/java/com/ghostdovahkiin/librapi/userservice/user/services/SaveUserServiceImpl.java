package com.ghostdovahkiin.librapi.userservice.user.services;

import com.ghostdovahkiin.librapi.userservice.exceptions.UserAlreadyExistsException;
import com.ghostdovahkiin.librapi.userservice.user.User;
import com.ghostdovahkiin.librapi.userservice.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SaveUserServiceImpl implements SaveUserService{
    private final UserRepository userRepository;

    @Override
    public void save(User user) {
        if(userRepository.existsByEmail(user.getEmail()) || userRepository.existsByPhone(user.getPhone())){
            throw new UserAlreadyExistsException();
        }
        userRepository.save(user);
    }
}
