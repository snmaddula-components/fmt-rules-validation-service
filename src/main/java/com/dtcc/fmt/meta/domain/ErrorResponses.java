package com.dtcc.fmt.meta.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ErrorResponses {

    List<ErrorResponse> errors = new ArrayList<>();

    public ErrorResponses addErrorResponse(ErrorResponse errorResponse) {
        errors.add(errorResponse);
        return this;
    }
}
