#Professor Denis
package grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //tratamento de eventos acionados
public class graf extends JFrame{
 
	JTextField TEXTO;
	JLabel ROTULO;
	public graf() {
		super("Formulário");
		Container CONT = getContentPane();
		JButton BOTAO = new JButton("OK");
		TEXTO = new JTextField();
		ROTULO = new JLabel("Texto");
		setLayout(null); //controla a posição dos projetos nele adicionados
		CONT.add(TEXTO);
		CONT.add(BOTAO);
		CONT.add(ROTULO);
		
		TEXTO.setBounds(138,20,150,20);
		BOTAO.setBounds(138,50,70,20);
		ROTULO.setBounds(138,80,160,20);
		
		Captura EVENTO = new Captura();
		BOTAO.addActionListener(EVENTO);
		
		setSize(427,273);
		setVisible(true);
	}
		private class Captura implements ActionListener{ //implementa o método ActionEvent
			public void actionPerformed(ActionEvent ae) {
				String SAIDA =TEXTO.getText();
				ROTULO.setText(SAIDA);
			}
		}
		public static void main(String args[]) {
			graf VISUAL = new graf();
			VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}



