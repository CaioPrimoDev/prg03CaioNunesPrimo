/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.util;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Input {
    
    public static final Scanner SCANNER = new Scanner(System.in);
    
    public static void fecharScanner() {
    Input.SCANNER.close();
    }
}
