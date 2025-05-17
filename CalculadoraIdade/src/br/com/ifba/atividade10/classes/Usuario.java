/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classes;

import br.com.ifba.util.Colors;
import static br.com.ifba.util.Input.SCANNER;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author User
 */
public class Usuario {
    private long id;
    private PerfilUsuario perfil;
    private List<LogAuditoria> logs = new ArrayList<>();
    private String nomeUser;
    private String email;
    private String senha;
    private LocalDateTime  ultimoLogin;
    private boolean ativo;
    private Sessao sessao;

    public Usuario(long id, PerfilUsuario perfil, String nomeUser, String email, String senha, boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUser = nomeUser;
        this.email = email;
        this.senha = senha;
        this.ultimoLogin = LocalDateTime.now();
        this.ativo = ativo;
    }

    public Usuario(int i, PerfilUsuario admin, String caio_Primo, String caioIfbaifbaedubr, String string, LocalDateTime now, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        @Override
    public String toString() {
        return "Usuario{" + "id=" + id 
                + ", perfil=" + perfil 
                + ", nomeUser=" + nomeUser 
                + ", email=" + email 
                + ", senha=" + senha 
                + ", ultimoLogin=" + ultimoLogin 
                + ", ativo=" + ativo + '}';       
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
   
    // Método para simular login e gerar log
    public void logar(String senhaDigitada) {

        if (this.senha.equals(senhaDigitada)) {  
            // Criar a sessão aqui
            String tokenGerado = UUID.randomUUID().toString();
            sessao = new Sessao(System.currentTimeMillis(), this, tokenGerado);
            
            criaLog("Login realizado com sucesso");
            System.out.println(Colors.VERDE + "\nLogin realizado!" + Colors.RESET);
            this.ultimoLogin = LocalDateTime.now();
            this.ativo = true;
            
        } else {
            criaLog("Tentativa de login com senha incorreta");
            System.out.println("Senha incorreta.");
        }
    }
    
    
    // Método para simular o logout
    public void deslogar() {
    
        if(sessao != null && this.ativo) {
            criaLog("Logout realizado com sucesso");
            System.out.println("Usuario deslogado");
            sessao = (Sessao) null; // Encerra a sessão
            this.ativo = false;
        } else {
            criaLog("Tentativa de Logout sem estar logado");
            System.out.println(Colors.VERMELHO + "\nUsuario ja estava deslogado" + Colors.RESET);
        }
    }
    
    
    // Cria um perfil manualmente
    public static PerfilUsuario criarPerfil() {  
        return new PerfilUsuario(1, "Administrador",Arrays.asList("CRIAR", "EDITAR", "EXCLUIR"));
    }
    
    
    // Cria um usuario manualmente
    public static Usuario criarUsuario(PerfilUsuario perfil) {        
        return new Usuario(1, perfil, "Caio Primo", "caioIfba@ifba.edu.br", "12345", false);
    }
    
    
    // Cria logs
    public void criaLog(String acao) {
        String ipSimulado = "127.0.0.1"; // valor fixo para este projeto
        long idLog = logs.size() + 1;    // ID incremental simples

        logs.add(new LogAuditoria(idLog, this, acao, ipSimulado));
    }

    
    // Método para ativar 'toString' da sessao
    public void toStringSessao(){
        System.out.println(sessao.toString());
    }
    
    
    // Método para exibir os logs
    public void imprimirLogs() {
        for (LogAuditoria log : logs) {
            System.out.println(log);
        }
    }
    
    
    
    public void realizarAcao() {
        
        if(!this.ativo) {
            System.out.println(Colors.VERMELHO + "Erro: status login: " + this.ativo + Colors.RESET);
            criaLog("Acao \"" + "realizar acao" + "\" falhou- Status login: " + this.ativo);
            return;
        }
        
        System.out.println("Escreva uma acao: ");
        perfil.imprimirPermissoes();
        System.out.print("> ");
        
        String acaoAtual = SCANNER.nextLine(); // Lê a ação atual
        
        if(perfil.validarAcao(acaoAtual)) { 
           System.out.println(Colors.VERDE + "SUCESSO" + Colors.RESET);
           criaLog("Ação \"" + acaoAtual + "\" realizada com sucesso");
           return;
           
        } else if (acaoAtual.trim().isEmpty()){  
           System.out.println(Colors.VERMELHO + "\nAcao vazia" + Colors.RESET);
           criaLog("Tentativa de realizar ação vazia");
           return;
           
        } else {
           System.out.println(Colors.VERMELHO + "\nAcao invalida" + Colors.RESET);
           criaLog("Ação \"" + acaoAtual + "\" invalida");
           return;   
        }
    }

}
