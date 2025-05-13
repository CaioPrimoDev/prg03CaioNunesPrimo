/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.service;

import br.com.ifba.atividade09.interfaces.InterfacePagamento;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author User
 */
public class PagamentoCartao implements InterfacePagamento {
    
    @Override
    public String calcularTotal(String valor) {
        double dinheiro = Double.parseDouble(valor) * 1.05; // 5% de acréscimo
        
        return Double.toString(dinheiro);
    }
    
    @Override
public void imprimirRecibo(String nome, String valor, String data, double valorFinal) {
        // Campo da forma de pagamento (atualmente vazio)
        String formaPagamento = "CARTAO";

        // Criar a janela
        JFrame frame = new JFrame("Recibo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Montar o texto do recibo
        String recibo = "RECIBO\n\n"
                      + "Recebemos de: " + nome + "\n"
                      + "Valor: " + valor + "\n"
                      + "Valor Final: " + valorFinal + "\n"
                      + "Forma de pagamento: " + formaPagamento + "\n"
                      + "Referente a: compra" + "\n"
                      + "Data: " + data + "\n\n"
                      + "Assinatura: ______________________";

        // Criar área de texto
        JTextArea textArea = new JTextArea(recibo);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Adicionar barra de rolagem
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Adicionar à janela
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
