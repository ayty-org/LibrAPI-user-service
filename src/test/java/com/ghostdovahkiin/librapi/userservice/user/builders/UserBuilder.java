package com.ghostdovahkiin.librapi.userservice.user.builders;

import com.ghostdovahkiin.librapi.userservice.user.Sex;
import com.ghostdovahkiin.librapi.userservice.user.User;

public class UserBuilder {
    public static User.Builder createUser() {
        return User.builder()
                .id(145485989485039832L)
                .name("Pedro")
                .age(22)
                .phone("+5583986862912")
                .email("pedro.sousa@dcx.ufpb.br")
                .sex(Sex.MALE);
    }
}
