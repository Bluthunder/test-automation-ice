package com.ch.common.bean;

import java.util.logging.Logger;

public class InvalidLogin
{

    String errormessage  = "";

    String errormessage2 = "";

    String username      = "";

    String password      = "";

    public InvalidLogin(String[] data)
    {

        errormessage = data[0].replace(";", ",") ;
       // errormessage = data[0];
        username = data[1];
        password = data[2];

    }

    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public String getErrormessage()
    {
        return errormessage;
    }

    public void setErrormessage(String errormessage)
    {
        this.errormessage = errormessage;
    }

    public String getErrormessage2()
    {
        return errormessage2;
    }

    public void setErrormessage2(String errormessage2)
    {
        this.errormessage2 = errormessage2;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

}
