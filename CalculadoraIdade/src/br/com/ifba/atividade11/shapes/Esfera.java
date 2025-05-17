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
public class Esfera extends Forma3D {
    
    private double raio;

    public Esfera(double altura, double largura, double comprimento) {
        super(altura, largura, comprimento);
        this.raio = largura / 2;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double calcularVolume() {
        return (4 * Math.PI * Math.pow(this.raio, 3)) / 3;
    }  
}
