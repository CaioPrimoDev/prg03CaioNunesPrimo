/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.model;

/**
 *
 * @author User
 */
public abstract class Forma3D extends Forma {
    
    protected double altura;
    protected double largura;
    protected double comprimento;

    public Forma3D(double altura, double largura, double comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }
    
        public abstract void calcularArea();
        public abstract void calcularVolume();
    
}
