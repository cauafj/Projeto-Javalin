package packmvn.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import packmvn.modelo.Livro;
import packmvn.util.Conexao;

public class LivroDAO implements DAO<Livro>{

	@Override
	public void inserir(Livro e) {
		String sql = "INSERT INTO Livro (nome, descricao, editora, fkAutor, imageURL) VALUES (?,?,?,?,?)";

		try (Connection con = Conexao.getConexao();
				PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			pstm.setString(1, e.getNome());
			pstm.setString(2, e.getDescricao());
			pstm.setString(3, e.getEditora());
			pstm.setInt(4, e.getAutor().getId());
			pstm.setString(5, e.getImageURL());
			pstm.executeUpdate();

			ResultSet rs = pstm.getGeneratedKeys();
			rs.next();

			int id = rs.getInt("id");
			e.setId(id);

			pstm.close();
		} catch (SQLException exp) {
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}

	@Override
	public void excluir(int id) {
		String sql = "DELETE FROM livro WHERE id = ?";
		
	}

	@Override
	public List<Livro> listar(int limit, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alterar(Livro e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Livro buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
