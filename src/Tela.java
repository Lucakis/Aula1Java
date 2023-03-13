import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import src.Cliente;
import src.ClienteServico;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtDadosDosClientes;
	private JLayeredPane layeredPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JButton btnDadosDosClientes;
	private JTable table;
	private JTextField nome;
	private JTextField endereco;
	private JTextField telefone;
	private JTextField duracao;
	private JTextField valor;
	private JTextField altId;
	private JTextField altNome;
	private JTextField altValor;
	private JTextField altDuracao;
	private JTextField altTelefone;
	private JTextField altEndereco;
	DefaultTableModel model;
	private ClienteServico clienteServico; 
	private JTable JtableTabela;
	DefaultTableModel model2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		ClienteServico clienteServico = new ClienteServico();
		setTitle("Nome da empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 752);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPagamentos = new JButton("Tela Inicial");
		btnPagamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_1);
			}
		});
		btnPagamentos.setBounds(10, 69, 121, 33);
		contentPane.add(btnPagamentos);
		
		JButton btnAlteraes = new JButton("Alterações");
		btnAlteraes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_2);
			}
		});
		btnAlteraes.setBounds(10, 157, 121, 33);
		contentPane.add(btnAlteraes);
		
		JButton btnAgenda = new JButton("Agenda");
		btnAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_3);
			}
		});
		btnAgenda.setBounds(10, 201, 121, 33);
		contentPane.add(btnAgenda);
		
		JButton btnAdicionarClientes = new JButton("Adicionar Clientes");
		btnAdicionarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_4);
			}
		});
		btnAdicionarClientes.setBounds(10, 245, 121, 33);
		contentPane.add(btnAdicionarClientes);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(141, 69, 734, 633);
		contentPane.add(layeredPane);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 0, 734, 633);
		layeredPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtDadosDosClientes = new JTextField();
		txtDadosDosClientes.setHorizontalAlignment(SwingConstants.CENTER);
		txtDadosDosClientes.setBounds(10, 11, 714, 611);
		panel_1.add(txtDadosDosClientes);
		txtDadosDosClientes.setBackground(new Color(0, 128, 64));
		txtDadosDosClientes.setFont(new Font("Times New Roman", Font.ITALIC, 90));
		txtDadosDosClientes.setText("Kraus Jardinagem");
		txtDadosDosClientes.setColumns(10);
		
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(0, 0, 734, 633);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1.setBounds(96, 40, 91, 23);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TELEFONE :");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(96, 200, 91, 23);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("ENDEREÇO :");
		lblNewLabel_1_3.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(96, 240, 91, 23);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("VALOR :");
		lblNewLabel_1_4.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(96, 120, 91, 23);
		panel_2.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("DIAS :");
		lblNewLabel_1_5.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_5.setBounds(96, 160, 91, 23);
		panel_2.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("NOME :");
		lblNewLabel_1_6.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel_1_6.setBounds(96, 80, 91, 23);
		panel_2.add(lblNewLabel_1_6);
		
		altId = new JTextField();
		altId.setBounds(197, 35, 270, 30);
		panel_2.add(altId);
		altId.setColumns(10);
		
		altNome = new JTextField();
		altNome.setColumns(10);
		altNome.setBounds(197, 75, 270, 30);
		panel_2.add(altNome);
		
		altValor = new JTextField();
		altValor.setColumns(10);
		altValor.setBounds(197, 114, 270, 30);
		panel_2.add(altValor);
		
		altDuracao = new JTextField();
		altDuracao.setColumns(10);
		altDuracao.setBounds(197, 155, 270, 30);
		panel_2.add(altDuracao);
		
		altTelefone = new JTextField();
		altTelefone.setColumns(10);
		altTelefone.setBounds(197, 195, 270, 30);
		panel_2.add(altTelefone);
		
		altEndereco = new JTextField();
		altEndereco.setColumns(10);
		altEndereco.setBounds(197, 235, 270, 30);
		panel_2.add(altEndereco);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente();
				cliente.setDias(Integer.parseInt(altDuracao.getText()));
				cliente.setEndereco(altEndereco.getText());
				cliente.setNome(altNome.getText());
				cliente.setTelefone(altTelefone.getText());
				cliente.setValor(Double.parseDouble(altValor.getText()));
				cliente.setId(Integer.parseInt(altId.getText()));
				
				
				clienteServico.AlterarCliente(cliente);
			}
		});
		btnAlterar.setBounds(608, 576, 116, 46);
		panel_2.add(btnAlterar);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(192, 192, 192));
		panel_4.setBounds(0, 0, 734, 633);
		layeredPane.add(panel_4);
		panel_4.setLayout(null);
		
		nome = new JTextField();
		nome.setBounds(193, 35, 282, 34);
		panel_4.add(nome);
		nome.setColumns(10);
		
		endereco = new JTextField();
		endereco.setColumns(10);
		endereco.setBounds(193, 101, 282, 34);
		panel_4.add(endereco);
		
		telefone = new JTextField();
		telefone.setColumns(10);
		telefone.setBounds(193, 166, 282, 34);
		panel_4.add(telefone);
		
		duracao = new JTextField();
		duracao.setColumns(10);
		duracao.setBounds(193, 236, 282, 34);
		panel_4.add(duracao);
		
		valor = new JTextField();
		valor.setColumns(10);
		valor.setBounds(193, 314, 282, 34);
		panel_4.add(valor);
		
		JLabel lblNewLabel = new JLabel("NOME :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(54, 32, 91, 34);
		panel_4.add(lblNewLabel);
		
		JLabel lblEndereo = new JLabel("ENDEREÇO :");
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEndereo.setBounds(54, 98, 131, 34);
		panel_4.add(lblEndereo);
		
		JLabel lblTelefone = new JLabel("TELEFONE :");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTelefone.setBounds(54, 163, 121, 34);
		panel_4.add(lblTelefone);
		
		JLabel lblDurao = new JLabel("DURAÇÃO :");
		lblDurao.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDurao.setBounds(54, 233, 116, 34);
		panel_4.add(lblDurao);
		
		JLabel lblValor = new JLabel("VALOR :");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblValor.setBounds(54, 311, 91, 34);
		panel_4.add(lblValor);
		
		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				Cliente cliente = new Cliente();
				cliente.setDias(Integer.parseInt(duracao.getText()));
				cliente.setEndereco(endereco.getText());
				cliente.setNome(nome.getText());
				cliente.setTelefone(telefone.getText());
				cliente.setValor(Double.parseDouble(valor.getText()));
				
				
				clienteServico.AdicionarCliente(cliente);
			}
		});
		btnNewButton.setBounds(608, 576, 116, 46);
		panel_4.add(btnNewButton);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBounds(0, 0, 734, 633);
		layeredPane.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 712, 319);
		panel_3.add(scrollPane_2);
		
		JtableTabela = new JTable();
		scrollPane_2.setViewportView(JtableTabela);
		
		model2= new DefaultTableModel (); 
		Object [] column2 = {"ID","NOME","ENDEREÇO","TELEFONE","VALOR","DIAS"};
		model2.setColumnIdentifiers(column2);
		JtableTabela.setModel(model2);
		ArrayList<Cliente> listasClientes = clienteServico.ListarCliente();
		
		for(Cliente cliente : listasClientes) {
			Vector row2 = new Vector();
			row2.add(cliente.getId());
			row2.add(cliente.getNome());
			row2.add(cliente.getEndereco());
			row2.add(cliente.getTelefone());
			row2.add(cliente.getValor());
			row2.add(cliente.getDias());
			
			model2.addRow(row2);
			
		}
		
		final JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem deleteItem = new JMenuItem("Delete");
deleteItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	int row = JtableTabela.convertRowIndexToModel(JtableTabela.getSelectedRow());
            	int call = JtableTabela.getColumnModel().getColumnIndex("ID");
            	int nomeCol = JtableTabela.getColumnModel().getColumnIndex("NOME");
            	int enderecoCol = JtableTabela.getColumnModel().getColumnIndex("ENDEREÇO");
            	int telefoneCol = JtableTabela.getColumnModel().getColumnIndex("TELEFONE");
            	int valorCol = JtableTabela.getColumnModel().getColumnIndex("VALOR");
            	int diasCol = JtableTabela.getColumnModel().getColumnIndex("DIAS");
            	
            	
            	
            	int id =(Integer) JtableTabela.getModel().getValueAt(row, call);
            	String nome =  (String) JtableTabela.getModel().getValueAt(row, nomeCol);
            	String endereco = (String) JtableTabela.getModel().getValueAt(row, enderecoCol);
            	String telefone = (String) JtableTabela.getModel().getValueAt(row, telefoneCol);
            	Double valor = (Double) JtableTabela.getModel().getValueAt(row, valorCol);
            	int dias = (Integer) JtableTabela.getModel().getValueAt(row, diasCol);
            	
            	
            	
            	clienteServico.ExcluirCliente(id);
            	
            }
            
          
        });
