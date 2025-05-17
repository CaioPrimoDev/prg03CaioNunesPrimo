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
public class Circulo extends Forma2D {

    public Circulo(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double calcularArea() {
        double raio = this.largura / 2;
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularVolume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
