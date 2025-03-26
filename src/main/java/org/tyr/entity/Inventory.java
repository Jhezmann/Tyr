package org.tyr.entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(schema = "inventory")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Inventory {
    private int id;
    private int storeId;
    private String productName;
    private int quantity;
    private double price;
}
