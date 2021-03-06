package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class RestaurantTableDto {
    @Getter
    @Setter
    Long userId;
    @Getter
    @Setter
    Long tableId;
}