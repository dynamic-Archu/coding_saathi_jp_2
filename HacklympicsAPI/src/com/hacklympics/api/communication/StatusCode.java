package com.hacklympics.api.communication;

public enum StatusCode {
    
    SUCCESS,                  //  0
    NETWORK_ERR,              //  1
    JSON_PARSE_ERR,           //  2
    VALIDATION_ERR,           //  3
    INSUFFICIENT_ARGS,        //  4
    
    NOT_LOGGED_IN,            //  5
    NOT_REGISTERED,           //  6
    ALREADY_LOGGED_IN,        //  7
    ALREADY_REGISTERED,       //  8
    
    MATERIAL_DOES_NOT_EXIST,  //  9
    
    INCORRECT_ANSWER,         // 10
    ALREADY_SUBMITTED,        // 11
    
    ALREADY_LAUNCHED,         // 12
    NOT_LAUNCHED,             // 13
    
    ALREADY_ATTENDED,         // 14
    NOT_ATTENDED,             // 15
    
}