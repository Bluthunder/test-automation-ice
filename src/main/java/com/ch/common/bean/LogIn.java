package com.ch.common.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class LogIn {
	
	    String email            = "";

	    String password         = "";
	    private  static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 

	    public LogIn(String[] data)
	    {
	        email = data[0];
	        password = data[1];
	    }

	    

	    public static String randomNumber()
	    {
	        Date date = new Date();
	        DateFormat df = new SimpleDateFormat("ddmmMMss");
	        String str = df.format(date);
	        return str;
	    }
	    
	    
	    public static void main(String[] args) {
			String randomNumber = randomNumber();
			LOGGER.info(randomNumber); 
		}


	    public String getEmail()
	    {
	        return email;
	    }

	    public void setEmail(String email)
	    {
	        this.email = email;
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
