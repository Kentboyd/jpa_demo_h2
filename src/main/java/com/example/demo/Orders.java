package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "Orders")
@Table(name = "Orders")
public class Orders {
    
    @Id
    @GeneratedValue

    private long id;

    private String shipping_location;

    private Float purchase_total;
}
