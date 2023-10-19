package com.ruvindi.aad.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TravelPackageDTO {
    private int id;
    private String packageName;
    private int starRate;
    private String description;
}
