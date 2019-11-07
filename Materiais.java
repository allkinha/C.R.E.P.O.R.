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
import javax.swing.JTextPane;
import javax.swing.UIManager;

import br.crepor.view.PontosDeColeta;

import java.awt.SystemColor;

public class Materiais {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Materiais window = new Materiais();
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
	public Materiais() {
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
		
		JLabel lblMateriais = new JLabel("Materiais");
		lblMateriais.setFont(new Font("Calisto MT", Font.PLAIN, 30));
		lblMateriais.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateriais.setBounds(283, 72, 290, 58);
		frame.getContentPane().add(lblMateriais);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(31, 166, 252, 432);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPilhas = new JLabel("Pilhas");
		lblPilhas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPilhas.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		lblPilhas.setBounds(22, 11, 209, 44);
		panel_2.add(lblPilhas);
		
		JTextPane txtpnPilhasSoDispositivos = new JTextPane();
		txtpnPilhasSoDispositivos.setBackground(UIManager.getColor("Panel.background"));
		txtpnPilhasSoDispositivos.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		txtpnPilhasSoDispositivos.setText("Pilhas são dispositivos capazes de produzir corrente elétrica (energia elétrica) a partir de reações de oxidação e redução de componentes metálicos presentes em sua estrutura.");
		txtpnPilhasSoDispositivos.setBounds(10, 66, 232, 277);
		panel_2.add(txtpnPilhasSoDispositivos);
		
		JButton btnMaisSobrePilha = new JButton("Mais Sobre");
		btnMaisSobrePilha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Pilhas pilha = new Pilhas();
				pilha.IniciaTela();
				frame.setVisible(false);
			}
		});
		btnMaisSobrePilha.setBounds(31, 609, 252, 38);
		frame.getContentPane().add(btnMaisSobrePilha);
		
		JButton btnMaisSobreOleo = new JButton("Mais Sobre");
		btnMaisSobreOleo.setBounds(309, 609, 252, 38);
		frame.getContentPane().add(btnMaisSobreOleo);
		
		JButton btnMaisSobreRemedio = new JButton("Mais Sobre");
		btnMaisSobreRemedio.setBounds(583, 609, 252, 38);
		frame.getContentPane().add(btnMaisSobreRemedio);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(309, 166, 251, 432);
		frame.getContentPane().add(panel_3);
		
		JLabel label = new JLabel("Óleo");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		label.setBounds(20, 11, 209, 44);
		panel_3.add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 66, 231, 355);
		panel_3.add(textPane);
		textPane.setText("Óleos são substâncias no estado líquido viscoso nas condições ambientes; Tecnicamente são lipídios ou materiais graxos formado por triglicerídeo que possuem radicais insaturados, ou lipídios formados pela união de três moléculas de ácidos graxos e uma molécula de glicerol. Os óleos são hidrofóbicos e lipofílicos.");
		textPane.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		textPane.setBackground(SystemColor.menu);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(584, 166, 251, 432);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblRemdios = new JLabel("Remédios");
		lblRemdios.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemdios.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		lblRemdios.setBounds(21, 11, 209, 44);
		panel_4.add(lblRemdios);
		
		JTextPane txtpnUmRemdio = new JTextPane();
		txtpnUmRemdio.setText("Um remédio é qualquer substância ou recurso utilizado para obter cura ou alívio. Diferentemente de fármaco, a substância utilizada não necessita ser conhecida quimicamente.");
		txtpnUmRemdio.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		txtpnUmRemdio.setBackground(SystemColor.menu);
		txtpnUmRemdio.setBounds(10, 66, 231, 271);
		panel_4.add(txtpnUmRemdio);
		
		
	}
}
