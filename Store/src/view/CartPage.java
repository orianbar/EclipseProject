package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import model.Size;
import model.DressType;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class CartPage extends Screen {
	private JTable table;
	private JTable table_1;
	private JTextField TotalPrice;

	/**
	 * Create the panel.
	 */
	public CartPage() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cart");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(102, 0, 302, 36);
		getContentPane().add(lblNewLabel);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swap(3);
			}
		});
		btnCancel.setBounds(102, 450, 102, 29);
		getContentPane().add(btnCancel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(73, 49, 508, 381);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setBounds(156, 14, 232, 16);
		getContentPane().add(lblNewLabel_2);
		
		table_1 = new JTable();
		table_1.setBounds(0, 0, 508, 112);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_1.setBackground(Color.LIGHT_GRAY);
        
        String[] arrSplit = Supervisor.getcart().split("#");
        int j=0;
        if(!arrSplit[0].equalsIgnoreCase("")) //Is cart NOT empty?
        {
        for (String strTemp : arrSplit){
        	j++;
        }
        
        String tbl[][]=new String[j][3];
        String[] help;
        int index=0;
        
        DefaultTableModel model = new DefaultTableModel();
        Object[] columnName1 = {"Product Id"};
        Object[] columnName2 = {"Count"};
        Object[] columnName3 = {"Price"};
        model.addColumn(columnName1);
        model.addColumn(columnName2);
        model.addColumn(columnName3);
        double ttprice=0;
        for (String strTemp : arrSplit){
        	help=strTemp.split("-");
        	tbl[index][0]=help[0];
        	tbl[index][1]=help[1];
        	tbl[index][2]=help[2];
        	Object[] row = { tbl[index][0], tbl[index][1], tbl[index][2]};
        	model.addRow(row);
        	ttprice = ttprice + Double.parseDouble(help[2]);
        }
        table_1.setModel(model);
        panel.add(table_1);
        
        TotalPrice = new JTextField();
        TotalPrice.setEditable(false);
        TotalPrice.setBounds(425, 447, 116, 22);
        getContentPane().add(TotalPrice);
        TotalPrice.setColumns(10);
        TotalPrice.setText(String.valueOf(ttprice*Supervisor.getdisc()));
        JLabel lblNewLabel_1 = new JLabel("Total Price:");
        lblNewLabel_1.setBounds(351, 450, 66, 16);
        getContentPane().add(lblNewLabel_1);
       
        
        JButton btnNewButton = new JButton("Pay now.");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		JOptionPane.showMessageDialog(null, "Thank you for shopping!");
        		Swap(3);
        	}
        });
        btnNewButton.setBounds(430, 505, 97, 25);
        getContentPane().add(btnNewButton);
        
        double disc=Supervisor.getdisc();
        if(disc==1)
        {
        	lblNewLabel_2.setText("No discount");
        }
        else if(disc==0.7)
        {
        	lblNewLabel_2.setText("30% worker discount");
        }
        else if(disc==0.9)
        {
        	lblNewLabel_2.setText("10% member discount");
        }
        
        
        }//Cart if end

	}
}
