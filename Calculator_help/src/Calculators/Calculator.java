package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Color;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setFont(new Font("Dialog", Font.PLAIN, 20));
		frmCalculator.setForeground(Color.WHITE);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 293, 416);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 5, 255, 40);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnclr = new JButton("<-");
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace = null;
				if(textField.getText().length()>0){
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnclr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnclr.setBounds(10, 50, 60, 60);
		frmCalculator.getContentPane().add(btnclr);
		
		JButton btnfrsh = new JButton("C");
		btnfrsh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnfrsh.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnfrsh.setBounds(75, 50, 60, 60);
		frmCalculator.getContentPane().add(btnfrsh);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBounds(205, 50, 60, 60);
		frmCalculator.getContentPane().add(btnplus);
		
		JButton btnpercentage = new JButton("%");
		btnpercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		btnpercentage.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpercentage.setBounds(140, 50, 60, 60);
		frmCalculator.getContentPane().add(btnpercentage);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 115, 60, 60);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(75, 115, 60, 60);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(140, 115, 60, 60);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsub.setBounds(205, 115, 60, 60);
		frmCalculator.getContentPane().add(btnsub);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 180, 60, 60);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(75, 180, 60, 60);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(140, 180, 60, 60);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btnmult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmult.setBounds(205, 180, 60, 60);
		frmCalculator.getContentPane().add(btnmult);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 245, 60, 60);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(75, 245, 60, 60);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(140, 245, 60, 60);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndiv.setBounds(205, 245, 60, 60);
		frmCalculator.getContentPane().add(btndiv);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(75, 310, 60, 60);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnpm = new JButton("\u00B1");
		btnpm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnpm.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpm.setBounds(140, 310, 60, 60);
		frmCalculator.getContentPane().add(btnpm);
		
		JButton btneql = new JButton("=");
		btneql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operations=="+"){
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations=="-"){
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations=="*"){
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations=="/"){
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations=="%"){
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btneql.setFont(new Font("Tahoma", Font.BOLD, 20));
		btneql.setBounds(205, 310, 60, 60);
		frmCalculator.getContentPane().add(btneql);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + ".";
				textField.setText(EnterNumber);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBounds(10, 310, 60, 60);
		frmCalculator.getContentPane().add(btndot);
	}
}
