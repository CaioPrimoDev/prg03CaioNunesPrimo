package br.com.ifba.principal;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        @SuppressWarnings("UnusedAssignment")
        int escolha = 1;
        Scanner scanner = new Scanner(System.in);        
        
        do {
            
            System.out.println("\n\nSelecione a atividade (0 para fechar): ");
            System.out.println("1- ..... [ATIVIDADE JA ENVIADA]");
            System.out.println("2- ..... [ATIVIDADE JA ENVIADA]");
            System.out.print("3- Calculadora de Idade\n> ");
            escolha = scanner.nextInt();
        
            switch(escolha) {
                case 0 -> System.out.println("\n\n === Menu finalizado === \n\n");
                case 1, 2 -> System.out.println("\n\n Atividade já enviada \n\n");
                case 3 -> // Chamando a main da interfaceIdade
                    br.com.ifba.atividade03.view.CalculadoraDeIdade.main(args);
                default -> System.out.println("\n\n Erro: Selecione uma opcao valida \n\n");
            }
            
        } while(escolha != 0);
    }
}