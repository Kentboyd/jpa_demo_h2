package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "Orders")
@Table(name = "Orders")
public class Orders {
    
    @Id
    @GeneratedValue

    @Column(nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;
    
    

    @Column(nullable = false, columnDefinition = "TEXT")
    private String customer_record;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String shipping_location;

    @Column(nullable = false, columnDefinition = "TEXT")
    private double purchase_total;

    public Orders(){

    };

    public Orders(String customer_record, String shipping_location, double purchase_total){
        this.customer_record = customer_record;
        this.shipping_location = shipping_location;
        this.purchase_total = purchase_total;

    }
}
