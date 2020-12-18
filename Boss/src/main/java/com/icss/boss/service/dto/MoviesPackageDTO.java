package com.icss.boss.service.dto;

import java.io.Serializable;

public class MoviesPackageDTO  implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	private String  packageName;      
	private double  originalPrice;    
	private boolean IsCanbuy;        
	private String  appServices;      
	private String  description;      
	
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public boolean isIsCanbuy() {
		return IsCanbuy;
	}
	public void setIsCanbuy(boolean isCanbuy) {
		IsCanbuy = isCanbuy;
	}
	public String getAppServices() {
		return appServices;
	}
	public void setAppServices(String appServices) {
		this.appServices = appServices;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
