/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import br.com.ifba.util.Input;
import java.util.Random;
import static br.com.ifba.util.Input.SCANNER;


/**
 *
 * @author User
 */
public class usuarioBanco {
    public static void main(String[] args) {
        
        @SuppressWarnings("UnusedAssignment")
        int escolha = 1;        
        
        // Criando um número aleatorio para a conta
        Random rand = new Random();
        int numeroConta = 100000 + rand.nextInt(900000); // Gera de 100000 a 999999
        ContaBanco user = new ContaBanco(numeroConta, "", "", 0.0, false);
        
        System.out.println("\n\nMENU == BANCO");
        do {
            
            System.out.println("\nSelecione a acao desejada (0 para fechar)");
            System.out.println("1- Abrir uma Conta");
            System.out.println("2- Fechar um Conta");
            System.out.println("3- Depositar");
            System.out.println("4- Sacar");
            System.out.println("5- Pagar Mensalidade");
            System.out.println("6- Exibir Saldo");
            System.out.print("\n> ");
            escolha = Input.SCANNER.nextInt();
        
            switch(escolha) {
                case 0 -> System.out.println("\n\n === Finalizando Programa === \n\n");
                
                
                case 1 -> user.abrirConta();
                
                case 2 -> user.fecharConta();
                
                case 3 -> user.depositar();
                    
                case 4 -> user.sacar();
                
                case 5-> user.pagarMensal();
                
                case 6-> user.exibirDados();

                default -> System.out.println("\n\n Erro: Selecione uma opcao valida \n\n");
            }
            
        } while(escolha != 0);
    }
}
