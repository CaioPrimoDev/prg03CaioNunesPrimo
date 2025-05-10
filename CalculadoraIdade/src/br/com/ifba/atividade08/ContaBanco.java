/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import br.com.ifba.util.Input;
import java.util.Scanner;
import static br.com.ifba.util.Input.SCANNER;


/**
 *
 * @author User
 */
public class ContaBanco {
    
        // Constantes que alteram a cor da saida de texto
        public static final String VERMELHO = "\u001B[31m";
        public static final String RESET = "\u001B[0m";
        public static final String VERDE = "\u001B[32m";
        public static final String AMARELO = "\u001B[33m";
        
        
               
    // Variaveis da Classe
    public int numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono, Double saldo, boolean status) {
        
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
        
        System.out.print("\nInforme o nome do Usuario\n> ");
        this.dono = Input.SCANNER.nextLine();
        
    }
    

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public void abrirConta() {
        
     // Verifica se a conta já existe 
     if (isStatus()){
         System.out.println(VERMELHO + "Erro: conta ja foi criada" + RESET);
         return;
     }
        
        System.out.println("Informe qual o seu tipo de conta:\n "
        + "cc - Conta Corrente\n"
        + "cp - Conta Poupanca\n\n");
        String tipoConta = Input.SCANNER.next();
        
        if(tipoConta.equalsIgnoreCase("cc")){
           this.status = true;
           this.tipo = "cc";
           this.saldo = 50.0;
        } else if (tipoConta.equalsIgnoreCase("cp")) {
           this.status = true;
           this.tipo = "cp";
           this.saldo = 150.0;
        } else {
           System.out.println(VERMELHO + "Erro: informe um tipo valido (cc/cp)" + RESET);
        }
        
    }
    public void fecharConta() {
     
     // Verifica se a conta existe 
     if (!isStatus()){
         System.out.println(VERMELHO + "Erro: conta ainda não criada" + RESET);
         return;
     }
        
     if (getSaldo() != 0){
         System.out.println(VERMELHO + "Erro: a conta ainda possui saldo" + RESET);
         return;
     } else if (getSaldo() == 0){
         this.status = false;
         System.out.println(AMARELO + "Sucesso! Conta deletada" + RESET);
     }
    }
    public void depositar() {
        
     // Verifica se a conta existe    
     if (!isStatus()){
      System.out.println(VERMELHO + "Erro: conta ainda não criada" + RESET);
      return;
     }
         
     System.out.println("Saldo atual: R$ " + getSaldo());
     System.out.print("Informe o valor a ser depositado: \n> ");
     Double valor = Input.SCANNER.nextDouble();
          
     //Atualiza o saldo após ser depositado
     setSaldo(getSaldo() + valor);
     System.out.println(VERDE + "Sucesso! saldo atual: R$ " + getSaldo() + RESET);
    }
    public void sacar() {
        
      // Verifica se a conta existe    
      if (!isStatus()){
         System.out.println(VERMELHO + "Erro: conta ainda não criada" + RESET);
         return;
      }
        
      if (getSaldo() == 0){
         System.out.println(VERMELHO + "Erro: a conta nao possui saldo" + RESET);
         return;
     } else if (getSaldo() != 0){
         
          System.out.println("Saldo atual: R$ " + getSaldo());
          System.out.print("Informe o valor a ser sacado: \n> ");
          
          Double valor = Input.SCANNER.nextDouble();
          
          if(valor > getSaldo()){
              System.out.println(VERMELHO + "Erro: saldo insuficiente" + RESET);
              return;
          }
          
          //Atualiza o saldo após ser sacado
          setSaldo(getSaldo() - valor);
          System.out.println(VERDE + "Sucesso! saldo atual: R$ " + getSaldo() + RESET);
     }
    }
    public void pagarMensal() {
          
      // Verifica se a conta existe  
      if (!isStatus()){
        System.out.println(VERMELHO + "Erro: conta ainda não criada" + RESET);
        return;
      }
      
      
      // Verifica se tem saldo
      if (getSaldo() == 0){
          System.out.println(VERMELHO + "Erro: saldo vazio" + RESET);
          
      } else {
      
          // Verifica o tipo da conta
          if(getTipo().equals("cc")) {
              
             if(getSaldo() < 12){
                 System.out.println(VERMELHO + "Erro: saldo insuficiente" + RESET);
                 return;
             }
             setSaldo(getSaldo() - 12);
             System.out.println(VERDE + "Sucesso! saldo atual: R$ " + getSaldo() + RESET);
          
          } else if(getTipo().equals("cp")) {
              
             if(getSaldo() < 20){
                 System.out.println(VERMELHO + "Erro: saldo insuficiente" + RESET);
                 return;
             }
             setSaldo(getSaldo() - 20);
             System.out.println(VERDE + "Sucesso! saldo atual: R$ " + getSaldo() + RESET);
          }
      }
    }
    public void exibirDados() {
        
      // Verifica se a conta existe  
      if (!isStatus()){
        System.out.println(VERMELHO + "Erro: conta ainda não criada" + RESET);
        return;
      }
    
        System.out.println("\n\n==============================");
        System.out.println("Numero da Conta: " + this.numConta);
        
        if (this.tipo.equals("cc")) {
            System.out.println("Tipo: " + "Conta Corrente");
        } else if (this.tipo.equals("cp")) {
            System.out.println("Tipo: " + "Conta Poupanca");
        }
        
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("Status: " + this.status);
        System.out.println("==============================");
    }
    
    
}
