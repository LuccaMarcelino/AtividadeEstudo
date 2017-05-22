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
public class Atividade6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nmr[] = new int[5];
        int soma = 0;
        int mult = 1;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            nmr[i] = input.nextInt();
            soma = soma + nmr[i];  
            mult = mult * nmr[i];
    }
        System.out.println("Soma: " + soma);
        System.out.println("Mult: " + mult);
  }  
}
