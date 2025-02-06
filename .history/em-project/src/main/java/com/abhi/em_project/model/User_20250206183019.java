package com.abhi.em_project.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    // @NotBlank(message = "Name is required")
    // private String name;

    // @Email(message = "Invalid email format")
    // @Column(unique = true)
    // private String email;

    // @NotBlank(message = "Password cannot be empty")
    // private String password;
    @not

}