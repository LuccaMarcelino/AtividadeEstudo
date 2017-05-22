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
public class Atividade7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade[] = new int[6];
        double altura[] = new double[6];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Idade? ");
            idade[i] = input.nextInt();
            System.out.println("Altura? ");
            altura[i] = input.nextDouble();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println("Idade: " + idade[i]);
            System.out.println("Altura: " + altura[i]);
            System.out.println("------------------------");
        }
        
    }
    
}
