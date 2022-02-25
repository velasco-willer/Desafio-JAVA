/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
//importando pacotes
import factory.ConnectionFactory;
import cadastro.Cliente;
import cadastro.Produtos;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author smith
 */
public class ClienteDAO {
    private Connection connection;
    int id;
    String nome;
    String cpf;
    String telefone;
    String email;
    public ClienteDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Cliente cliente){ 
        String sql = "INSERT INTO clientes(nome,cpf,telefone,email) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefone());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
    }

        public void adicionaProduto(Produtos produto){ 
        String sql = "INSERT INTO produto(descricao,unidade,valor) VALUES(?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setString(2, produto.getUnidade());
            stmt.setString(3, produto.getValor());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
    }


}
