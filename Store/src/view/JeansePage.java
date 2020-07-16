package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
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
import model.PantsType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JeansePage extends Screen {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public JeansePage() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jeanses Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(150, 11, 119, 36);
		getContentPane().add(lblNewLabel);
		
		JLabel lblType = new JLabel("Length");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType.setBounds(34, 86, 61, 36);
		getContentPane().add(lblType);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSize.setBounds(34, 50, 61, 36);
		getContentPane().add(lblSize);
		
		JLabel lblType_1_1 = new JLabel("Color");
		lblType_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType_1_1.setBounds(34, 126, 61, 36);
		getContentPane().add(lblType_1_1);
		
		JLabel lblType_1_1_1 = new JLabel("Price");
		lblType_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType_1_1_1.setBounds(34, 236, 61, 36);
		getContentPane().add(lblType_1_1_1);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(115, 244, 124, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Add to shoping cart");
		btnNewButton.setBounds(162, 291, 193, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantity.setBounds(34, 197, 76, 36);
		getContentPane().add(lblQuantity);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(126, 208, 43, 20);
		getContentPane().add(spinner);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Yellow", "Black", "Blue", "White", "Pink", "Red", "Gray"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(115, 133, 119, 22);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(Size.values()));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(115, 93, 119, 22);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Long", "7/8"}));
		comboBox_1_1.setSelectedIndex(0);
		comboBox_1_1.setEditable(true);
		comboBox_1_1.setBounds(115, 57, 119, 22);
		getContentPane().add(comboBox_1_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Doli1991\\eclipse-workspace\\Store\\img\\Home.png"));
		btnNewButton_1.setBounds(380, 11, 60, 42);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblType_1_1_2 = new JLabel("Type");
		lblType_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType_1_1_2.setBounds(34, 173, 61, 23);
		getContentPane().add(lblType_1_1_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(PantsType.values()));
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(115, 170, 141, 22);
		getContentPane().add(comboBox_2);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swap(3);
			}
		});
		btnNewButton_2.setBounds(15, 288, 115, 29);
		getContentPane().add(btnNewButton_2);

	}
}
