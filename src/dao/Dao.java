
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
    
public class Dao { 
    //Dados de Conexão com o banco de dados
    private String endereco = "localhost";
    private String porta = "3306";
    private String usuario = "root";
    private String senha = "";
    private Connection connection;
    
    public Connection getConnection() 
            throws SQLException, ClassNotFoundException{
        //Registra Driver JDBC
        Class.forName("com.mysql.jdbc.Driver");

        //Verifica se conexão está criada
        if ((connection == null)){
           connection = DriverManager.
                getConnection("jdbc:mysql://"+endereco+":"+porta, usuario, senha);
        }
        return connection;
    }
    
    public void fecharConexao() 
            throws SQLException, ClassNotFoundException{
        Connection connection = getConnection();
        connection.close();
    };    
}