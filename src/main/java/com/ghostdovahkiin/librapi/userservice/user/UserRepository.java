package com.ghostdovahkiin.librapi.userservice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findBySpecificID(String specificID);
    boolean existsByEmail(String email);
    boolean existsByPhone(String phone);
}
