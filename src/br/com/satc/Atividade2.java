/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nmr[] = new double[11];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número ->");
            nmr[i] = input.nextDouble();          
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("Números digitados: " + ">" + nmr[i] + "<");
    }
    
}
}
