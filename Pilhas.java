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

public class Pilhas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pilhas window = new Pilhas();
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
	public Pilhas() {
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
		panel.setBounds(0, 761, 884, 38);
		panel.setLayout(null);
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(36, 71, 821, 602);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPilhas = new JLabel("Pilhas");
		lblPilhas.setFont(new Font("Calisto MT", Font.PLAIN, 40));
		lblPilhas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPilhas.setBounds(10, 11, 361, 92);
		panel_2.add(lblPilhas);
		
		JTextPane txtpnPilhasSoDispositivos = new JTextPane();
		txtpnPilhasSoDispositivos.setBackground(UIManager.getColor("Panel.background"));
		txtpnPilhasSoDispositivos.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		txtpnPilhasSoDispositivos.setText("Pilhas são dispositivos capazes de produzir corrente elétrica (energia elétrica) a partir de reações de oxidação e redução de componentes metálicos presentes em sua estrutura. Vale dizer que:\r\n\r\nOxidação: é a capacidade que um material apresenta de perder elétrons;\r\n\r\nRedução: é a capacidade que um material apresenta de ganhar elétrons.\r\n\r\nAssim, em uma pilha, como os elétrons partem de um componente e chegam até outro, forma-se uma corrente elétrica, que é capaz de fazer funcionar diversos dispositivos eletrônicos.\r\n \r\n\r\nFuncionamento de uma pilha\r\n\r\n");
		txtpnPilhasSoDispositivos.setBounds(10, 114, 801, 477);
		panel_2.add(txtpnPilhasSoDispositivos);
	}

}
