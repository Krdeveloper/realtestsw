package kr.or.dgit.sw_project;
import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import kr.or.dgit.sw_project.dto.SupplyCompany;
import kr.or.dgit.sw_project.service.SupplyCompanyService;

public class TableSupplyCompany extends JPanel {
	private JTable table;
	public TableSupplyCompany() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		loadData();
	}
	public void loadData() {
		// TODO Auto-generated method stub
		table.setModel(new DefaultTableModel(getRowData(),getColumn()));
	}
	protected Object[][] getRowData() {	
		SupplyCompanyService service = new SupplyCompanyService();
		List<SupplyCompany> supplyCompany = service.selectAllCompany();
		Object[][] datas = new Object[supplyCompany.size()][];
		for(int i=0; i<datas.length; i++){
			datas[i] = supplyCompany.get(i).toArray();
		}
		return datas;
	}
	protected String[] getColumn(){
		return new String[]{"공급회사번호","공급회사명","공급회사주소","공급회사전화번호","탈퇴여부"};
	}
	
	
}
