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
            System.out.println("3- Calculadora de Idade");
            System.out.println("4- Jogo do Gênio");
            System.out.println("5- Repeticao com slider");
            System.out.print("\n> ");
            escolha = scanner.nextInt();
        
            switch(escolha) {
                case 0 -> System.out.println("\n\n === Menu finalizado === \n\n");
                
                case 1, 2 -> System.out.println("\n\n Atividade já enviada \n\n");
                
                case 3 -> // Chamando a main da InterfaceIdade
                    br.com.ifba.atividade03.view.InterfaceIdade.main(args);
                    
                case 4 -> br.com.ifba.atividade04.view.InterfaceGenio.main(args);
                
                case 5-> br.com.ifba.atividade05.view.InterfaceSlider.main(args);

                default -> System.out.println("\n\n Erro: Selecione uma opcao valida \n\n");
            }
            
        } while(escolha != 0);
    }
}