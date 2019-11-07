import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.crepor.view.PontosDeColeta;

public class PontosAdicionados {

	private JFrame frame;
	private BancoDeDados banco;

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public PontosAdicionados(BancoDeDados banco2) {
		this.banco = banco2;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void IniciaTela() {
		frame.setVisible(true);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 900, 831);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelTopo = new JPanel();
		panelTopo.setBounds(0, 0, 884, 38);
		panelTopo.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panelTopo);
		
		JLabel lblLogo = new JLabel("C.R.E.P.O.R.");
		lblLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Inicial tela = new Inicial();
				tela.IniciaTela();
				frame.setVisible(false);
			}
		});
		lblLogo.setBackground(Color.LIGHT_GRAY);
		lblLogo.setBounds(10, 0, 125, 38);
		panelTopo.setLayout(null);
		lblLogo.setFont(new Font("Bodoni MT", Font.BOLD, 20));
		panelTopo.add(lblLogo);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(756, 14, 89, 15);
		panelTopo.add(btnNewButton);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Pontos");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PontosDeColeta tela2 = new PontosDeColeta();
				tela2.IniciaTela();
				frame.setVisible(false);
			}
		});
		mntmNewMenuItem.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem.setBackground(Color.LIGHT_GRAY);
		mntmNewMenuItem.setBounds(132, 0, 112, 38);
		panelTopo.add(mntmNewMenuItem);
		
		JMenuItem mntmMateriais = new JMenuItem("Materiais");
		mntmMateriais.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Materiais materiais = new Materiais();
				materiais.IniciaTela();
				frame.setVisible(false);
			}
		});
		mntmMateriais.setHorizontalAlignment(SwingConstants.CENTER);
		mntmMateriais.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		mntmMateriais.setBackground(Color.LIGHT_GRAY);
		mntmMateriais.setBounds(254, 0, 125, 38);
		panelTopo.add(mntmMateriais);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Sobre telaSobre = new Sobre();
				telaSobre.IniciaTela();
				frame.setVisible(false);
			}
		});
		mntmSobre.setHorizontalAlignment(SwingConstants.CENTER);
		mntmSobre.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		mntmSobre.setBackground(Color.LIGHT_GRAY);
		mntmSobre.setBounds(389, 0, 112, 38);
		panelTopo.add(mntmSobre);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 761, 884, 38);
		panel.setLayout(null);
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(255, 94, 506, 437);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Ponto: " + banco.getPonto(0).getNomePonto());
		lblNewLabel.setBounds(10, 11, 474, 41);
		panel_2.add(lblNewLabel);
		
		JLabel lblCepPonto = new JLabel("Cep do Ponto: " + banco.getPonto(0).getCepPonto());
		lblCepPonto.setBounds(10, 63, 474, 41);
		panel_2.add(lblCepPonto);
		
		JLabel lblBairro = new JLabel("Bairro do Ponto: " + banco.getPonto(0).getBairroPonto());
		lblBairro.setBounds(10, 115, 474, 41);
		panel_2.add(lblBairro);
		
		JLabel lblEndereco = new JLabel("Endereço do Ponto: " + banco.getPonto(0).getEnderecoPonto());
		lblEndereco.setBounds(10, 167, 474, 41);
		panel_2.add(lblEndereco);
		
		JLabel lblNumero = new JLabel("Número do Ponto: " + banco.getPonto(0).getNumeroPonto());
		lblNumero.setBounds(10, 219, 474, 41);
		panel_2.add(lblNumero);
		
		JLabel lblCidade = new JLabel("Cidade do Ponto: " + banco.getPonto(0).getCidadePonto());
		lblCidade.setBounds(10, 271, 474, 41);
		panel_2.add(lblCidade);
		
		JLabel lblTelefone = new JLabel("Telefone do Ponto: " + banco.getPonto(0).getTelefonePonto());
		lblTelefone.setBounds(10, 323, 474, 41);
		panel_2.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("Email do Ponto: " + banco.getPonto(0).getEmailPonto());
		lblEmail.setBounds(10, 375, 474, 41);
		panel_2.add(lblEmail);
		
		
			
	}

}
