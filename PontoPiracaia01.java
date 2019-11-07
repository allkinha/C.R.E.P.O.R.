import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import br.crepor.view.PontosDeColeta;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PontoPiracaia01 {

	private JFrame frame;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PontoPiracaia01 window = new PontoPiracaia01();
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
	public PontoPiracaia01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void IniciaTela() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PontoPiracaia01 window = new PontoPiracaia01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		initialize();
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
		
		textField = new JTextField();
		textField.setDropMode(DropMode.INSERT);
		textField.setBounds(547, 14, 206, 15);
		panelTopo.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(756, 14, 89, 15);
		panelTopo.add(btnNewButton);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Pontos");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PontosDeColeta telaPontos = new PontosDeColeta();
				telaPontos.IniciaTela();
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
		
		JLabel lblPiracaia = new JLabel("Piracaia");
		lblPiracaia.setFont(new Font("Calisto MT", Font.PLAIN, 30));
		lblPiracaia.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiracaia.setBounds(43, 65, 237, 61);
		frame.getContentPane().add(lblPiracaia);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(35, 137, 384, 528);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(97, 11, 190, 152);
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("E:\\Instaladores\\Instalados\\Eclipse\\EclipseWorkspace\\InterfaceGrafica\\img\\hakuo.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextPane txtpnSupermercadoHakuo = new JTextPane();
		txtpnSupermercadoHakuo.setBounds(118, 163, 151, 61);
		panel_2.add(txtpnSupermercadoHakuo);
		txtpnSupermercadoHakuo.setBackground(UIManager.getColor("Panel.background"));
		txtpnSupermercadoHakuo.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		txtpnSupermercadoHakuo.setText("Rede Hakuo de\r\nSupermercados");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(0, 233, 384, 295);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JTextPane txtpnColetaRealizadaleo = new JTextPane();
		txtpnColetaRealizadaleo.setBounds(10, 22, 366, 243);
		panel_3.add(txtpnColetaRealizadaleo);
		txtpnColetaRealizadaleo.setBackground(UIManager.getColor("Panel.background"));
		txtpnColetaRealizadaleo.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		txtpnColetaRealizadaleo.setText("Coleta realizada: óleo;\r\n\r\nEndereço: Rua Tenente Antônio Batista, \r\n244, Centro, Piracaia/SP.\r\n\r\nTelefone: (11) 4036-7582\r\n\r\nE-mail: contato@hakuosupermercados.com.br");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\Instaladores\\Instalados\\Eclipse\\EclipseWorkspace\\InterfaceGrafica\\img\\map.PNG"));
		lblNewLabel_1.setBounds(461, 137, 396, 528);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
