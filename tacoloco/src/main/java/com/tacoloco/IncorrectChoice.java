package com.tacoloco;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason = "Please ensure that items are on the menu")
public class IncorrectChoice extends RuntimeException{
        private static final long serialVersionUID=1L;
}
