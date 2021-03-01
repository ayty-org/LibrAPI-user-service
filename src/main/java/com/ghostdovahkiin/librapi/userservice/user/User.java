package com.ghostdovahkiin.librapi.userservice.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder(builderClassName = "Builder")
public class User implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1485457345872034987L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "specific_id")
    private String specificID = UUID.randomUUID().toString();

    private String name;

    private int age;

    private String phone;

    private String email;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    public static User to(UserDTO dto) {
        return User
                .builder()
                .specificID(dto.getSpecificID())
                .name(dto.getName())
                .age(dto.getAge())
                .phone(dto.getPhone())
                .email(dto.getEmail())
                .sex(dto.getSex())
                .build();
    }
}
