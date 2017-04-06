package kr.or.dgit.sw_project;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import erp_myframework.TextFieldPanel;
import kr.or.dgit.sw_project.dto.SupplyCompany;

public class ContentSupplyCompany extends JPanel {
	private JTextField textField;
	private TextFieldPanel tfpSupplyCompanyCode;
	private TextFieldPanel tfpSupplyCompanyName;
	private TextFieldPanel tfpSupplyCompanyTel;
	private TextFieldPanel tfpSupplyCompanyAd;
	public ContentSupplyCompany() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {300, 50, 50};
		gridBagLayout.rowHeights = new int[] {30, 30, 30, 30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		JLabel label = new JLabel("공급회사 관리");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.BOLD, 14));
		
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.HORIZONTAL;
		gbc_label.insets = new Insets(10, 10, 10, 10);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		gbc_label.gridwidth = 2;
		add(label, gbc_label);
		
		
		
		tfpSupplyCompanyCode = new TextFieldPanel();
		tfpSupplyCompanyCode.setTitle("회사번호");
		GridBagConstraints gbc_tfpSupplyCompanyCode = new GridBagConstraints(); 
		gbc_tfpSupplyCompanyCode.fill = GridBagConstraints.HORIZONTAL; 
		gbc_tfpSupplyCompanyCode.insets = new Insets(0, 0, 5, 5);
		gbc_tfpSupplyCompanyCode.gridx = 0;
		gbc_tfpSupplyCompanyCode.gridy = 1;
		add(tfpSupplyCompanyCode, gbc_tfpSupplyCompanyCode);
		
		tfpSupplyCompanyName = new TextFieldPanel();
		tfpSupplyCompanyName.setTitle("회사명");
		GridBagConstraints gbc_tfpSupplyCompanyName = new GridBagConstraints();
		gbc_tfpSupplyCompanyName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpSupplyCompanyName.insets = new Insets(0, 0, 5, 5);
		gbc_tfpSupplyCompanyName.gridx = 0;
		gbc_tfpSupplyCompanyName.gridy = 2;
		add(tfpSupplyCompanyName, gbc_tfpSupplyCompanyName);
		
		tfpSupplyCompanyTel = new TextFieldPanel();
		tfpSupplyCompanyTel.setTitle("전화번호");
		GridBagConstraints gbc_tfpSupplyCompanyTel = new GridBagConstraints();
		gbc_tfpSupplyCompanyTel.insets = new Insets(0, 0, 5, 5);
		gbc_tfpSupplyCompanyTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpSupplyCompanyTel.gridx = 0;
		gbc_tfpSupplyCompanyTel.gridy = 3;
		add(tfpSupplyCompanyTel, gbc_tfpSupplyCompanyTel);
		
		tfpSupplyCompanyAd = new TextFieldPanel();
		tfpSupplyCompanyAd.setTitle("주소");
		GridBagConstraints gbc_tfpSupplyCompanyAd = new GridBagConstraints();
		gbc_tfpSupplyCompanyAd.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpSupplyCompanyAd.insets = new Insets(0, 0, 5, 5);
		gbc_tfpSupplyCompanyAd.gridx = 0;
		gbc_tfpSupplyCompanyAd.gridy = 4;
		add(tfpSupplyCompanyAd, gbc_tfpSupplyCompanyAd);
		
		JButton button = new JButton("우편번호검색");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 4;
		add(button, gbc_button);
		
		TextFieldPanel tfadr= new TextFieldPanel();
		tfadr.setTitle("");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 5;
		add(tfadr, gbc_textField);
		
		
	}
	public SupplyCompany getObject(){
		String supCode = tfpSupplyCompanyCode.getTfValue();
		String supName = tfpSupplyCompanyName.getTfValue();
		String supAddr = tfpSupplyCompanyAd.getTfValue();
		String supTel = tfpSupplyCompanyTel.getTfValue();		
		return new SupplyCompany(supCode, supName, supAddr, supTel, false);
	}
}
