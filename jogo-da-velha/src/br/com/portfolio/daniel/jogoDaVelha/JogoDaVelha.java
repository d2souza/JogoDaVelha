package br.com.portfolio.daniel.jogoDaVelha;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JogoDaVelha {

	private JFrame frame;
	private Random random = new Random();
	boolean player1Turn;
	private JTextField txtJogo;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					JogoDaVelha window = new JogoDaVelha();
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
	public JogoDaVelha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 51, 51));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		txtJogo = new JTextField();
		txtJogo.setEditable(false);
		txtJogo.setText("Jogo da Velha");
		txtJogo.setHorizontalAlignment(SwingConstants.CENTER);
		txtJogo.setForeground(new Color(25, 255, 0));
		txtJogo.setBackground(new Color(25, 25, 25));
		txtJogo.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(txtJogo, BorderLayout.NORTH);
		txtJogo.setColumns(9);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {
					if (player1Turn) {
						if (btnNewButton.getText() == "") {
							btnNewButton.setForeground(new Color(200, 0, 0));
							btnNewButton.setText("X");
							player1Turn = false;
							txtJogo.setText("Vez do O");
							check();
						}
					} else {
						if (btnNewButton.getText() == "") {
							btnNewButton.setForeground(new Color(0, 0, 200));
							btnNewButton.setText("O");
							player1Turn = true;
							txtJogo.setText("Vez do X");
							check();
						}

					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(new Color(204, 255, 255));
		buttonGroup.add(btnNewButton);
		panel.add(btnNewButton);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_3) {
					if (player1Turn) {
						if (btnNewButton_3.getText() == "") {
							btnNewButton_3.setForeground(new Color(200, 0, 0));
							btnNewButton_3.setText("X");
							player1Turn = false;
							txtJogo.setText("Vez do O");
							check();
						}
					} else {
						if (btnNewButton_3.getText() == "") {
							btnNewButton_3.setForeground(new Color(0, 0, 200));
							btnNewButton_3.setText("O");
							player1Turn = true;
							txtJogo.setText("Vez do X");
							check();
						}

					}
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setBackground(new Color(204, 255, 255));
		buttonGroup.add(btnNewButton_3);
		panel.add(btnNewButton_3);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_1) {
					if (player1Turn) {
						if (btnNewButton_1.getText() == "") {
							btnNewButton_1.setForeground(new Color(200, 0, 0));
							btnNewButton_1.setText("X");
							player1Turn = false;
							txtJogo.setText("Vez do O");
							check();
						}
					} else {
						if (btnNewButton_1.getText() == "") {
							btnNewButton_1.setForeground(new Color(0, 0, 200));
							btnNewButton_1.setText("O");
							player1Turn = true;
							txtJogo.setText("Vez do X");
							check();
						}

					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBackground(new Color(204, 255, 255));
		buttonGroup.add(btnNewButton_1);
		panel.add(btnNewButton_1);

		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_4) {
					if (player1Turn) {
						if (btnNewButton_4.getText() == "") {
							btnNewButton_4.setForeground(new Color(200, 0, 0));
							btnNewButton_4.setText("X");
							player1Turn = false;
							txtJogo.setText("Vez do O");
							check();
						}
					} else {
						if (btnNewButton_4.getText() == "") {
							btnNewButton_4.setForeground(new Color(0, 0, 200));
							btnNewButton_4.setText("O");
							player1Turn = true;
							txtJogo.setText("Vez do X");
							check();
						}

					}
				}
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setBackground(new Color(204, 255, 255));
		buttonGroup.add(btnNewButton_4);
		panel.add(btnNewButton_4);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_2) {
					if (player1Turn) {
						if (btnNewButton_2.getText() == "") {
							btnNewButton_2.setForeground(new Color(200, 0, 0));
							btnNewButton_2.setText("X");
							player1Turn = false;
							txtJogo.setText("Vez do O");
							check();
						}
					} else {
						if (btnNewButton_2.getText() == "") {
							btnNewButton_2.setForeground(new Color(0, 0, 200));
							btnNewButton_2.setText("O");
							player1Turn = true;
							txtJogo.setText("Vez do X");
							check();
						}

					}
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBackground(new Color(204, 255, 255));
		buttonGroup.add(btnNewButton_2);
		panel.add(btnNewButton_2);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_6) {
					if (player1Turn) {
						if (btnNewButton_6.getText() == "") {
							btnNewButton_6.setForeground(new Color(200, 0, 0));
							btnNewButton_6.setText("X");
							player1Turn = false;
							txtJogo.setText("Vez do O");
							check();
						}
					} else {
						if (btnNewButton_6.getText() == "") {
							btnNewButton_6.setForeground(new Color(0, 0, 200));
							btnNewButton_6.setText("O");
							player1Turn = true;
							txtJogo.setText("Vez do X");
							check();
						}

					}
				}
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.setBackground(new Color(204, 255, 255));
		buttonGroup.add(btnNewButton_6);
		panel.add(btnNewButton_6);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_5) {
					if (player1Turn) {
						if (btnNewButton_5.getText() == "") {
							btnNewButton_5.setForeground(new Color(200, 0, 0));
							btnNewButton_5.setText("X");
							player1Turn = false;
							txtJogo.setText("Vez do O");
							check();
						}
					} else {
						if (btnNewButton_5.getText() == "") {
							btnNewButton_5.setForeground(new Color(0, 0, 200));
							btnNewButton_5.setText("O");
							player1Turn = true;
							txtJogo.setText("Vez do X");
							check();
						}

					}
				}
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setBackground(new Color(204, 255, 255));
		buttonGroup.add(btnNewButton_5);
		panel.add(btnNewButton_5);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_7) {
					if (player1Turn) {
						if (btnNewButton_7.getText() == "") {
							btnNewButton_7.setForeground(new Color(200, 0, 0));
							btnNewButton_7.setText("X");
							player1Turn = false;
							txtJogo.setText("Vez do O");
							check();
						}
					} else {
						if (btnNewButton_7.getText() == "") {
							btnNewButton_7.setForeground(new Color(0, 0, 200));
							btnNewButton_7.setText("O");
							player1Turn = true;
							txtJogo.setText("Vez do X");
							check();
						}

					}
				}
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btnNewButton_7.setFocusable(false);
		btnNewButton_7.setBackground(new Color(204, 255, 255));
		buttonGroup.add(btnNewButton_7);
		panel.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_8) {
					if (player1Turn) {
						if (btnNewButton_8.getText() == "") {
							btnNewButton_8.setForeground(new Color(200, 0, 0));
							btnNewButton_8.setText("X");
							player1Turn = false;
							txtJogo.setText("Vez do O");
							check();
						}
					} else {
						if (btnNewButton_8.getText() == "") {
							btnNewButton_8.setForeground(new Color(0, 0, 200));
							btnNewButton_8.setText("O");
							player1Turn = true;
							txtJogo.setText("Vez do X");
							check();
						}

					}
				}
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btnNewButton_8.setFocusable(false);
		btnNewButton_8.setBackground(new Color(204, 255, 255));
		buttonGroup.add(btnNewButton_8);
		panel.add(btnNewButton_8);

		frame.setResizable(false);
//		frame.setBounds(100, 100, 800, 800);
		frame.setSize(700, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		startGame();
	}

	public void firstTurn() {

		if (random.nextInt(2) == 0) {
			player1Turn = true;
			txtJogo.setText("Vez do X");
		} else {
			player1Turn = false;
			txtJogo.setText("Vez do O");
		}
	}

	private class startThread extends Thread {  // foi necessário criar uma nova classe que extendesse uma thread para
												// sobreescrever o metodo run(),
		@Override 								// que ignoraria o EventQueue.invokeLater que espera tudo ser inicializado
												// pra rodar o programa
		public void run() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			firstTurn();
		};
	};

	private void startGame() {
		new startThread().start();
	}

	public void check() {
		
	}

	public void xWins(int a, int b, int c) {

	}

	public void oWins(int a, int b, int c) {

	}

}
