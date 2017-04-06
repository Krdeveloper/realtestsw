package kr.or.dgit.sw_project.dao;

import java.util.List;

import kr.or.dgit.sw_project.dto.Delivery;

public interface DeliveryMapper {
	List<Delivery> selectAllDelivery();
	Delivery findDeliveryByCode(Delivery delivery);
	int insertDelivery(Delivery delivery);
	int deleteLogicallyDelivery(Delivery delivery);
}
