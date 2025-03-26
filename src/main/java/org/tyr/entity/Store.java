package org.tyr.entity;

import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Table(schema = "store")
@Data
public class Store {
    private int id;
    private String name;
    private String location;
    private String phoneNumber;
    private String email;
    private int userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
