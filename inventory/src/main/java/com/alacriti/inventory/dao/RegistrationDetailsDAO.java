package com.alacriti.inventory.dao;	

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.alacriti.inventory.models.RegistrationDetailsModel;



public class RegistrationDetailsDAO {
		
	
	public static final Logger log= Logger.getLogger(RegistrationDetailsDAO.class);

		
		

		public int addRegistraionDetails(Connection connection,RegistrationDetailsModel p[])
		{
			
				int noOfRecordsUpdated=0;			
				PreparedStatement preparedStatement=null;
				try
				{
					
					
					
					preparedStatement=connection.prepareStatement
							("insert into sivaprasadt_Inventory_loginDetails values(?,?,?,?,?);");
					int n=0;
					for(int i=0;i<(p.length);i++)
					{
						preparedStatement.setString(1, p[i].userName);
						preparedStatement.setString(2, p[i].password);
						preparedStatement.setString(3, p[i].firstName);
						preparedStatement.setString(4, p[i].lastName);	
						preparedStatement.setString(5, p[i].emailId);	
						n=preparedStatement.executeUpdate();
						noOfRecordsUpdated +=n;
					}
					
					
				} 
				catch(SQLException sqle)
				{
					
					log.error(" SQL Exception Details ::getAllInventoryItemsDAO"+sqle);
					return 0;
					
				}
				catch (Exception e) 
				{
					
					log.error("Ecxeption Details  :addDataToLoginDetailsDAO"+e);
					return 0;
					
					
				} 
				
				return noOfRecordsUpdated;
				
		}
		
		
		

		public List<RegistrationDetailsModel> getAllRegistrationDetails(Connection connection)
		{
			
			Statement statement = null;
			ResultSet result = null;
			List<RegistrationDetailsModel> list=null;
			try 
			{				
				
				statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_UPDATABLE);
				
				result = statement.executeQuery("select * from sivaprasadt_Inventory_loginDetails;");
				
				list=new ArrayList<RegistrationDetailsModel>();
				
				while (result.next()) 
				{
					
					list.add(new RegistrationDetailsModel(result.getString(1),
							result.getString(2),result.getString(3),result.getString(4),
							result.getString(5)));
					
				}
				
			} 
			catch(SQLException sqle)
			{
				
				log.error(" SQL Exception Details ::getAllRegistrationDetails"+sqle);
				return list;
				
			}
			catch (Exception e)
			{
				
				
				log.error("Ecxeption Details  :getAllRegistrationDetails"+e);
				
				
			} 
			return list;
			
		}
		
		
		public int updateRegistrationDetails(Connection connection,RegistrationDetailsModel[] p)
		{			
				int noOfRecordsUpdated=0;		
				PreparedStatement preparedStatement=null;
				try 
				{					
					preparedStatement=connection.prepareStatement
							("update sivaprasadt_Inventory_loginDetails set Password=?,"
									+ "FirstName=?,LastName=?,EmailId=? where UserName=?;" );
					
					for(int i=0;i<(p.length);i++)
					{
						
						preparedStatement.setString(1, p[i].password);
						preparedStatement.setString(2, p[i].firstName);
						preparedStatement.setString(3, p[i].lastName);
						preparedStatement.setString(4, p[i].emailId);
						preparedStatement.setString(5, p[i].userName);
										
						noOfRecordsUpdated +=preparedStatement.executeUpdate();
						
					}
	
				} 
				catch(SQLException sqle)
				{
					
					log.error(" SQL Exception Details ::updateRegistrationDetails "+sqle);
					
					
				}
				catch (Exception e) 
				{
					
					log.error("Ecxeption Details  :updateRegistrationDetails "+e);
					
					
				}
				
				return noOfRecordsUpdated;
		}

		public int removeRegistrationDetails(Connection connection,String p)
		{
			  	int noOfRecordsEffected=0;
				
				
				PreparedStatement preparedStatement=null;
				try 
				{
										
					preparedStatement=connection.prepareStatement
							("delete from sivaprasadt_Inventory_loginDetails where UserName=?;");
					
					preparedStatement.setString(1, p);
					noOfRecordsEffected +=preparedStatement.executeUpdate();
					
					
				} 
				catch(SQLException sqle)
				{
					
					log.error(" SQL Exception Details ::removeRegistrationDetails "+sqle);
					
				}
				catch (Exception e) 
				{
					
					log.error("Ecxeption Details  :removeRegistrationDetails "+e);
					
					
				} 
				
				return noOfRecordsEffected;
		}	
}

				
				

				

				
				
				
				
				
				
				
				
				
		




		
		
		
		




