import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTable;
//import java.awt.BorderLayout;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class calculator {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnmin;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnmun;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btndiv;
	private JButton btnback;
	private JButton btncut;
	private JButton btnpercent;
	private JButton btnplus;
	private JButton btn0;
	private JButton btndec;
	private JButton btnplusmin;
	private JButton btnequal;
	//protected AbstractButton txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String opern;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 274, 273);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 0, 268, 0);
		frame.getContentPane().add(table);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 12, 246, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText()+btn7.getText();
				textField.setText(EnterNumber );
			}
		});
		btn7.setBounds(12, 58, 45, 25);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent f) {
				String EnterNumber1= textField.getText()+btn8.getText();
				textField.setText(EnterNumber1);
			}
		});
		btn8.setBounds(69, 58, 42, 25);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				String EnterNumber2= textField.getText()+btn9.getText();
				textField.setText(EnterNumber2 );
			}
		});
		btn9.setBounds(123, 58, 42, 25);
		frame.getContentPane().add(btn9);
		
		btnmin = new JButton("-");
		btnmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				opern="-";
			}
		});
		
		btnmin.setBounds(177, 58, 79, 25);
		frame.getContentPane().add(btnmin);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText()+btn4.getText();
				textField.setText(EnterNumber );
			}
		});
		btn4.setBounds(12, 95, 45, 25);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText()+btn5.getText();
				textField.setText(EnterNumber );
			}
		});
		btn5.setBounds(66, 95, 45, 25);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText()+btn6.getText();
				textField.setText(EnterNumber );
			}
		});
		btn6.setBounds(123, 95, 42, 25);
		frame.getContentPane().add(btn6);
		
		btnmun = new JButton("*");
		btnmun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				opern="*";
			}
		});
		btnmun.setBounds(177, 95, 79, 25);
		frame.getContentPane().add(btnmun);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText()+btn1.getText();
				textField.setText(EnterNumber );
			}
		});
		btn1.setBounds(12, 132, 45, 25);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText()+btn2.getText();
				//String EnterNumber1="";
				textField.setText(EnterNumber );
				if(textField.getText().length()>1) {
					textField.setText("");
				}
			
			}
			
		});
		btn2.setBounds(69, 132, 45, 25);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText()+btn3.getText();
				textField.setText(EnterNumber );
			}
		});
		btn3.setBounds(123, 132, 45, 25);
		frame.getContentPane().add(btn3);
		
		btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				opern="/";
			}
		});
		btndiv.setBounds(177, 132, 79, 25);
		frame.getContentPane().add(btndiv);
		
		btnback = new JButton("<");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
				StringBuilder str0=new StringBuilder(textField.getText());
				str0.deleteCharAt(textField.getText().length()-1);
				backspace=str0.toString();
				textField.setText(backspace);
				}
			}
		});
		btnback.setBounds(12, 166, 45, 25);
		frame.getContentPane().add(btnback);
		
		btncut = new JButton("C");
		btncut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String EnterNumber= textField.getText()+btncut.getText();
				textField.setText(null);
			}
		});
		btncut.setBounds(69, 166, 45, 25);
		frame.getContentPane().add(btncut);
		
		
		btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				opern="%";
			}
		});
		btnpercent.setFont(new Font("ariel",Font.PLAIN,10));
		btnpercent.setBounds(123, 166, 45, 25);
		frame.getContentPane().add(btnpercent);
		
		btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				//String m=Double.toString(num);
				textField.setText("+");
				opern="+";
			}
		});
		btnplus.setBounds(177, 166, 79, 25);
		frame.getContentPane().add(btnplus);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText()+btn0.getText();
				textField.setText(EnterNumber );
			}
		});
		btn0.setBounds(12, 203, 45, 25);
		frame.getContentPane().add(btn0);

		
		btndec = new JButton(".");
		btndec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText()+btndec.getText();
				textField.setText(EnterNumber );
			}
		});
		btndec.setBounds(69, 203, 45, 25);
		frame.getContentPane().add(btndec);
		
		btnplusmin = new JButton("+-");
		btnplusmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText()+btnplusmin.getText();
				textField.setText(EnterNumber );
			}
		});
		btnplusmin.setFont(new Font("ariel",Font.PLAIN,8));
		btnplusmin.setBounds(123, 203, 45, 25);
		frame.getContentPane().add(btnplusmin);
		
		btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				secondnum=Double.parseDouble(textField.getText());
				if(opern=="+") {
					result=firstnum+secondnum;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(opern=="-") {
					result=firstnum-secondnum;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(opern=="/") {
					result=firstnum/secondnum;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(opern=="*") {
					result=firstnum*secondnum;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				
			}
		});
		btnequal.setBounds(177, 203, 79, 25);
		frame.getContentPane().add(btnequal);
		
	}
}
