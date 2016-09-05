package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Paciente;

public class DaoPaciente extends Dao{
    
    public void salvar(Paciente paciente) 
            throws SQLException, ClassNotFoundException{
            Connection connection = getConnection();
            String insertTableSQL = 
                    " insert into agenda.paciente"
                            + " (Nome,Endereco,Cidade,CPF,Telefone)"
                            + " values"
                            + " (?,?,?,?,?)";
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(insertTableSQL);
            preparedStatement.setString(1, paciente.getNome());
            preparedStatement.setString(2, paciente.getEndereco());
            preparedStatement.setString(3, paciente.getCidade());
            preparedStatement.setString(4, paciente.getCpf());
            preparedStatement.setString(5, paciente.getTelefone());
            preparedStatement.execute();
            fecharConexao();
    }
    
    public void alterar(Paciente paciente) 
            throws SQLException, ClassNotFoundException{
        Connection connection = getConnection();
            String insertTableSQL = 
                    " update agenda.paciente"
                            + " set nome= ?,"
                            + "     cpf = ?,"
                            + "     endereco = ?,"
                            + "     cidade = ?,"
                            + "     telefone = ?"
                            + " where codigo = ?";
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(insertTableSQL);       
            preparedStatement.setString(1, paciente.getNome());
            preparedStatement.setString(2, paciente.getCpf());
            preparedStatement.setString(3, paciente.getEndereco());
            preparedStatement.setString(4, paciente.getCidade());
            preparedStatement.setString(5, paciente.getTelefone());
            preparedStatement.setInt(6, paciente.getCodigo());
            
            preparedStatement.execute();
    }
    
    public void excluir(int codigo) 
            throws SQLException, ClassNotFoundException, Exception{
            Connection connection = getConnection();
           
                String insertTableSQL = 
                        " delete from agenda.paciente where codigo = ?";
        PreparedStatement preparedStatement = connection.
                prepareStatement(insertTableSQL);
                preparedStatement.setInt(1, codigo);
                preparedStatement.execute();
    }
    
    public Paciente[] listarTodos() 
            throws SQLException, ClassNotFoundException{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.
                    prepareStatement(" select codigo, cpf, nome, telefone from agenda.paciente"
                                              + " order by nome");
            ResultSet rs =  preparedStatement.executeQuery();
            rs.last();
            Paciente pacientes[] = new Paciente[rs.getRow()];
            rs.beforeFirst();
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setCodigo(rs.getInt("codigo"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setNome(rs.getString("nome"));
                paciente.setTelefone(rs.getString("telefone"));
                pacientes[rs.getRow()-1] = paciente;
            }
            return pacientes;
    }
   
            public Paciente[] listartodosPornome(String nome) 
            throws SQLException, ClassNotFoundException{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.
                    prepareStatement(" select codigo, cpf, nome, telefone "
                                   + " from agenda.paciente"
                                   + " where nome like ?"
                                   + " order by nome"); 
            preparedStatement.setString(1, nome);
            ResultSet rs =  preparedStatement.executeQuery();
            rs.last();
            Paciente pacientes[] = new Paciente[rs.getRow()];
            rs.beforeFirst();
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setCodigo(rs.getInt("codigo"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setNome(rs.getString("nome"));
                paciente.setTelefone(rs.getString("telefone"));
                pacientes[rs.getRow()-1] = paciente;
            }
            return pacientes;
    }
        public Paciente[] listartodosPorCod(String cod) 
            throws SQLException, ClassNotFoundException{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.
                    prepareStatement(" select codigo, cpf, nome, telefone "
                                   + " from agenda.paciente"
                                   + " where codigo = ?"
                                   + " order by codigo"); 
            preparedStatement.setString(1, cod);
            ResultSet rs =  preparedStatement.executeQuery();
            rs.last();
            Paciente pacientes[] = new Paciente[rs.getRow()];
            rs.beforeFirst();
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setCodigo(rs.getInt("codigo"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setNome(rs.getString("nome"));
                paciente.setTelefone(rs.getString("telefone"));
                pacientes[rs.getRow()-1] = paciente;
            }
            return pacientes;
    } 
        
        public Paciente buscarPorId(int id) 
            throws SQLException, ClassNotFoundException{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.
                    prepareStatement(" select Codigo,Nome,Endereco,Cidade,CPF,Telefone"
                                              + " from agenda.paciente"
                                              + " where codigo = ?");
            preparedStatement.setInt(1, id);
            ResultSet rs =  preparedStatement.executeQuery();
            
            Paciente paciente = null;
            if (rs.next()){
                paciente = new Paciente();
                DaoPaciente daoPaciente = new DaoPaciente();
                paciente.setCodigo(rs.getInt("codigo"));
                paciente.setNome(rs.getString("nome"));
                paciente.setEndereco(rs.getString("endereco"));
                paciente.setCidade(rs.getString("cidade"));
                paciente.setCpf(rs.getString("cpf"));
                 paciente.setTelefone(rs.getString("telefone"));
                daoPaciente.fecharConexao();
            }
            
            return paciente;
    }
}