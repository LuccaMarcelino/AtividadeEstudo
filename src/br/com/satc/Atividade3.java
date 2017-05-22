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
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float notas[] = new float[5];
        float soma = 0;
        
            for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota: ");
            notas[i] = input.nextFloat();
            soma = soma + notas[i];
       }
            for (int i = 0; i < 4; i++) {
                System.out.println("Suas notas: " + notas[i]);
        }
            System.out.println("Média: " + soma/4);
    }
}
