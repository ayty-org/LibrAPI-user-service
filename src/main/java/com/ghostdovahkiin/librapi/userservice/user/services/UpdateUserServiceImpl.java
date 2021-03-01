package com.ghostdovahkiin.librapi.userservice.user.services;

import com.ghostdovahkiin.librapi.userservice.exceptions.UserNotFoundException;
import com.ghostdovahkiin.librapi.userservice.user.User;
import com.ghostdovahkiin.librapi.userservice.user.UserDTO;
import com.ghostdovahkiin.librapi.userservice.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UpdateUserServiceImpl implements UpdateUserService{
    private final UserRepository userRepository;

    @Override
    public void update(UserDTO user, Long id) {
        User userFound = userRepository.findById(id).orElseThrow(UserNotFoundException::new);

        userFound.setName(user.getName());
        userFound.setAge(user.getAge());
        userFound.setPhone(user.getPhone());
        userFound.setEmail(user.getEmail());
        userFound.setSex(user.getSex());

        userRepository.save(userFound);
    }
}
