package com.hikart.model;

public class ProductsData {
	   private int productId;
	   private String productName ;
	   private int categoryID;
	   private int subCatID;
	   private String categoryName;
	   private String subCategoryName;
	
	   
	   
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public int getSubCatID() {
		return subCatID;
	}
	public void setSubCatID(int subCatID) {
		this.subCatID = subCatID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	   
	   
}