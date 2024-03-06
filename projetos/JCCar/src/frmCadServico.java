import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.bd;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class frmCadServico extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField edtCodigo;
	private JTextField edtNome;
	private JTextField edtValor;
	private bd objDB = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadServico frame = new frmCadServico();
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
	public frmCadServico() {
		
		this.objDB = new bd("jccar", "root", "root");
		
		setTitle("Cadastro De Serviços");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Código:");
		lblCodigo.setBounds(13, 25, 46, 14);
		contentPane.add(lblCodigo);
		
		edtCodigo = new JTextField();
		
		edtCodigo.setBounds(67, 22, 86, 20);
		contentPane.add(edtCodigo);
		edtCodigo.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(13, 62, 46, 14);
		contentPane.add(lblNome);
		
		edtNome = new JTextField();
		edtNome.setBounds(67, 59, 310, 20);
		contentPane.add(edtNome);
		edtNome.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(13, 99, 46, 14);
		contentPane.add(lblValor);
		
		edtValor = new JTextField();
		edtValor.setBounds(67, 96, 122, 20);
		contentPane.add(edtValor);
		edtValor.setColumns(10);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setBounds(13, 147, 69, 23);
		contentPane.add(btnIncluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(95, 147, 76, 23);
		contentPane.add(btnAlterar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(184, 147, 76, 23);
		contentPane.add(btnCancelar);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setEnabled(false);
		btnGravar.setBounds(273, 147, 68, 23);
		contentPane.add(btnGravar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(351, 147, 69, 23);
		contentPane.add(btnExcluir);
		
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIncluir.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnCancelar.setEnabled(true);
				btnGravar.setEnabled(true);
			}
		});
		
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIncluir.setEnabled(false);
				btnAlterar.setEnabled(false);
				btnCancelar.setEnabled(true);
				btnGravar.setEnabled(true);
				btnExcluir.setEnabled(false);
			}
		});
		
		edtCodigo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!edtCodigo.getText().toString().equals("")) {
					String sqlQuery = "select * from servicos where idServico = " + edtCodigo.getText().toString();
					try {
						if(!objDB.conectaBD()) {
							ResultSet objRes = objDB.Consultar(sqlQuery);
							if(objRes.next()) {
								edtCodigo.setText(objRes.getString(1));
								edtNome.setText(objRes.getString(2));
								edtValor.setText(objRes.getString(3));
							}else {
								JOptionPane.showMessageDialog(null, "Serviço não cadatrado!");
								edtCodigo.setText("");
								edtCodigo.requestFocus();
							}
						}else {
							JOptionPane.showMessageDialog(null, objDB.Mensagem());
						}
					}catch(ClassNotFoundException error) {
						error.printStackTrace();
						JOptionPane.showMessageDialog(null, objDB.Mensagem());
					}catch(HeadlessException error) {
						error.printStackTrace();
						JOptionPane.showMessageDialog(null, objDB.Mensagem());
					}catch(SQLException error) {
						error.printStackTrace();
						JOptionPane.showMessageDialog(null, objDB.Mensagem());
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Serviço não cadatrado!");
					edtCodigo.setText("");
					edtCodigo.requestFocus();
				}
			}
		});
	}
}
