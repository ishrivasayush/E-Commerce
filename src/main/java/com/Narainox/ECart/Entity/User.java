package com.Narainox.ECart.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Entity(name = "users")
@Getter
@Setter
@AllArgsConstructor
public class User {
    @Id
    @Column(unique = true,nullable = false)
    private String userName;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private boolean isAdmin;
}
