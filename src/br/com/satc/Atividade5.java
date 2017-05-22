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
public class Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome[] = new String[10];
        float notas[] = new float[5];
        float aluno[] = new float[6];
        
        for (int i = 1; i <= 10; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.println("Qual sua nota? ");
            notas[j] = input.nextFloat();
            aluno[i] += notas[j];
        }
        aluno[i] = aluno[i]/4;
        System.out.println(aluno[i]);
        }
        for (int i = 0; i < 10; i++) {
            if(aluno[i] >= 7){
                System.out.println("Acima de 7: "+ aluno[i]);
            }
        }
    }
}