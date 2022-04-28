package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{
	
	public TelaTimeThread() {/*Executa o que estiver dentro no momento da abertura instanciação desse objeto*/
		// TODO Auto-generated constructor stub
		setTitle("Minha tela de Thread com thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		setVisible(true);/*Torna a tela visivel para o usuario, sempre sera o ultimo comando*/
	
	}

}
