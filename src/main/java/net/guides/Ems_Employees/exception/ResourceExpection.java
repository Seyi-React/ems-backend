package net.guides.Ems_Employees.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceExpection extends RuntimeException {


    public ResourceExpection (String message)  {
        super(message);
    }
    
}
