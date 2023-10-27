package com.ruvindi.aad.payment_service.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Response {
    private HttpStatus state;
    public String massage;
    public Object data;
}
