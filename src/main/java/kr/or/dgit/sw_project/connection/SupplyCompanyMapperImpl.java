package kr.or.dgit.sw_project.connection;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.sw_project.dao.SupplyCompanyMapper;
import kr.or.dgit.sw_project.dto.SupplyCompany;

public class SupplyCompanyMapperImpl implements SupplyCompanyMapper {
	private static final Log log = LogFactory.getLog(SupplyCompanyMapperImpl.class);
	private SqlSession sqlSession;
	private String namespace = "kr.or.dgit.sw_project.dao.SupplyCompanyMapper.";

	public SupplyCompanyMapperImpl(SqlSession sqlSession) {

		this.sqlSession = sqlSession;
	}

	/*
	 * @Override public List<SupplyCompany> selectAllCompany() {
	 * log.debug("searchCourse()"); return sqlsession.selectList(namespace
	 * +".selectAllCompany"); }
	 */
	@Override
	public List<SupplyCompany> selectAllCompany() {
		log.debug("selectAllCompany()");
		return sqlSession.selectList(namespace + "selectAllCompany");		
	}
	
	@Override
	public SupplyCompany findSupplyCompanyByCode(SupplyCompany supplyCompany) {
		log.debug("findSupplyCompanyByCode()");
		return sqlSession.selectOne(namespace + "findSupplyCompanyByCode", supplyCompany);
	}
	
	@Override
	public int insertSupplyCompany(SupplyCompany supplyCompany) {
		log.debug("insertSupplyCompany()");
		return sqlSession.insert(namespace + "insertSupplyCompany", supplyCompany);
	}

	@Override
	public int updateSupplyCompany(SupplyCompany supplyCompany) {
		log.debug("updateSupplyCompany()");
		return sqlSession.update(namespace + "updateSupplyCompany", supplyCompany);
	}

	@Override
	public int deleteLogicallySupplyCompany(SupplyCompany supplyCompany) {
		log.debug("deleteLogicallySupplyCompany()");
		return sqlSession.update(namespace + "deleteLogicallySupplyCompany", supplyCompany);		
	}

	

	
}


