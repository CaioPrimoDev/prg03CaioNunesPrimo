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
public class Piramide extends Forma3D {
    
    private double apotema;
    
    // new Piramide (x, y, null)

    public Piramide(double altura, double largura, double comprimento) {
        super(altura, largura, comprimento);
        this.apotema = Math.sqrt(Math.pow(largura / 2.0, 2) + Math.pow(altura, 2));
    }

    @Override
    public void calcularArea() {
        System.out.println("Area: " + (Math.pow(largura, 2) + (2 * largura * apotema)));
    }

    @Override
    public void calcularVolume() {
        System.out.println("Volume: " + ((Math.pow(largura, 2) * altura) / 3));
    }
    
    
    
}
