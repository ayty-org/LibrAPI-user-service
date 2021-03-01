package com.ghostdovahkiin.librapi.userservice.user.services;

import com.ghostdovahkiin.librapi.userservice.exceptions.UserNotFoundException;
import com.ghostdovahkiin.librapi.userservice.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeleteUserServiceImpl implements DeleteUserService{
    private final UserRepository userRepository;

    @Override
    public void delete(Long id) {
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException();
        }
        userRepository.deleteById(id);
    }
}
