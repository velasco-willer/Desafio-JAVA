/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

/**
 *
 * @author smith
 */
public class Produtos {
  //declarando váriaveis
    int id;
    String descricao;
    String unidade;
    String valor;
  
    
    //metodos Get e Set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    } 
    public String getDescricao() { 
        return descricao;
    } 
    public void setDescricao(String descricao) { 
        this.descricao = descricao;
    } 
    public String getUnidade() { 
        return unidade;
    } 
    public void setUnidade(String unidade) { 
        this.unidade = unidade;
    }
    
    public String getValor() { 
        return valor;
    } 
    public void setValor(String valor) { 
        this.valor = valor;
    }
}
