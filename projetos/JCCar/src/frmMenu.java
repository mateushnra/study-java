import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class frmMenu {

	private JFrame frmJcCar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu window = new frmMenu();
					window.frmJcCar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJcCar = new JFrame();
		frmJcCar.setTitle("JC Car");
		frmJcCar.setBounds(100, 100, 450, 300);
		frmJcCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmJcCar.setJMenuBar(menuBar);
		
		JMenu mnuCadastros = new JMenu("Cadastros");
		menuBar.add(mnuCadastros);
		
		JMenuItem mnuServicos = new JMenuItem("Serviços");
		mnuServicos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnuCadastros.add(mnuServicos);
		
		JMenuItem mnuVeiculos = new JMenuItem("Veículos");
		mnuVeiculos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		mnuCadastros.add(mnuVeiculos);
		
		JMenuItem mnuTipos = new JMenuItem("Tipos");
		mnuTipos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
		mnuCadastros.add(mnuTipos);
		
		JMenu mnuOrdem = new JMenu("Ordem");
		menuBar.add(mnuOrdem);
	}

}
