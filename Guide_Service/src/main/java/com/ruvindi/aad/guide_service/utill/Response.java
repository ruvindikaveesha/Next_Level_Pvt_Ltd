package com.ruvindi.aad.guide_service.utill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Response {
    private String state;
    private String massage;
    private Object data;
}
