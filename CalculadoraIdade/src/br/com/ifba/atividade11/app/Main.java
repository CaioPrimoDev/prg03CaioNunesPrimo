/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.app;

import br.com.ifba.atividade11.model.Forma;
import br.com.ifba.atividade11.shapes.*;
import br.com.ifba.util.Colors;
import static br.com.ifba.util.Input.SCANNER;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<String> nomes = Arrays.asList(
            "QUADRADO", 
            "CIRCULO", 
            "TRIANGULO", 
            "CUBO", 
            "ESFERA", 
            "PIRAMIDE"
        );   
        Forma[] formas = new Forma[6];
        
        System.out.println("Selecione as medias que serão usadas");
        
        System.out.print("\nAltura: ");
        double altura = SCANNER.nextDouble();
        
        System.out.print("\nLargura: ");
        double largura = SCANNER.nextDouble();
        
        // Definindo objetos 2D
        formas[0] = new Quadrado(altura, largura); 
        formas[1] = new Circulo(altura, largura);
        formas[2] = new Triangulo(altura, largura);
        
        // Definindo objetos 3D
        formas[3] = new Cubo(0, largura, 0); 
        formas[4] = new Esfera (altura, largura, 0);
        formas[5] = new Piramide (altura, largura, 0);
        
        int i = 0;
        for(String nome : nomes) {
            System.out.println(Colors.VERDE + "= " + nome + " =" + Colors.RESET);
            formas[i].calcularArea();
            formas[i].calcularVolume();
            i++;
        }
    }
}