popupMenu.add(deleteItem);

		
		JMenuItem alterarMenu = new JMenuItem("Alterar");
		alterarMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = JtableTabela.convertRowIndexToModel(JtableTabela.getSelectedRow());
            	int call = JtableTabela.getColumnModel().getColumnIndex("ID");
            	int nomeCol = JtableTabela.getColumnModel().getColumnIndex("NOME");
            	int enderecoCol = JtableTabela.getColumnModel().getColumnIndex("ENDEREÇO");
            	int telefoneCol = JtableTabela.getColumnModel().getColumnIndex("TELEFONE");
            	int valorCol = JtableTabela.getColumnModel().getColumnIndex("VALOR");
            	int diasCol = JtableTabela.getColumnModel().getColumnIndex("DIAS");
            	
            	
            	
            	int id =(Integer) JtableTabela.getModel().getValueAt(row, call);
            	String nome =  (String) JtableTabela.getModel().getValueAt(row, nomeCol);
            	String endereco = (String) JtableTabela.getModel().getValueAt(row, enderecoCol);
            	String telefone = (String) JtableTabela.getModel().getValueAt(row, telefoneCol);
            	Double valor = (Double) JtableTabela.getModel().getValueAt(row, valorCol);
            	int dias = (Integer) JtableTabela.getModel().getValueAt(row, diasCol);
				
				
				
				altId.setText(""+id);
            	altNome.setText(nome);
            	altEndereco.setText(endereco);
            	altTelefone.setText(telefone);
            	altValor.setText(""+valor);
            	altDuracao.setText(""+dias);
				
				Switch_screen (panel_2);
				
				
				
				
			}
		});
		 popupMenu.add(alterarMenu);
		 
		JtableTabela.setComponentPopupMenu(popupMenu);
		table = new JTable();
		
		
		panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 734, 633);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(93, 11, 631, 161);
		panel.add(scrollPane);
		
		
		

		scrollPane.setViewportView(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(124, 343, 117, 30);
		panel.add(comboBox);
		model= new DefaultTableModel (); 
		Object [] column = {"ID","NOME","ENDEREÇO","TELEFONE"};
		model.setColumnIdentifiers(column);
		table.setModel(model);
		ArrayList<Cliente> listaClientes = clienteServico.ListarCliente();
		
		for(Cliente cliente : listaClientes) {
			Vector row = new Vector();
			row.add(cliente.getId());
			row.add(cliente.getNome());
			row.add(cliente.getEndereco());
			row.add(cliente.getTelefone());
			
			model.addRow(row);
			
		}
			
		
		
		btnDadosDosClientes = new JButton("Dados dos clientes");
		btnDadosDosClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel);
			}
		});
		btnDadosDosClientes.setBounds(10, 113, 121, 33);
		contentPane.add(btnDadosDosClientes);
	}
	
	public void Switch_screen(JPanel p)
	{
		layeredPane.removeAll();
		layeredPane.add(p);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
}
