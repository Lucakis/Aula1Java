package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteServico {

	Config config;
	
	public ClienteServico() {
		
		config = new Config();
		
	}
	
	public void AdicionarCliente(Cliente cliente) {
		Connection conn = config.CreateConnection();
		
		String sql = "INSERT INTO dados(nome, endereço, telefone, dias, valor) VALUES (?,?,?,?,?)";
		
		try {
			PreparedStatement pps = conn.prepareStatement(sql);
			pps.setString(1, cliente.getNome());
			pps.setString(2, cliente.getEndereco());
			pps.setString(3, cliente.getTelefone());
			pps.setInt(4, cliente.getDias());
			pps.setDouble(5, cliente.getValor());
			
			pps.execute();
			config.CloseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void AlterarCliente(Cliente cliente) {
		
Connection conn = config.CreateConnection();
		
		String sql = "UPDATE dados SET nome=?,endereço=?,telefone=?,dias=?,valor=? WHERE id=?";
		
		try {
			PreparedStatement pps = conn.prepareStatement(sql);
			pps.setString(1, cliente.getNome());
			pps.setString(2, cliente.getEndereco());
			pps.setString(3, cliente.getTelefone());
			pps.setInt(4, cliente.getDias());
			pps.setDouble(5, cliente.getValor());
			pps.setInt(6, cliente.getId());
			
			
			pps.execute();
			config.CloseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void ExcluirCliente(int id) {
		
		Connection conn = config.CreateConnection();
		
		String sql = "DELETE FROM dados WHERE id =?";
		
		try {
			PreparedStatement pps = conn.prepareStatement(sql);
			pps.setInt(1, id);
			
			pps.execute();
			config.CloseConnection();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	public ArrayList<Cliente> ListarCliente() {
		
		Connection conn = config.CreateConnection();
		
			String sql = "SELECT * from dados";
			ArrayList<Cliente> clientes = new ArrayList<Cliente>();
			Cliente cliente = null;
			try {
				PreparedStatement pps = conn.prepareStatement(sql);
				ResultSet resultado = pps.executeQuery();
				while(resultado.next()) {
					cliente= new Cliente();
					
					cliente.setId(resultado.getInt("id"));
					cliente.setNome(resultado.getString("nome"));
					cliente.setEndereco(resultado.getString("endereço"));
					cliente.setTelefone(resultado.getString("telefone"));
					cliente.setDias(resultado.getInt("dias"));
					cliente.setValor(resultado.getDouble("valor"));
					clientes.add(cliente);
				}
				
				pps.execute();
				config.CloseConnection();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			return clientes;
			}
		
	}
	

