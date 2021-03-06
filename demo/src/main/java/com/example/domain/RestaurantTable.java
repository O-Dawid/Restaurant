package com.example.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @Getter
    @Setter
    private int sits = 0;
    @Getter
    @Setter
    private boolean occupied = false;

    @Getter
    @Setter
    @ManyToOne
	@JoinColumn(name="restaurant_id")
    private Restaurant restaurant;


    @Getter
    @Setter
    @UpdateTimestamp
    private LocalDateTime lastTimeStamp;



    public RestaurantTable(int sits, boolean occupied) {
        this.sits = sits;
        this.occupied = occupied;
    }





}