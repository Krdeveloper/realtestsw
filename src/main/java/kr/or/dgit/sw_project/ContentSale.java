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

public class ContentSale extends JPanel {
	private static final String pattern = "dd-MMM-yy";
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public ContentSale() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {200, 200,50};
		gridBagLayout.rowHeights = new int[]{50, 50, 50};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		TextFieldPanel tfpSaleCode = new TextFieldPanel();
		tfpSaleCode.setTitle("주문번호");
		GridBagConstraints gbc_tfpSaleCode = new GridBagConstraints(); 
		gbc_tfpSaleCode.fill = GridBagConstraints.HORIZONTAL; 
		gbc_tfpSaleCode.insets = new Insets(0, 0, 0, 0);
		gbc_tfpSaleCode.gridx = 0;
		gbc_tfpSaleCode.gridy = 0;
		add(tfpSaleCode, gbc_tfpSaleCode);
		
		ComboPanel tfpSwName = new ComboPanel();
		tfpSwName.setTitle("품목명");
		GridBagConstraints gbc_tfpSwName = new GridBagConstraints();
		gbc_tfpSwName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpSwName.insets = new Insets(0, 0, 0, 0);
		gbc_tfpSwName.gridx = 1;
		gbc_tfpSwName.gridy = 0;
		add(tfpSwName, gbc_tfpSwName);
		
		TextFieldPanel tfpSaleAmount = new TextFieldPanel();
		tfpSaleAmount.setTitle("주문수량");
		GridBagConstraints gbc_tfpSaleAmount = new GridBagConstraints();
		gbc_tfpSaleAmount.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpSaleAmount.insets = new Insets(0, 0, 0, 0);
		gbc_tfpSaleAmount.gridx = 0;
		gbc_tfpSaleAmount.gridy = 1;
		add(tfpSaleAmount, gbc_tfpSaleAmount);
		
		ComboPanel tfpClntName = new ComboPanel();
		tfpClntName.setTitle("고객상호명");
		GridBagConstraints gbc_tfpClntName = new GridBagConstraints();
		gbc_tfpClntName.insets = new Insets(0, 0, 0, 0);
		gbc_tfpClntName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpClntName.gridx = 1;
		gbc_tfpClntName.gridy = 1;
		add(tfpClntName, gbc_tfpClntName);
		
		TextFieldPanel tfpOrderDate = new TextFieldPanel();
		tfpOrderDate.setTitle("주문일자");
		GridBagConstraints gbc_tfpOrderDate = new GridBagConstraints();
		gbc_tfpOrderDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpOrderDate.insets = new Insets(0, 0, 0, 0);
		gbc_tfpOrderDate.gridx = 0;
		gbc_tfpOrderDate.gridy = 2;
		add(tfpOrderDate, gbc_tfpOrderDate);
		
		CheckBoxPanel tfpIsExist = new CheckBoxPanel();
		tfpIsExist.setTitle("입금여부");
		GridBagConstraints gbc_tfpIsExist = new GridBagConstraints();
		gbc_tfpIsExist.insets = new Insets(0, 0, 0, 0);
		gbc_tfpIsExist.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpIsExist.gridx = 1;
		gbc_tfpIsExist.gridy = 2;
		add(tfpIsExist, gbc_tfpIsExist);
		
		JRadioButton rdbtnDeposit = new JRadioButton("입금");
		buttonGroup.add(rdbtnDeposit);
		tfpIsExist.getpValue().add(rdbtnDeposit);
		
		JRadioButton rdbtnNotDeposit = new JRadioButton("미입금");
		buttonGroup.add(rdbtnNotDeposit);
		tfpIsExist.getpValue().add(rdbtnNotDeposit);
	}
}
