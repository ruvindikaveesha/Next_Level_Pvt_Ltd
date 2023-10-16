package com.ruvindi.aad.vehicle_service.utill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class response {
    private String massage;
    private String state;
    private Object data;

}
