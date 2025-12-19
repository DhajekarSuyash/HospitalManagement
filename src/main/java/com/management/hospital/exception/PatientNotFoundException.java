package com.management.hospital.exception;

//user defined exception
public class PatientNotFoundException extends RuntimeException
{

    public PatientNotFoundException(String msg){
        super(msg);
    }

}
