package kr.or.dgit.sw_project;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import erp_myframework.CheckBoxPanel;
import erp_myframework.ComboPanel;
import erp_myframework.TextFieldPanel;

public class ContentSupplyCompany extends JPanel {
	private static final String pattern = "dd-MMM-yy";
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public ContentSupplyCompany() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {200, 200,50};
		gridBagLayout.rowHeights = new int[]{50, 50, 50};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		TextFieldPanel tfpSupplyCompanyCode = new TextFieldPanel();
		tfpSupplyCompanyCode.setTitle("회사번호");
		GridBagConstraints gbc_tfpSupplyCompanyCode = new GridBagConstraints(); 
		gbc_tfpSupplyCompanyCode.fill = GridBagConstraints.HORIZONTAL; 
		gbc_tfpSupplyCompanyCode.insets = new Insets(0, 0, 0, 0);
		gbc_tfpSupplyCompanyCode.gridx = 0;
		gbc_tfpSupplyCompanyCode.gridy = 0;
		add(tfpSupplyCompanyCode, gbc_tfpSupplyCompanyCode);
		
		TextFieldPanel tfpSupplyCompanyName = new TextFieldPanel();
		tfpSupplyCompanyName.setTitle("회사명");
		GridBagConstraints gbc_tfpSupplyCompanyName = new GridBagConstraints();
		gbc_tfpSupplyCompanyName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpSupplyCompanyName.insets = new Insets(0, 0, 0, 0);
		gbc_tfpSupplyCompanyName.gridx = 1;
		gbc_tfpSupplyCompanyName.gridy = 0;
		add(tfpSupplyCompanyName, gbc_tfpSupplyCompanyName);
		
		TextFieldPanel tfpSupplyCompanyAddr = new TextFieldPanel();
		tfpSupplyCompanyAddr.setTitle("주소");
		GridBagConstraints gbc_tfpSupplyCompanyAddr = new GridBagConstraints();
		gbc_tfpSupplyCompanyAddr.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpSupplyCompanyAddr.insets = new Insets(0, 0, 0, 0);
		gbc_tfpSupplyCompanyAddr.gridx = 0;
		gbc_tfpSupplyCompanyAddr.gridy = 1;
		add(tfpSupplyCompanyAddr, gbc_tfpSupplyCompanyAddr);
		
		TextFieldPanel tfpSupplyCompanyTel = new TextFieldPanel();
		tfpSupplyCompanyTel.setTitle("전화번호");
		GridBagConstraints gbc_tfpSupplyCompanyTel = new GridBagConstraints();
		gbc_tfpSupplyCompanyTel.insets = new Insets(0, 0, 0, 0);
		gbc_tfpSupplyCompanyTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpSupplyCompanyTel.gridx = 1;
		gbc_tfpSupplyCompanyTel.gridy = 1;
		add(tfpSupplyCompanyTel, gbc_tfpSupplyCompanyTel);
		
		
		
		
	}
}
