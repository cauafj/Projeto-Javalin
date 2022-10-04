package packmvn.persistencia;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.List;
import packmvn.modelo.Cliente;
import packmvn.util.Conexao;

public class UsuarioDAO implements DAO<Cliente>{

	@Override
	public void inserir(Cliente e) {
		String sql = "INSERT INTO Cliente (CPF, nome, senha) VALUES (?,?,?)";
        try( Connection con = Conexao.getConexao(); 
        PreparedStatement pstm = con.prepareStatement(sql, Statement.NO_GENERATED_KEYS)
        ) {
            pstm.setString(1, e.getCpf());
            pstm.setString(2, e.getNome());
            pstm.setString(3, e.getSenha());
        } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        
		
	}

	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listar(int limit, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alterar(Cliente e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
