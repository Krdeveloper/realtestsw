package kr.or.dgit.sw_project.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.sw_project.connection.DeliveryMapperImpl;
import kr.or.dgit.sw_project.connection.MybatisSqlSessionFactory;

import kr.or.dgit.sw_project.dao.DeliveryMapper;

import kr.or.dgit.sw_project.dto.Delivery;






public class DeliveryService {
	public List<Delivery> selectAllDelivery() {
		try (SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion()) {
			DeliveryMapper deliveryMapper = new DeliveryMapperImpl(sqlsession);
			return deliveryMapper.selectAllDelivery();
		}
	}
	public Delivery findDeliveryByCode(Delivery delivery) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.opensesstion()) {
			DeliveryMapper deliveryMapper = new DeliveryMapperImpl(sqlSession);
			return deliveryMapper.findDeliveryByCode(delivery);
		}
	}
	public int insertDelivery (Delivery delivery) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.opensesstion()) {
			DeliveryMapper deliveryMapper = new DeliveryMapperImpl(sqlSession);
			int res = deliveryMapper.insertDelivery(delivery);
			sqlSession.commit();
			return res;
		}
	}
	
	public int deleteLogicallyDelivery (Delivery delivery) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.opensesstion()) {
			DeliveryMapper deliveryMapper = new DeliveryMapperImpl(sqlSession);
			int res = deliveryMapper.deleteLogicallyDelivery(delivery);
			sqlSession.commit();
			return res;
		}
	}
}
