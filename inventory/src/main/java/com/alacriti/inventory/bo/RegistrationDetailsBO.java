package com.alacriti.inventory.bo;

import java.sql.Connection;
import java.util.List;

import org.apache.log4j.Logger;

import com.alacriti.inventory.dao.RegistrationDetailsDAO;
import com.alacriti.inventory.models.RegistrationDetailsModel;


public class RegistrationDetailsBO {
	
	
	public static final Logger log= Logger.getLogger(RegistrationDetailsBO.class);
	RegistrationDetailsDAO userDAO=null;
	
	
	
	public List<RegistrationDetailsModel> getAllRegistrationDetails(Connection connection)
	{
		
		List<RegistrationDetailsModel> list=null;
		try
		{
			userDAO=new RegistrationDetailsDAO();
			list=userDAO.getAllRegistrationDetails(connection);
			
		}
		catch(Exception e)
		{
			
			log.error("Exception details :getAllRegistrationDetails :"+e);
			
		}
		return list;
	}
	
	
	public int addRegistrationDetails(Connection connection,RegistrationDetailsModel p[])
	{	
		
		int noOfRecordsUpdated=0;
		try
		{
			
			userDAO=new RegistrationDetailsDAO();
			noOfRecordsUpdated +=userDAO.addRegistraionDetails(connection, p);
			
			
		}
		catch(Exception e)
		{
			
			log.error("Exception details :addRegistrationDetails :"+e);
			return 0;
			
		}
		return noOfRecordsUpdated;
	
	}
	
	
	public int updateRegistrationDetails(Connection connection,RegistrationDetailsModel[] p)
	{
		int noOfRecordsUpdated=0;
		try
		{
			
			userDAO=new RegistrationDetailsDAO();
			noOfRecordsUpdated +=userDAO.updateRegistrationDetails(connection, p);
			
			
		}
		catch(Exception e)
		{
			
			log.error("Exception details :updateRegistrationDetails :"+e);
			
		}
		return noOfRecordsUpdated;
	}
	
	
	public int removeRegistrationDetails(Connection connection,String p)
	{
		int noOfRecordsEffected=0;
		try
		{
			
			userDAO=new RegistrationDetailsDAO();
			noOfRecordsEffected +=userDAO.removeRegistrationDetails(connection, p);
			
			
		}
		catch(Exception e)
		{
			
			log.error("Exception details :deleteDataFromLoginDetailsBO :"+e);
			
		}
		return noOfRecordsEffected;
	}
	
	

}
