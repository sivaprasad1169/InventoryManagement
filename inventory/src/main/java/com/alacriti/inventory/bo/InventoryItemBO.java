package com.alacriti.inventory.bo;

import java.sql.Connection;
import java.util.List;

import org.apache.log4j.Logger;

import com.alacriti.inventory.dao.InventoryItemDAO;
import com.alacriti.inventory.models.AvailableItemsModel;
import com.alacriti.inventory.models.ItemDetailsModel;

public class InventoryItemBO {
	
	
	public static final Logger log= Logger.getLogger(InventoryItemsBO.class);
	
	InventoryItemDAO inventoryItemDAO=null;
	
	
	
	
	public AvailableItemsModel getInventoryItemDetailsById(Connection connection,String itemId)
	{
		AvailableItemsModel model=null;
		try
		{
			inventoryItemDAO=new InventoryItemDAO();
			model=inventoryItemDAO.getInventoryItemByID(connection, itemId);
		}
		catch(Exception e)
		{
			log.error("Exception Detials: getInventoryItemDetailsByIdBO "+e);
		}
		return model;
	}
	
	
	
	
	
	public List<ItemDetailsModel> getInventoryItemDetails(Connection connection,String itemId)
	{
		List<ItemDetailsModel> list=null;
		try
		{
			inventoryItemDAO=new InventoryItemDAO();
			list=inventoryItemDAO.getInventoryItemDetails(connection, itemId);
			
		}
		catch(Exception e)
		{
			log.error("ExceptionDetails : getInventoryItemDetailsBO"+e);
		}
		return list;
	}
	
	
	
	public List<ItemDetailsModel> getInventoryItemPurchaseDetails(Connection connection,String itemId)
	{
		List<ItemDetailsModel> list=null;
		try
		{
			inventoryItemDAO=new InventoryItemDAO();
			list=inventoryItemDAO.getInventoryItemPurchaseDetails(connection, itemId);
			
		}
		catch(Exception e)
		{
			log.error("Exception Details: getInventoryItemPurchaseDetailsBO "+e);
		}
		return list;
	}
	
	
	public List<ItemDetailsModel> getInventoryItemConsumeDetails(Connection connection,String itemId)
	{
		List<ItemDetailsModel> list=null;
		try
		{
			inventoryItemDAO=new InventoryItemDAO();
			list=inventoryItemDAO.getInventoryItemConsumeDetails(connection, itemId);
			
		}
		catch(Exception e)
		{
			log.error("Exception Details: getInventoryItemConsumeDetailsBO "+e);
		}
		return list;
	}
	
	

}
