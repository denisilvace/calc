package calc2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telas {

	private JFrame frame;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telas window = new telas();
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
	public telas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(32, 178, 170));
		frame.setResizable(false);
		frame.setBounds(100, 100, 307, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial", Font.BOLD, 18));
		txtField.setBounds(10, 10, 272, 47);
		frame.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnLimpar = new JButton("C");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnLimpar.setForeground(new Color(255, 0, 0));
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 18));
		btnLimpar.setBounds(222, 67, 60, 47);
		frame.getContentPane().add(btnLimpar);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 18));
		btn3.setBounds(150, 124, 60, 47);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 18));
		btn2.setBounds(80, 124, 60, 47);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn1.getText();
				txtField.setText(IngressarNumero); 
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 18));
		btn1.setBounds(10, 124, 60, 47);
		frame.getContentPane().add(btn1);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao ="+";
			}
		});
		btnSoma.setForeground(new Color(255, 0, 0));
		btnSoma.setFont(new Font("Arial", Font.BOLD, 18));
		btnSoma.setBounds(222, 124, 60, 47);
		frame.getContentPane().add(btnSoma);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 18));
		btn6.setBounds(150, 185, 60, 47);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 18));
		btn5.setBounds(80, 185, 60, 47);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 18));
		btn4.setBounds(10, 185, 60, 47);
		frame.getContentPane().add(btn4);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao ="-";
			}
		});
		btnSub.setForeground(new Color(255, 0, 0));
		btnSub.setFont(new Font("Arial", Font.BOLD, 18));
		btnSub.setBounds(222, 185, 60, 47);
		frame.getContentPane().add(btnSub);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 18));
		btn9.setBounds(150, 242, 60, 47);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 18));
		btn8.setBounds(80, 242, 60, 47);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 18));
		btn7.setBounds(10, 242, 60, 47);
		frame.getContentPane().add(btn7);
		
		JButton btnmult = new JButton("X");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao ="*";
			}
		});
		btnmult.setForeground(new Color(255, 0, 0));
		btnmult.setFont(new Font("Arial", Font.BOLD, 18));
		btnmult.setBounds(222, 242, 60, 47);
		frame.getContentPane().add(btnmult);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtField.getText());
				
				if(operacao == "+") {
					resultado = numero1 + numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
				}
				else if(operacao == "-") {
					resultado = numero1 - numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
				}
				else if(operacao == "*") {
					resultado = numero1 * numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
				}
				else if(operacao == "/") {
					resultado = numero1 / numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
				}
			} 
		});
		btnIgual.setForeground(new Color(255, 0, 0));
		btnIgual.setFont(new Font("Arial", Font.BOLD, 18));
		btnIgual.setBounds(150, 299, 60, 47);
		frame.getContentPane().add(btnIgual);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 18));
		btn0.setBounds(80, 299, 60, 47);
		frame.getContentPane().add(btn0);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btnPonto.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btnPonto.setForeground(new Color(255, 0, 0));
		btnPonto.setFont(new Font("Arial", Font.BOLD, 28));
		btnPonto.setBounds(10, 299, 60, 47);
		frame.getContentPane().add(btnPonto);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao ="/";
			}
		});
		btnDiv.setForeground(new Color(255, 0, 0));
		btnDiv.setFont(new Font("Arial", Font.BOLD, 18));
		btnDiv.setBounds(222, 299, 60, 47);
		frame.getContentPane().add(btnDiv);
	}
}
