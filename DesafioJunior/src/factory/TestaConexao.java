/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory; 

// Conexão SQL para Java: 
import java.sql.Connection;
// classe para tratamento de exceções:
import java.sql.SQLException; 
public class TestaConexao {     
    public static void main(String[] args) throws SQLException {
         Connection connection = new ConnectionFactory().getConnection();
         System.out.println("Conexão aberta!");
         connection.close();
     }
}
