package com.alacriti.inventory.bo;

import java.sql.Connection;
import java.util.List;

import org.apache.log4j.Logger;

import com.alacriti.inventory.dao.InventoryItemsDAO;
import com.alacriti.inventory.models.AvailableItemsModel;
import com.alacriti.inventory.models.CreateItemModel;
import com.alacriti.inventory.models.DeleteItemModel;
import com.alacriti.inventory.models.SortAndSearchModel;
import com.alacriti.inventory.models.UpdateItemModel;

public class InventoryItemsBO {
	
	
	
	
	public static final Logger log= Logger.getLogger(InventoryItemsBO.class);
	InventoryItemsDAO inventoryItemsDAO=null;
	
	
	
	public List<AvailableItemsModel> getAllInventoryItemsFromDetails(Connection connection)
	{
		List<AvailableItemsModel> list=null;
		try
		{
			
			inventoryItemsDAO=new InventoryItemsDAO();
			list=inventoryItemsDAO.getAllInventoryItemsFromDetails(connection);
			
		}
		catch(Exception e)
		{
			
			log.error("Exception Details: getAllInventoryItemsFromDetails "+e);
			
		}
		return list;
	}
	
	
	
	public List<AvailableItemsModel> getAllInventoryItemsFromDetailsBySortAndSearch(Connection connection,SortAndSearchModel p)
	{
		
		List<AvailableItemsModel> list=null;
		try
		{
			
			inventoryItemsDAO=new InventoryItemsDAO();
			list=inventoryItemsDAO.getAllItemsFromDetailsBySortAndSearch(connection, p);
			
		}
		catch(Exception e)
		{
			
			log.error("Exception Details: getAllInventoryItemsFromDetailsBySortAndSearch "+e);
			
		}
		return list;
	}
	
	
	
	public int addItemsToDetails(Connection connection,CreateItemModel p[])
	{
		int noOfRecordsPosted=0;
		try
		{
			inventoryItemsDAO=new InventoryItemsDAO();
			noOfRecordsPosted=inventoryItemsDAO.addItemsToDetails(connection, p);
			
		}
		catch(Exception e)
		{
			
			log.error("Exception Details: addItemsToDetails "+e);
			
		}
		return noOfRecordsPosted;
		
	}
	
	
	
	
	public int updateItemsInDetails(Connection connection,UpdateItemModel p[])
	{
		int noOfRecordsUpdated=0;
		try
		{
			
			inventoryItemsDAO=new InventoryItemsDAO();
			noOfRecordsUpdated=inventoryItemsDAO.updateItemsInDetails(connection, p);
			
			
		}
		catch(Exception e)
		{
			
			log.error("Exception Details: updateItemsInDetails"+e);
			
		}
		
		return noOfRecordsUpdated;
	
	}
	
	
	
	public int deleteItemsInDetails(Connection connection,DeleteItemModel d)
	{
		int noOfRecordsUpdated=0;
		try
		{
			
			inventoryItemsDAO=new InventoryItemsDAO();
			noOfRecordsUpdated=inventoryItemsDAO.deleteItemFromDetails(connection, d);
			
		}
		catch(Exception e)
		{
			
			log.error("Exception Details: deleteItemsInDetails "+e);
			
		}
		return noOfRecordsUpdated;
	}

}
