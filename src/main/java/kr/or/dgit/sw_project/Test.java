package kr.or.dgit.sw_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import kr.or.dgit.sw_project.dto.SupplyCompany;
import kr.or.dgit.sw_project.service.SupplyCompanyService;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private JButton btnTest;
	private List<SupplyCompany> lists;
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnTest = new JButton("New button");
		btnTest.addActionListener(this);
		panel.add(btnTest);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnTest) {
			actionPerformedBtnTest(arg0);
		}
	}
	protected void actionPerformedBtnTest(ActionEvent arg0) {
		SupplyCompanyService service = new SupplyCompanyService();
		List<SupplyCompany> li = service.selectAllCompany();
		setSize(li.size());
		setLists(li);
		loadTable();
	}
	private void loadTable() {
		// TODO Auto-generated method stub
		
		table.setModel(new DefaultTableModel(getObject(),getColumn()));
	}
	public Object[] getColumn(){
		return new String[] {"1","2","3","4","5"};
	}
	public Object[][] getObject(){
		Object[][] datas = new Object[size][];
		for(int i=0 ; i<size ; i++){
			datas[i] = lists.get(i).toArray();
		}
		return datas;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setLists(List<SupplyCompany> lists) {
		this.lists = lists;
	}
	
}
