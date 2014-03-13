package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.TextField;
import java.awt.Scrollbar;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class AppMain extends JFrame implements ActionListener{
	
	private JComboBox JCombo_TourName;
	private JLabel JLabel_Price;
	private JLabel JLabel_Length;
	private JButton JButton_Book;
	private JTextArea JTextArea_Description;




	/**
	 * Create the frame.
	 */
	public AppMain() {
		init();



	
		}





	private void init() {
		
		setTitle("Back Packing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel JPanel_North = new JPanel();
		getContentPane().add(JPanel_North, BorderLayout.NORTH);
		
		JCombo_TourName = new JComboBox();
		JCombo_TourName.setSelectedIndex(-1);
		JCombo_TourName.setMaximumRowCount(20);
		JPanel_North.add(JCombo_TourName);
		
		JPanel JPanel_South = new JPanel();
		getContentPane().add(JPanel_South, BorderLayout.SOUTH);
		JPanel_South.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 5));
		
		JLabel_Price = new JLabel("Price:");
		JPanel_South.add(JLabel_Price);
		
		JLabel_Length = new JLabel("Length:");
		JPanel_South.add(JLabel_Length);
		
		JButton_Book = new JButton("Book Now!");
		JPanel_South.add(JButton_Book);
		
		JScrollPane JScrollPane_Center = new JScrollPane();
		JScrollPane_Center.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		getContentPane().add(JScrollPane_Center, BorderLayout.CENTER);
		
		JTextArea_Description = new JTextArea();
		JTextArea_Description.setRows(10);
		JScrollPane_Center.setViewportView(JTextArea_Description);
		
	};

		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
