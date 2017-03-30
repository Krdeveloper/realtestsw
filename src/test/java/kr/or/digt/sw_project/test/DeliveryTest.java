package kr.or.digt.sw_project.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.sw_project.dto.Delivery;
import kr.or.dgit.sw_project.service.DeliveryService;

public class DeliveryTest {
	private static DeliveryService deliveryService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		deliveryService = new DeliveryService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		deliveryService = null;
	}

	@Test
	public void testSelectAllDelivery() {
		List<Delivery> lists  = deliveryService.selectAllDelivery();
		Assert.assertNotNull(lists);		
		for(Delivery delivery : lists){
			Assert.assertNotNull(delivery);			
		}
	}
	@Test
	public void testFindDeliveyByCode() {
		Delivery delivery = new Delivery();
		delivery.setDelCode("DL002");
		Delivery findDeliveyByCode = deliveryService.findDeliveryByCode(delivery);
		Assert.assertNotNull(delivery);
	}

}
