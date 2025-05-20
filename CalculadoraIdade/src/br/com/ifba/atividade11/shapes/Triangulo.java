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
    public void calcularArea() {
        System.out.println("Area: " + ((this.altura * this.largura) / 2));
    } 

    @Override
    public void calcularVolume() {
        System.out.println("Volume: " + 0);
    }
}
