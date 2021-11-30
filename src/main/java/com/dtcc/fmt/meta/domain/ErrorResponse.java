package com.dtcc.fmt.meta.domain;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ErrorResponse {
    private Map<String, String> errors = new HashMap<>();

    public ErrorResponse addError(String key, String value) {
        errors.put(key, value);
        return this;
    }
}
