import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import br.crepor.view.PontosDeColeta;

import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class Sobre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre window = new Sobre();
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
	public Sobre() {
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
				Inicial tela1 = new Inicial();
				tela1.IniciaTela();
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
			public void mouseClicked(MouseEvent arg0) {
				PontosDeColeta tela = new PontosDeColeta();
				tela.IniciaTela();
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
		panel_2.setBounds(36, 71, 821, 602);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblSobreNs = new JLabel("Sobre Nós");
		lblSobreNs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSobreNs.setFont(new Font("Calisto MT", Font.PLAIN, 30));
		lblSobreNs.setBounds(265, 11, 305, 68);
		panel_2.add(lblSobreNs);
		
		JLabel lblNewLabel = new JLabel("Um pouco sobre os criadores deste site sustentável");
		lblNewLabel.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(116, 76, 614, 68);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(139, 155, 564, 141);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDanieleRamos = new JLabel("Daniele Ramos");
		lblDanieleRamos.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		lblDanieleRamos.setBounds(124, 11, 430, 45);
		panel_3.add(lblDanieleRamos);
		
		JTextPane txtpnEstudanteDoCurso = new JTextPane();
		txtpnEstudanteDoCurso.setText("Estudante do curso técnico integrado ao Ensino Médio em Informática no IFSP - Câmpus Bragança Paulista.\r\n\r\nMora na cidade de Tuiuti - SP e tem 17 anos.");
		txtpnEstudanteDoCurso.setBounds(124, 56, 430, 74);
		panel_3.add(txtpnEstudanteDoCurso);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("E:\\Instaladores\\Instalados\\Eclipse\\EclipseWorkspace\\InterfaceGrafica\\img\\daniele.png"));
		label.setBounds(10, 49, 104, 81);
		panel_3.add(label);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(139, 307, 564, 141);
		panel_2.add(panel_4);
		
		JLabel lblrikaCristinaFerreira = new JLabel("Érika Cristina Ferreira");
		lblrikaCristinaFerreira.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		lblrikaCristinaFerreira.setBounds(124, 11, 430, 45);
		panel_4.add(lblrikaCristinaFerreira);
		
		JTextPane txtpnEstudanteDoCurso_1 = new JTextPane();
		txtpnEstudanteDoCurso_1.setText("Estudante do curso técnico integrado ao Ensino Médio em Informática no IFSP - Câmpus Bragança Paulista.\r\n\r\nMora na cidade de Bragança Paulista - SP e tem 17 anos.");
		txtpnEstudanteDoCurso_1.setBounds(124, 56, 430, 74);
		panel_4.add(txtpnEstudanteDoCurso_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon("E:\\Instaladores\\Instalados\\Eclipse\\EclipseWorkspace\\InterfaceGrafica\\img\\erika.jpg"));
		label_1.setBounds(10, 44, 104, 86);
		panel_4.add(label_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(139, 459, 564, 141);
		panel_2.add(panel_5);
		
		JLabel lblVictorBernardoDe = new JLabel("Victor Bernardo de Oliveira");
		lblVictorBernardoDe.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		lblVictorBernardoDe.setBounds(124, 11, 430, 45);
		panel_5.add(lblVictorBernardoDe);
		
		JTextPane txtpnEstudanteDoCurso_2 = new JTextPane();
		txtpnEstudanteDoCurso_2.setText("Estudante do curso técnico integrado ao Ensino Médio em Informática no IFSP - Câmpus Bragança Paulista.\r\n\r\nMora na cidade de Piracaia - SP e tem 17 anos.");
		txtpnEstudanteDoCurso_2.setBounds(124, 56, 430, 74);
		panel_5.add(txtpnEstudanteDoCurso_2);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon("E:\\Instaladores\\Instalados\\Eclipse\\EclipseWorkspace\\InterfaceGrafica\\img\\sheldon.png"));
		label_2.setBounds(10, 50, 104, 80);
		panel_5.add(label_2);
		
	}
}
