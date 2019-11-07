import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.DropMode;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import br.crepor.view.PontosDeColeta;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Inicial {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial window = new Inicial();
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
	public Inicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void IniciaTela() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial window = new Inicial();
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
				Sobre sobre = new Sobre();
				sobre.IniciaTela();
				frame.setVisible(false);
			}
		});
		mntmSobre.setHorizontalAlignment(SwingConstants.CENTER);
		mntmSobre.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		mntmSobre.setBackground(Color.LIGHT_GRAY);
		mntmSobre.setBounds(389, 0, 112, 38);
		panelTopo.add(mntmSobre);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 761, 884, 38);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 67, 864, 471);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("      C.R.E.P.O.R.");
		lblNewLabel.setBounds(306, 11, 260, 38);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		lblNewLabel.setIcon(new ImageIcon("E:\\Instaladores\\Instalados\\Eclipse\\EclipseWorkspace\\InterfaceGrafica\\img\\img.png"));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\"Coleta e Reutilização Ecológica de Pilhas, Óleo de Remédios\"");
		lblNewLabel_1.setBounds(10, 60, 844, 38);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Calisto MT", Font.PLAIN, 18));
		panel_1.add(lblNewLabel_1);
		
		JTextPane txtpnNossoProjeto = new JTextPane();
		txtpnNossoProjeto.setBackground(SystemColor.control);
		txtpnNossoProjeto.setFont(new Font("Calisto MT", Font.PLAIN, 18));
		txtpnNossoProjeto.setText("Nosso projeto é o C.R.E.P.O.R. (Coleta e Reutilização Ecológica de Pilhas, Óleo e Remédios), o problema que percebemos para a criação desse projeto é a falta de conhecimento das pessoas em relação ao descarte de pilhas, óleo e remédios e suas embalagens, as vezes até sabem que esses resíduos precisam ser descartados de uma maneira correta mas não sabem onde se localiza os pontos de coleta nem ao menos tem como se comunicar com esses lugares.  Pensamos em criar um site e que contenha endereços e contatos de pontos de coleta, onde todas as pessoas tenham acesso, e possam filtrar o endereço mais perto de sua casa para fazer o descarte, além dos pontos de coleta colocaremos informações sobre os resíduos, como o que eles causam ao meio ambiente, o que acontece com eles depois de passar pelos pontos de coleta, enfim, o que eles acabam se tornando no final de todo um processo e explicar esse processo também.");
		txtpnNossoProjeto.setBounds(134, 137, 614, 323);
		panel_1.add(txtpnNossoProjeto);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(257, 559, 364, 171);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnConheaOsCriadores = new JButton("Conheça os criadores");
		btnConheaOsCriadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Sobre sobre = new Sobre();
				sobre.IniciaTela();
				frame.setVisible(false);
			}
		});
		btnConheaOsCriadores.setBackground(Color.WHITE);
		btnConheaOsCriadores.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConheaOsCriadores.setBounds(10, 11, 344, 41);
		panel_2.add(btnConheaOsCriadores);
		
		JButton btnConheaOsPontos = new JButton("Conheça os pontos de coleta");
		btnConheaOsPontos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PontosDeColeta tela2 = new PontosDeColeta();
				tela2.IniciaTela();
				frame.setVisible(false);
			}
		});
		btnConheaOsPontos.setBackground(Color.WHITE);
		btnConheaOsPontos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConheaOsPontos.setBounds(10, 63, 344, 41);
		panel_2.add(btnConheaOsPontos);
		
		JButton btnDescubraSobreOs = new JButton("Descubra sobre os materiais");
		btnDescubraSobreOs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Materiais materiais = new Materiais();
				materiais.IniciaTela();
				frame.setVisible(false);
			}
		});
		btnDescubraSobreOs.setBackground(Color.WHITE);
		btnDescubraSobreOs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDescubraSobreOs.setBounds(10, 115, 344, 41);
		panel_2.add(btnDescubraSobreOs);
	}

}
