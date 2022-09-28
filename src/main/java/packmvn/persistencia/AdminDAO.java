package packmvn.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import packmvn.modelo.Admin;
import packmvn.util.Conexao;
//DAO Data Access Object

public class AdminDAO implements DAO<Admin> {

	@Override
	public void inserir(Admin e) {
		String sql = "INSERT INTO admin (nome, cpf, senha) VALUES (?,?,?)";

		try (Connection con = Conexao.getConexao();
				PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			pstm.setString(1, e.getNome());
			pstm.setString(2, e.getCpf());
			pstm.setObject(3, e.getSenha());
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
		String sql = "DELETE FROM admin WHERE id = ?";

		try (var con = Conexao.getConexao(); var pstm = con.prepareStatement(sql)) {
			pstm.setInt(1, id);
			pstm.execute();
			pstm.close();
		} catch (SQLException exp) {
			exp.printStackTrace();
		}
	}

	@Override
	public List<Admin> listar(int limit, int offset) {
		var empregados = new ArrayList<Admin>();
		String sql = "SELECT e.id, e.nome, e.cpf FROM admin;";

		try (var con = Conexao.getConexao(); var pstm = con.prepareStatement(sql);) {
			pstm.setInt(1, limit);
			pstm.setInt(2, offset);
			ResultSet resposta = pstm.executeQuery();

			while (resposta.next()) {
				var nome = resposta.getString("nome");
				var cpf = resposta.getString("cpf");
				Admin e = new Admin(nome, cpf);
				empregados.add(e);
			}
			pstm.close();

		} catch (SQLException exp) {
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		return empregados;
	}

	@Override
	public void alterar(Admin e) {
		String sql = "UPDATE admin SET nome = ?, cpf = ?, senha = ? WHERE id = ?";

		try (var con = Conexao.getConexao(); var pstm = con.prepareStatement(sql)) {
			pstm.setString(1, e.getNome());
			pstm.setString(2, e.getCpf());
			pstm.setString(3, e.getSenha());
			pstm.setInt(4, e.getId());
			pstm.execute();
			pstm.close();
		} catch (SQLException exp) {
			exp.printStackTrace();
		}
	}

	@Override
	public Admin buscar(int idb) {
		String sql = "SELECT e.id, e.nome, e.cpf FROM admin e WHERE e.id = ?";
		Admin e = null;

		try (var con = Conexao.getConexao(); var pstm = con.prepareStatement(sql);) {
			pstm.setInt(1, idb);
			ResultSet resposta = pstm.executeQuery();
			resposta.next();

			var id = resposta.getInt("id");
			var nome = resposta.getString("nome");
			var cpf = resposta.getString("cpf");
			e = new Admin(nome, cpf);
			e.setId(id);

			pstm.close();

		} catch (SQLException exp) {
			exp.printStackTrace();
		}

		return e;
	}
}
