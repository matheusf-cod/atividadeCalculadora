package com.matheus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblchar = new JLabel("chardigitado");
		lblchar.setBounds(290, 11, 103, 14);
		contentPane.add(lblchar);
		
		JButton botao7 = new JButton("7");
		botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (op.equals(" ")) {
					
					nmr1 = 7;
					lblchar.setText("7");
					
				} else {
					
					nmr2 = 7;
					lblchar.setText("7");
				}
			}
		});
		botao7.setBounds(10, 48, 89, 23);
		contentPane.add(botao7);
		
		JButton botao8 = new JButton("8");
		botao8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (op.equals(" ")) {
					
					nmr1 = 8;
					lblchar.setText("8");
					
				} else {
					
					nmr2 = 8;
					lblchar.setText("8");

				}
			}
		});
		botao8.setBounds(106, 48, 89, 23);
		contentPane.add(botao8);
		
		JButton botao9 = new JButton("9");
		botao9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (op.equals(" ")) {
					
					nmr1 = 9;
					lblchar.setText("9");

					
				} else {
					
					nmr2 = 9;
					lblchar.setText("9");

				}
			}
		});
		botao9.setBounds(205, 48, 89, 23);
		contentPane.add(botao9);
		
		JButton botaodiv = new JButton("/");
		botaodiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = ("/");
			}
		});
		botaodiv.setBounds(304, 48, 89, 23);
		contentPane.add(botaodiv);
		
		JButton botao4 = new JButton("4");
		botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (op.equals(" ")) {
					
					nmr1 = 4;
					lblchar.setText("4");

					
				} else {
					
					nmr2 = 4;
					lblchar.setText("4");

				}
			}
		});
		botao4.setBounds(10, 82, 89, 23);
		contentPane.add(botao4);
		
		JButton botao5 = new JButton("5");
		botao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op.equals(" ")) {
					
					nmr1 = 5;
					lblchar.setText("5");

					
				} else {
					
					nmr2 = 5;
					lblchar.setText("5");

				}
			}
		});
		botao5.setBounds(106, 82, 89, 23);
		contentPane.add(botao5);
		
		JButton botao6 = new JButton("6");
		botao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (op.equals(" ")) {
					
					nmr1 = 6;
					lblchar.setText("6");

					
				} else {
					
					nmr2 = 6;
					lblchar.setText("6");

				}
			}
		});
		botao6.setBounds(205, 82, 89, 23);
		contentPane.add(botao6);
		
		JButton botaomult = new JButton("*");
		botaomult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op=("*");
			}
		});
		botaomult.setBounds(304, 82, 89, 23);
		contentPane.add(botaomult);
		
		JButton botao1 = new JButton("1");
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (op.equals(" ")) {
					
					nmr1 = 1;
					lblchar.setText("1");

					
				} else {
					
					nmr2 = 1;
					lblchar.setText("1");

				}
			}
		});
		botao1.setBounds(10, 116, 89, 23);
		contentPane.add(botao1);
		
		JButton botao2 = new JButton("2");
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (op.equals(" ")) {
					
					nmr1 = 2;
					lblchar.setText("2");

					
				} else {
					
					nmr2 = 2;
					lblchar.setText("2");

				}
			}
		});
		botao2.setBounds(106, 116, 89, 23);
		contentPane.add(botao2);
		
		JButton botao3 = new JButton("3");
		botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op.equals(" ")) {
					
					nmr1 = 3;
					lblchar.setText("3");

					
				} else {
					
					nmr2 = 3;
					lblchar.setText("3");

				}
			}
		});
		botao3.setBounds(205, 116, 89, 23);
		contentPane.add(botao3);
		
		JButton botaosub = new JButton("-");
		botaosub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op=("-");
			}
		});
		botaosub.setBounds(304, 116, 89, 23);
		contentPane.add(botaosub);
		
		JButton botao0 = new JButton("0");
		botao0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (op.equals(" ")) {
					
					nmr1 = 0;
					lblchar.setText("0");

					
				} else {
					
					nmr2 = 0;
					lblchar.setText("0");

				}
				
			}
		});
		botao0.setBounds(10, 150, 89, 23);
		contentPane.add(botao0);
		
		JButton botaolimpar = new JButton("CE");
		botaolimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				res = 0;
				op = (" ");
				nmr1 = 0;
				nmr2 = 0;
				lblchar.setText("| ");
				
			}
		});
		botaolimpar.setBounds(106, 150, 89, 23);
		contentPane.add(botaolimpar);
		
		JButton botaoigual = new JButton("=");
		botaoigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(op.equals("+")) {
					res=(nmr1+nmr2);
				} else if (op.equals("-")) {
					res=(nmr1-nmr2);
				}else if (op.equals("*")) {
					res=(nmr1*nmr2);
				}else if(op.equals("/")) {
					res = (nmr1/nmr2);
				}
				
				lblchar.setText(""+res);
				op = (" ");
			}
		});
		botaoigual.setBounds(205, 150, 89, 23);
		contentPane.add(botaoigual);
		
		JButton botaomais = new JButton("+");
		botaomais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op=("+");
			}
		});
		botaomais.setBounds(304, 150, 89, 23);
		contentPane.add(botaomais);
		
		
		
	}
	double nmr1, nmr2, res;
	String op = (" ");
	

}
