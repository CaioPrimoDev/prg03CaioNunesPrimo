/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.shapes;

import br.com.ifba.atividade11.model.Forma3D;

/**
 *
 * @author User
 */
public class Cubo extends Forma3D {

    public Cubo(double altura, double largura, double comprimento) {
        super(altura, largura, comprimento);
    }

    @Override
    public void calcularArea() {
        System.out.println("Area: " + 6 * Math.pow(largura, 2));
    }

    @Override
    public void calcularVolume() {
        System.out.println("Volume: " + Math.pow(largura, 3));
    }
    
    
    
}
