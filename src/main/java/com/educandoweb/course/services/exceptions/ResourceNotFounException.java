package com.educandoweb.course.services.exceptions;

public class ResourceNotFounException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFounException(Object id){
        super("Resource not fund. Id: "+id);
    }

}
