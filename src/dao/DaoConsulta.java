
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Consulta;

public class DaoConsulta extends Dao{
    
    public void salvar(Consulta consulta) 
            throws SQLException, ClassNotFoundException{
            Connection connection = getConnection();
            String insertTableSQL = 
                    " insert into agenda.consulta"
                            + " (Paciente,Hora,Data)"
                            + " values"
                            + " (?,?,?)";
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(insertTableSQL);
            preparedStatement.setString(1, consulta.getPaciente());
            preparedStatement.setString(2, consulta.getHora());            
            preparedStatement.setString(3, consulta.getData());
            preparedStatement.execute();
            fecharConexao();
    }
    
    public void alterar(Consulta consulta) 
            throws SQLException, ClassNotFoundException{
        Connection connection = getConnection();
            String insertTableSQL = 
                    " update agenda.consulta"
                            + " set paciente = ?,"
                            + "     hora = ?,"
                            + "     data = ?"
                            + " where codigo = ?";
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(insertTableSQL);
            preparedStatement.setString(1, consulta.getPaciente());
            preparedStatement.setString(2, consulta.getHora());
            preparedStatement.setString(3, consulta.getData());
            preparedStatement.setInt(4, consulta.getCodigo());
            preparedStatement.execute();
    }
    
    public void excluir(int codigo) 
            throws SQLException, ClassNotFoundException, Exception{
            Connection connection = getConnection();
        
            String insertTableSQL = 
                        " delete from agenda.consulta where codigo = ?";
        PreparedStatement preparedStatement = connection.
                prepareStatement(insertTableSQL);
                preparedStatement.setInt(1, codigo);
                preparedStatement.execute();
    }
        
    public Consulta[] listarTodosporData(String dat) 
            throws SQLException, ClassNotFoundException{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.
                    prepareStatement(" select codigo,paciente,hora from agenda.consulta"
                                       + " where data = ?" 
                                       );
            preparedStatement.setString(1, dat);
            ResultSet rs =  preparedStatement.executeQuery();
            rs.last();
            Consulta consultas[] = new Consulta[rs.getRow()];
            rs.beforeFirst();
            while (rs.next()) {
                Consulta consulta = new Consulta();
                consulta.setCodigo(rs.getInt("codigo"));
                consulta.setPaciente(rs.getString("Paciente"));
                consulta.setHora(rs.getString("Hora"));
                consultas[rs.getRow()-1] = consulta;
            }
            return consultas;
    }  
    
    public Consulta[] listarTodos() 
            throws SQLException, ClassNotFoundException{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.
                    prepareStatement(" select codigo,paciente,hora,data from agenda.consulta"
                                         + " order by paciente");
   
            ResultSet rs =  preparedStatement.executeQuery();
            rs.last();
            Consulta consultas[] = new Consulta[rs.getRow()];
            rs.beforeFirst();
            while (rs.next()) {
                Consulta consulta = new Consulta();
                consulta.setCodigo(rs.getInt("codigo"));
                consulta.setPaciente(rs.getString("Paciente"));
                consulta.setHora(rs.getString("Hora"));
                consulta.setData(rs.getString("Data"));
                consultas[rs.getRow()-1] = consulta;
            }
            return consultas;
    }
    
     public Consulta buscarPorId(int id) 
            throws SQLException, ClassNotFoundException{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.
                    prepareStatement(" select codigo, paciente, data, hora"
                                              + " from agenda.consulta"
                                              + " where codigo = ?");
            preparedStatement.setInt(1, id);
            ResultSet rs =  preparedStatement.executeQuery();
            
            Consulta consulta = null;
            if (rs.next()){
                consulta = new Consulta();
                DaoConsulta daoConsulta = new DaoConsulta();
                consulta.setCodigo(rs.getInt("codigo"));
                consulta.setPaciente(rs.getString("paciente"));
                consulta.setData(rs.getString("data"));
                consulta.setHora(rs.getString("hora"));
                daoConsulta.fecharConexao();
            }
            
            return consulta;
    }
}