package kr.or.dgit.sw_project.dto;

import java.util.Date;

public class Delivery {
	//소프트웨어 납품
	private String delCode; 
	private String compName;
	private String swName;
	private int supplyPrice;
	private int supplyAmount;
	private Date orderDate;
	private boolean delIsExist;
	
	public Delivery() {}
	
	
	public Delivery(String delCode) {		
		this.delCode = delCode;
	}


	public Delivery(String delCode, String compName, String swName, int supplyPrice, int supplyAmount, Date orderDate,
			boolean delIsExist) {
		
		this.delCode = delCode;
		this.compName = compName;
		this.swName = swName;
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
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getSwName() {
		return swName;
	}

	public void setSwName(String swName) {
		this.swName = swName;
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
		return "Delivery [delCode=" + delCode + ", compName=" + compName + ", swName=" + swName + ", supplyPrice="
				+ supplyPrice + ", supplyAmount=" + supplyAmount + ", orderDate=" + orderDate + ", delIsExist="
				+ delIsExist + "]";
	}
	
	
	
	
	
	
	
	
}
