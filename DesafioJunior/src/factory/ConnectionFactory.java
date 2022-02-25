/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
// Importações de classes necessárias para o funcionamento do programa 
// Conexão SQL para Java: 
import java.sql.Connection; 
// driver de conexão SQL para Java :
import java.sql.DriverManager; 
// classe para tratamento de exceções:
import java.sql.SQLException; 
/**
 *
 * @author smith
 */
public class ConnectionFactory {
       public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://localhost/desafio","root","");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }  
}


