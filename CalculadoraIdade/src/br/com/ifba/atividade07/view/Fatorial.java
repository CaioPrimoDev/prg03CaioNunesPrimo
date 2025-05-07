/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class Fatorial {
    private JLabel lblF; // variável para guardar a referência ao JLabel
    private JLabel lblR; // variável para guardar a referência ao JLabel

    public void setLabel(JLabel lblFormula, JLabel lblResultado) {
        this.lblF = lblFormula;
        this.lblR = lblResultado;
    }
    
    public void setValor(int num){
        int resultado = getFatorial(num);     // calcula o fatorial
        String formula = getFormula(num);     // monta a fórmula como String
        
        lblF.setText(formula + "   =");
        lblR.setText(Integer.toString(resultado));
    }
    
    public int getFatorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * getFatorial(num - 1);
    }
    
    public String getFormula(int num) {   
        if (num == 1) {
            return "1";
        }
        return num + " x " + getFormula(num - 1);
    }
    
}
