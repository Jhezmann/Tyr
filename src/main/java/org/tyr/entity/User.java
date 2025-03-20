package org.tyr.entity;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "user")
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String regMobile;
    private String role;
    private String status;
}
