package kr.or.dgit.sw_project.dao;

import java.util.List;


import kr.or.dgit.sw_project.dto.SupplyCompany;

public interface SupplyCompanyMapper {
	List<SupplyCompany> selectAllCompany(); //전체검색
	SupplyCompany findSupplyCompanyByCode(SupplyCompany supplyCompany);//공급회사코드에 의한 검색
	int insertSupplyCompany(SupplyCompany supplyCompany);
	int updateSupplyCompany(SupplyCompany supplyCompany);
	int deleteLogicallySupplyCompany(SupplyCompany supplyCompany);//comp_isExist
}
