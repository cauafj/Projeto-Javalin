package packmvn.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import packmvn.modelo.Editora;
import packmvn.util.Conexao;

public class EditoraDao implements DAO<Editora> {

    @Override
    public void inserir(Editora e) {
        String sql = "INSERT INTO Editora (nome, cnpj, email) VALUES (?,?,?)";

        try (Connection con = Conexao.getConexao();
                PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, e.getNome());
            pstm.setString(2, e.getCnpj());
            pstm.setString(3, e.getEmail());
            ResultSet rs = pstm.executeQuery();
            rs.next();
            e.setId(rs.getInt("id"));
            rs.close();
        } catch (SQLException exp) {
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }

    }

    @Override
    public void alterar(Editora e) {
        String sql = "UPDATE editora SET cnpj = ?, nome = ?, email = ? WHERE id = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, e.getCnpj());
            pstm.setString(2, e.getNome());
            pstm.setString(3, e.getEmail());
            pstm.setInt(4, e.getId());
            
            pstm.executeUpdate();
        } catch (SQLException exp) {
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }

    }

    @Override
    public void excluir(int id) {
        String sql = "DELETE FROM Editora  WHERE id = ? ";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setInt(1, id);

            pstm.executeUpdate();
        } catch (SQLException exp) {
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }

    }

    @Override
    public List<Editora> listar(int limit, int offset) {
        String sql = "SELECT id, nome, cnpj, email  FROM Editora  LIMIT ? OFFSET ?";
        ArrayList<Editora> editoras = new ArrayList<>();
        try (Connection con = Conexao.getConexao();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setInt(1, limit);
            pstm.setInt(2, offset);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Editora e = new Editora(rs.getInt("id"), rs.getString("nome"),
                        rs.getString("cnpj"), rs.getString("email"));
                editoras.add(e);
            }
            rs.close();
        } catch (SQLException exp) {
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
        return editoras;
    }

    @Override
    public Editora buscar(int id) {
        String sql = "SELECT id, nome, cnpj, email  FROM Editora  WHERE id = ? ";
        Editora edi = null;
        try (Connection con = Conexao.getConexao();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();
            rs.next();
            edi = new Editora(rs.getInt("id"), rs.getString("nome"),
                    rs.getString("cnpj"), rs.getString("email"));
            rs.close();
        } catch (SQLException exp) {
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }

        return edi;
    }

}
