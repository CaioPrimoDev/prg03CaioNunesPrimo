/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.shapes;

import br.com.ifba.atividade11.model.Forma2D;

/**
 *
 * @author User
 */
public class Triangulo extends Forma2D {

    public Triangulo(double altura, double largura) {
        super(altura, largura);
    }
    
    @Override
    public double calcularArea() {
        return ((this.altura * this.largura) / 2);
    } 

    @Override
    public double calcularVolume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
