/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

import br.com.ifba.atividade10.classes.PerfilUsuario;
import br.com.ifba.atividade10.classes.Usuario;
import static br.com.ifba.util.Input.SCANNER;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Criar perfil com permissões
        PerfilUsuario admin = Usuario.criarPerfil();
        
         // Criar usuário
        Usuario user1 = Usuario.criarUsuario(admin);
        
        user1.criaLog("Criação de perfil admin");
        user1.criaLog("Criação de um usuario");
        
        
        int escolha = 0;
        String senhaDigitada;
        

        
        do {
        System.out.println("\n\nMENU");
        System.out.print("0 - Sair\n"
                         + "1 - Login\n" 
                         + "2 - Realizar Acao\n" 
                         + "3 - Deslogar\n" 
                         + "4- toString(Usuario)\n"
                         + "5- toString(Sessao)\n"
                         + "6- toString(PerfilUsuario)\n"
                         + "7 - Exibir logs\n "
                         + ">  ");
        
        escolha = SCANNER.nextInt();
        SCANNER.nextLine(); // consome o ENTER pendente
  
        switch(escolha) {
            
        case 0-> System.out.println("\nFinalizando programa....");
            
        case 1-> 
        {
            System.out.println("Informe sua senha: ");
            senhaDigitada = SCANNER.nextLine();
            user1.logar(senhaDigitada);
        }
        
        case 2-> user1.realizarAcao();
        
        case 3-> user1.deslogar();
        
        // toString usuario
        case 4-> System.out.println(user1.toString());
        
        // toString sessao
        case 5-> user1.toStringSessao();
        
        // toString perfilUsuario
        case 6-> System.out.println(admin.toString());
        
        // Imprimte todos os logs
        case 7-> user1.imprimirLogs();
        
        default-> System.out.println("Erro: opcao invalida");
        }
        
        } while(escolha != 0);
    }
    
}
