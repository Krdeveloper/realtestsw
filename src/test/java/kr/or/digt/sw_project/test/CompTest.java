package kr.or.digt.sw_project.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.sw_project.dto.SupplyCompany;
import kr.or.dgit.sw_project.service.SupplyCompanyService;

public class CompTest {
	private static SupplyCompanyService supplyCompanyService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		supplyCompanyService=  new SupplyCompanyService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		supplyCompanyService = null;
	}

	/*@Test
	public void testall() {
		List<SupplyCompany> list  = supplyCompany.selectAllCompany();
		
		
	}*/
	
	@Test
	public void testFindSupplyCompanyByCode() {
		SupplyCompany supplyCompany = new SupplyCompany();
		supplyCompany.setCompCode("SC007");
		SupplyCompany findSupplyCompanyByCode = supplyCompanyService.findSupplyCompanyByCode(supplyCompany);
		Assert.assertNotNull(supplyCompany);
	}
	/*@Test
	public void testInsertSupplyCompany() {
		SupplyCompany supplyCompany = new SupplyCompany("SC002", "testCompany", "testAddr","testTel",false);
		int res = supplyCompanyService.insertSupplyCompany(supplyCompany);
		Assert.assertEquals(1, res);
	}*/
	
	/*@Test
	public void testUpdateSupplyCompany() {
		SupplyCompany supplyCompany = new SupplyCompany("SC007", "aa", "bb","010",false);
		int res = supplyCompanyService.updateSupplyCompany(supplyCompany);
		Assert.assertEquals(1, res);
	}*/
	
	/*@Test
	public void testDeleteLogicallySupplyCompany() {
		SupplyCompany supplyCompany = new SupplyCompany("SC007");
		int res = supplyCompanyService.deleteLogicallySupplyCompany(supplyCompany);
		Assert.assertEquals(1, res);
	}*/
	
	

}
