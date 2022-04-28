package cursojava.thread;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class TelaTimeThread extends JDialog{
	
	private JPanel panel = new JPanel(new GridBagLayout());
	
	public TelaTimeThread() {/*Executa o que estiver dentro no momento da abertura instanciação desse objeto*/
		// TODO Auto-generated constructor stub
		setTitle("Minha tela de Thread com thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0; //Linha gridx
		gridBagConstraints.gridy = 0; //Coluna gridy
		
		
		
		setVisible(true);/*Torna a tela visivel para o usuario, sempre sera o ultimo comando*/
	
	}

}
