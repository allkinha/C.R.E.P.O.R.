import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.DropMode;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.event.ListSelectionListener;

import br.crepor.view.PontosDeColeta;

import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdicionaPonto {

	private JFrame frame;
	private JTextField inputEndereco;
	private JTextField inputNome;
	private JTextField inputCep;
	private JTextField inputBairr;
	private JTextField textField;
	private JTextField inputNumero;
	private JTextField inputCidade;
	private JTextField inputTelefone;
	private JTextField inputEmail;
	private BancoDeDados banco2;
	String selecionado;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionaPonto window = new AdicionaPonto();
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
	public AdicionaPonto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void IniciaTela() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionaPonto window = new AdicionaPonto();
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
		panel_2.setBounds(21, 69, 837, 632);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblAdicionarPonto = new JLabel("‎Adicionar Ponto");
		lblAdicionarPonto.setFont(new Font("Calisto MT", Font.PLAIN, 30));
		lblAdicionarPonto.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdicionarPonto.setBounds(131, 11, 565, 79);
		panel_2.add(lblAdicionarPonto);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(224, 68, 426, 0);
		panel_2.add(horizontalStrut);
		
		JLabel lblNomeDoPonto = new JLabel("Nome do Ponto");
		lblNomeDoPonto.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		lblNomeDoPonto.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeDoPonto.setBounds(53, 126, 265, 36);
		panel_2.add(lblNomeDoPonto);
		
		inputNome = new JTextField();
		lblNomeDoPonto.setLabelFor(inputNome);
		inputNome.setBounds(53, 161, 265, 36);
		panel_2.add(inputNome);
		inputNome.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		lblCep.setBounds(434, 126, 262, 36);
		panel_2.add(lblCep);
		
		inputCep = new JTextField();
		lblCep.setLabelFor(inputCep);
		inputCep.setBounds(434, 161, 262, 36);
		panel_2.add(inputCep);
		inputCep.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		lblBairro.setBounds(53, 230, 265, 36);
		panel_2.add(lblBairro);
		
		inputBairr = new JTextField();
		inputBairr.setBounds(53, 268, 265, 36);
		panel_2.add(inputBairr);
		inputBairr.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		lblEndereo.setBounds(434, 230, 262, 36);
		panel_2.add(lblEndereo);
		
		JLabel lblNmero = new JLabel("Número");
		lblNmero.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		lblNmero.setBounds(53, 344, 265, 36);
		panel_2.add(lblNmero);
		
		JLabel lblNewLabel = new JLabel("Cidade");
		lblNewLabel.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		lblNewLabel.setBounds(434, 344, 262, 36);
		panel_2.add(lblNewLabel);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelefone.setBounds(53, 446, 265, 36);
		panel_2.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		lblEmail.setBounds(53, 549, 262, 36);
		panel_2.add(lblEmail);
		
		inputEndereco = new JTextField();
		inputEndereco.setColumns(10);
		inputEndereco.setBounds(434, 268, 262, 36);
		panel_2.add(inputEndereco);
		
		inputNumero = new JTextField();
		inputNumero.setColumns(10);
		inputNumero.setBounds(53, 380, 265, 36);
		panel_2.add(inputNumero);
		
		inputCidade = new JTextField();
		inputCidade.setColumns(10);
		inputCidade.setBounds(434, 380, 262, 36);
		panel_2.add(inputCidade);
		
		inputTelefone = new JTextField();
		inputTelefone.setColumns(10);
		inputTelefone.setBounds(53, 482, 265, 36);
		panel_2.add(inputTelefone);
		
		inputEmail = new JTextField();
		inputEmail.setColumns(10);
		inputEmail.setBounds(53, 585, 262, 36);
		panel_2.add(inputEmail);
		
		
		/*
		 * JList list = new JList();
		 * 
		 * list.setVisibleRowCount(1); list.setSelectedIndices(new int[] {27});
		 * list.setModel(new AbstractListModel() { String[] values = new String[]
		 * {"Acre", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal",
		 * "Espírito Santo", "Goiás", "Minas Gerais", "Maranhão", "Mato Grosso",
		 * "Mato Grosso do Sul", "Pará", "Paraná", "Paraíba", "Pernambuco", "Piauí",
		 * "Rio Grande do Norte", "Rio Grande do Sul", "Rio de Janeiro",
		 * "Santa Catarina", "Rondônia", "Roraima", "São Paulo", "Sergipe", "Tocantis"};
		 * public int getSize() { return values.length; } public Object getElementAt(int
		 * index) { return values[index]; } }); list.setSelectedIndex(0);
		 * 
		 * list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 * panel_2.add(list);
		 */
		String[] values = new String[] {"Acre", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Minas Gerais", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Pará", "Paraná", "Paraíba", "Pernambuco", "Piauí", "Rio Grande do Norte", "Rio Grande do Sul", "Rio de Janeiro", "Santa Catarina", "Rondônia", "Roraima", "São Paulo", "Sergipe", "Tocantis"};

		JComboBox comboBox = new JComboBox(values);
		comboBox.setBounds(434, 505, 284, 18);
		
		comboBox.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(((JComboBox)e.getSource()).getSelectedItem());	
				selecionado = (String)((JComboBox)e.getSource()).getSelectedItem();
			}
		});
		//System.out.println("De fora: " + selecionado);
		panel_2.add(comboBox);
		//scrollPane.setVisible(true);
		
		/*
		 * list.addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseClicked(MouseEvent e) {
		 * 
		 * scrollPane.setBounds(434, 505, 284, 127);
		 * 
		 * } });
		 */
		/*
		 * scrollPane.addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseClicked(MouseEvent e) { scrollPane.setBounds(434,
		 * 505, 284, 127);
		 * 
		 * } });
		 */
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//scrollPane.setBounds(434, 505, 284, 18);
				//list.setVisibleRowCount(list.getSelectedIndex());
				
				
			}
		});

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Calisto MT", Font.PLAIN, 15));
		lblEstado.setBounds(434, 447, 265, 36);
		panel_2.add(lblEstado);
		
		JPanel panel_confirma = new JPanel();
		panel_confirma.setBounds(258, 91, 311, 24);
		panel_2.add(panel_confirma);
		panel_confirma.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro de Ponto Realizado com sucesso!");
		panel_confirma.add(lblNewLabel_1);
		
		
		JButton btnSubmit = new JButton("Enviar");
				
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PontoDeColeta ponto = new PontoDeColeta(inputNome.getText(), Integer.parseInt(inputCep.getText()), inputBairr.getText(), inputEndereco.getText(),
						Integer.parseInt(inputNumero.getText()), inputCidade.getText(), Integer.parseInt(inputTelefone.getText()), inputEmail.getText(), selecionado);

				JLabel confirmacao = new JLabel ("Cadastro de Ponto Realizado com sucesso!");
				panel_confirma.setVisible(true);

				BancoDeDados banco = new BancoDeDados(ponto);
				banco2 = banco;
			}
		});
		btnSubmit.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		btnSubmit.setBounds(434, 585, 165, 36);
		panel_2.add(btnSubmit);
		
		JButton btnResetar = new JButton("Resetar");
		btnResetar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputNome.setText(null);
				inputCep.setText(null);
				inputBairr.setText(null);
				inputEndereco.setText(null);
				inputNumero.setText(null);
				inputCidade.setText(null);
				inputTelefone.setText(null);
				inputEmail.setText(null);
			}
		});
		btnResetar.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		btnResetar.setBounds(609, 585, 165, 36);
		panel_2.add(btnResetar);
		
		JButton btnVerPontosCadastrados = new JButton("Ver pontos cadastrados");
		btnVerPontosCadastrados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PontosAdicionados pontosAdd = new PontosAdicionados(banco2);
				pontosAdd.IniciaTela();
				frame.setVisible(false);
			}
		});
		btnVerPontosCadastrados.setBounds(434, 538, 165, 36);
		panel_2.add(btnVerPontosCadastrados);
		
		
		
		
		
		
		
		
	}
}
