package com.tacoloco;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason ="Please enter a positive number")
public class IncorrectAmount extends RuntimeException{
    private static final long serialVersionUID=1L;
}
