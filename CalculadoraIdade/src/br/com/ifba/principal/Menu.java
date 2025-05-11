package br.com.ifba.principal;

import br.com.ifba.util.Input;
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
            System.out.println("6- Tela com vetores");
            System.out.println("7- Tela com Fatorial");
            System.out.println("8- Conta do Banco");
            System.out.print("\n> ");
            escolha = scanner.nextInt();
        
            switch(escolha) {
                case 0 -> System.out.println("\n\n === Menu finalizado === \n\n");
                
                case 1, 2 -> System.out.println("\n\n Atividade já enviada \n\n");
                
                case 3-> br.com.ifba.atividade03.view.InterfaceIdade.main(args);
                    
                case 4-> br.com.ifba.atividade04.view.InterfaceGenio.main(args);
                
                case 5-> br.com.ifba.atividade05.view.InterfaceSlider.main(args);
                
                case 6-> br.com.ifba.atividade06.view.TelaVetor.main(args);
                
                case 7-> br.com.ifba.atividade07.view.TelaFatorial.main(args);
                
                case 8-> br.com.ifba.atividade08.usuarioBanco.main(args);

                default -> System.out.println("\n\n Erro: Selecione uma opcao valida \n\n");
            }
            
        } while(escolha != 0);
        
        Input.fecharScanner();
    }
}