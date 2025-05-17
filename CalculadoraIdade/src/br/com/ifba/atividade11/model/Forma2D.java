/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.model;

/**
 *
 * @author User
 */
public abstract class Forma2D extends Forma {
    
    protected double altura;
    protected double largura;

    public Forma2D(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    public abstract double calcularArea();
    
}
