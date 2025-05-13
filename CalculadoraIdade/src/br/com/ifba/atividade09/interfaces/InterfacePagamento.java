/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09.interfaces;

/**
 *
 * @author User
 */
public interface InterfacePagamento {
    
    String calcularTotal(String valor);
    void imprimirRecibo(String nome, String valor, String data, double valorFinal);
    
}
