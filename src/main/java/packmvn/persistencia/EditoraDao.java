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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void excluir(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Editora> listar(int limit, int offset) {
        String sql = "SELECT nome, cnpj, email  FROM Editora  LIMIT ? OFFSET ?";
        ArrayList<Editora> editoras = new ArrayList<>();
        try (Connection con = Conexao.getConexao();
             PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setInt(1,limit);
            pstm.setInt(2,offset);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                Editora e = new Editora(rs.getString("nome"),
                        rs.getString("cnpj"),rs.getString("email"));
                editoras.add(e);
            }
        } catch (SQLException exp) {
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
        return editoras;
    }

    @Override
    public void alterar(Editora e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Editora buscar(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    public void excluir(String cnpj) {
        String sql = "DELETE FROM Editora  WHERE cnpj = ? ";
        try (Connection con = Conexao.getConexao();
             PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1,cnpj);
            
            pstm.executeUpdate();
        } catch (SQLException exp) {
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }
   
}
