package kr.or.dgit.sw_project.service;

import org.apache.ibatis.session.SqlSession;


import kr.or.dgit.sw_project.connection.MybatisSqlSessionFactory;
import kr.or.dgit.sw_project.connection.SupplyCompanyMapperImpl;
import kr.or.dgit.sw_project.dao.SupplyCompanyMapper;
import kr.or.dgit.sw_project.dto.SupplyCompany;

public class SupplyCompanyService {
	
	
	/*public List<SupplyCompany> selectAllCompany() {
		try (SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion()) {
			SupplyCompanyMapperImpl comp = new SupplyCompanyMapperImpl(sqlsession);
			return comp.selectAllCompany();
		}
	}*/
	public SupplyCompany findSupplyCompanyByCode(SupplyCompany supplyCompany) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.opensesstion()) {
			SupplyCompanyMapper supplyCompanyMapper = new SupplyCompanyMapperImpl(sqlSession);
			return supplyCompanyMapper.findSupplyCompanyByCode(supplyCompany);
		}
	}
	
	public int insertSupplyCompany (SupplyCompany supplyCompany) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.opensesstion()) {
			SupplyCompanyMapper supplyCompanyMapper = new SupplyCompanyMapperImpl(sqlSession);
			int res = supplyCompanyMapper.insertSupplyCompany(supplyCompany);
			sqlSession.commit();
			return res;
		}
	}
	
	public int updateSupplyCompany (SupplyCompany supplyCompany) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.opensesstion()) {
			SupplyCompanyMapper supplyCompanyMapper = new SupplyCompanyMapperImpl(sqlSession);
			int res = supplyCompanyMapper.updateSupplyCompany(supplyCompany);
			sqlSession.commit();
			return res;
		}
	}
	
	public int deleteLogicallySupplyCompany (SupplyCompany supplyCompany) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.opensesstion()) {
			SupplyCompanyMapper supplyCompanyMapper = new SupplyCompanyMapperImpl(sqlSession);
			int res = supplyCompanyMapper.deleteLogicallySupplyCompany(supplyCompany);
			sqlSession.commit();
			return res;
		}
	}
}
