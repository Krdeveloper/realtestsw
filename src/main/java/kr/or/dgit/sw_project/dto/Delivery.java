package kr.or.dgit.sw_project.dto;

import java.util.Date;

public class Delivery {
	//소프트웨어 납품
	private String delCode; 
	private String compCode;
	private String swCode;
	private int supplyPrice;
	private int supplyAmount;
	private Date orderDate;
	private boolean delIsExist;
	
	public Delivery() {}
	
	
	public Delivery(String delCode) {		
		this.delCode = delCode;
	}


	public Delivery(String delCode, String compCode, String swCode, int supplyPrice, int supplyAmount, Date orderDate,
			boolean delIsExist) {
		
		this.delCode = delCode;
		this.compCode = compCode;
		this.swCode = swCode;
		this.supplyPrice = supplyPrice;
		this.supplyAmount = supplyAmount;
		this.orderDate = orderDate;
		this.delIsExist = delIsExist;
	}

	public String getDelCode() {
		return delCode;
	}

	public void setDelCode(String delCode) {
		this.delCode = delCode;
	}

	public String getCompName() {
		return compCode;
	}

	public void setCompName(String compName) {
		this.compCode = compName;
	}

	public String getSwName() {
		return swCode;
	}

	public void setSwName(String swCode) {
		this.swCode = swCode;
	}

	public int getSupplyPrice() {
		return supplyPrice;
	}

	public void setSupplyPrice(int supplyPrice) {
		this.supplyPrice = supplyPrice;
	}

	public int getSupplyAmount() {
		return supplyAmount;
	}

	public void setSupplyAmount(int supplyAmount) {
		this.supplyAmount = supplyAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public boolean isDelIsExist() {
		return delIsExist;
	}

	public void setDelIsExist(boolean delIsExist) {
		this.delIsExist = delIsExist;
	}

	@Override
	public String toString() {
		return "Delivery [delCode=" + delCode + ", compCode=" + compCode + ", swCode=" + swCode + ", supplyPrice="
				+ supplyPrice + ", supplyAmount=" + supplyAmount + ", orderDate=" + orderDate + ", delIsExist="
				+ delIsExist + "]";
	}
	
	
	
	
	
	
	
	
}
