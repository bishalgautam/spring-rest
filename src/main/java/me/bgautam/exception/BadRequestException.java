package me.bgautam.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by bishalgautam on 6/21/17.
 */

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends  RuntimeException {

    public BadRequestException(String message){
        super(message);
    }
}
