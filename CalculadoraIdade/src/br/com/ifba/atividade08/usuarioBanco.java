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
        
        // Criando instância do dono Jubileu
        ContaBanco user1 = new ContaBanco(numeroConta, "", "Jubileu", 0.0, false);
        
        // Criando instância do dono Jubileu
        ContaBanco user2 = new ContaBanco(numeroConta, "", "Creuza", 0.0, false);
        
        // Pegando a referência da instância desejada
        ContaBanco contaAtual = escolherUser(user1, user2);
        
        System.out.println("\n\n== MENU - BANCO ==");
        do {
            
            System.out.println("\nSelecione a acao desejada (0 para fechar)");
            System.out.println("1- Abrir uma Conta");
            System.out.println("2- Fechar um Conta");
            System.out.println("3- Depositar");
            System.out.println("4- Sacar");
            System.out.println("5- Pagar Mensalidade");
            System.out.println("6- Exibir Saldo");
            System.out.println("7- Trocar Usuario");
            System.out.print("\n> ");
            escolha = SCANNER.nextInt();
        
            switch(escolha) {
                case 0 -> System.out.println("\n\n === Finalizando Programa === \n\n");
                
                case 1 -> contaAtual.abrirConta();
                
                case 2 -> contaAtual.fecharConta();
                
                case 3 -> contaAtual.depositar();
                    
                case 4 -> contaAtual.sacar();
                
                case 5-> contaAtual.pagarMensal();
                
                case 6-> contaAtual.exibirDados();
                
                case 7-> contaAtual = escolherUser(user1, user2);

                default -> System.out.println("\n\n Erro: Selecione uma opcao valida \n\n");
            }
            
        } while(escolha != 0);
    }
    
        // Função para transitar entre as instâncias (usuarios)
        public static ContaBanco escolherUser(ContaBanco user1, ContaBanco user2) {
            
        System.out.println("Escolha o usuário:\n1 - Jubileu\n2 - Creuza");
        int escolha = Input.SCANNER.nextInt();
        
        return (escolha == 1) ? user1 : user2;
    }
}
