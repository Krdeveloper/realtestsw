package kr.or.dgit.sw_project.connection;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.sw_project.dao.DeliveryMapper;
import kr.or.dgit.sw_project.dto.Delivery;

public class DeliveryMapperImpl implements DeliveryMapper {
	private static final Log log = LogFactory.getLog(DeliveryMapperImpl.class);
	private SqlSession sqlSession;
	private String namespace = "kr.or.dgit.sw_project.dao.DeliveryMapper.";	


	public DeliveryMapperImpl(SqlSession sqlSession) {	
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Delivery> selectAllDelivery() {
		log.debug("selectAllDelivery()");
		return sqlSession.selectList(namespace + "selectAllDelivery");
	}

	@Override
	public Delivery findDeliveryByCode(Delivery delivery) {
		log.debug("findDeliveryByCode()");
		return sqlSession.selectOne(namespace + "findDeliveryByCode", delivery);
	}

	@Override
	public int insertDelivery(Delivery delivery) {
		log.debug("insertDelivery()");
		return sqlSession.insert(namespace + "insertDelivery", delivery);
	}

	@Override
	public int deleteLogicallyDelivery(Delivery delivery) {
		log.debug("deleteLogicallyDelivery()");
		return sqlSession.update(namespace + "deleteLogicallyDelivery", delivery);	
	}

}
