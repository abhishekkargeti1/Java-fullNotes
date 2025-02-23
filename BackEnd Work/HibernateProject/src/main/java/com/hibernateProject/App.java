package com.hibernateProject;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import com.Dao.DetailsDao;
import com.entity.Address;
import com.entity.EmployeeStatus;
import com.entity.details;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DetailsDao dao = new DetailsDao();
    	Address address = new Address("Police Gali","Delhi","India");
    	
    	details d = new details("Abhishek",70000,new Date(),"Abhishek is Software Engineer",EmployeeStatus.Active,address,Arrays.asList("MCDO","BTS"));
    	
    }
}
