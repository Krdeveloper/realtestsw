package kr.or.dgit.sw_project.dto;

public class SupplyCompany {
	//공급회사
	private String compCode;
	private String compName;
	private String compAddr;
	private String compTel;
	private boolean compIsExist;
	
	public SupplyCompany() {}
	
	

	public SupplyCompany(String compCode) {
		super();
		this.compCode = compCode;
	}



	public SupplyCompany(String compCode, String compName, String compAddr, String compTel, boolean compIsExist) {
		
		this.compCode = compCode;
		this.compName = compName;
		this.compAddr = compAddr;
		this.compTel = compTel;
		this.compIsExist = compIsExist;
	}

	public String getCompCode() {
		return compCode;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getCompAddr() {
		return compAddr;
	}

	public void setCompAddr(String compAddr) {
		this.compAddr = compAddr;
	}

	public String getCompTel() {
		return compTel;
	}

	public void setCompTel(String compTel) {
		this.compTel = compTel;
	}

	public boolean isCompIsExist() {
		return compIsExist;
	}

	public void setCompIsExist(boolean compIsExist) {
		this.compIsExist = compIsExist;
	}

	@Override
	public String toString() {
		return String.format("SupplyCompany [compCode=%s, compName=%s, compAddr=%s, compTel=%s, compIsExist=%s]",
				compCode, compName, compAddr, compTel, compIsExist);
	}
	public Object[] toArray() {
		return new Object[]{compCode, compName, compAddr, compTel, compIsExist};
	}
}
