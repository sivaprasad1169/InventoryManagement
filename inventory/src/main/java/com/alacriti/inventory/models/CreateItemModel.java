package com.alacriti.inventory.models;

public class CreateItemModel {
	
	public String itemName,updatedBy;
	public int itemQuantity;
	public CreateItemModel()
	{
		
	}
	public CreateItemModel(String itemName, int itemQuantity,String updatedBy) {
		super();
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.updatedBy=updatedBy;
	}
	
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	

}
