package com.ruvindi.aad.travel_service.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Response {
    private String state;
    private String massage;
    private String data;
}
