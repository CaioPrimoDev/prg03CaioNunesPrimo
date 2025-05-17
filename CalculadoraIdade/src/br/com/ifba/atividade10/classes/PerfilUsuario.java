/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classes;

import java.util.List;

/**
 *
 * @author User
 */
public class PerfilUsuario {
    
    private long id;
    private String descricao;
    private List<String> permissoes;

    public PerfilUsuario(long id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }

    @Override
    public String toString() {
        return "PerfilUsuario{" 
                + "id=" + id 
                + ", descricao=" + descricao 
                + ", permissoes=" + permissoes + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }
    
    public void imprimirPermissoes() {
        int i = 1;
        for (String permissao : permissoes) {
             System.out.println("[" + i + "]" + permissao);
        }
 
    }
    
    public boolean validarAcao(String acao) {
        for (String permissao : permissoes) {
            if(permissao.equalsIgnoreCase(acao)){
                return true;
            }
        }   
        return false;
    }
    
    
}
