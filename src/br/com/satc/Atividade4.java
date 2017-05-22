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
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ltr[] = new char[10];
        int cons = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite uma letra: ");
            ltr[i] = input.next().charAt(0);
        }
        for (int i = 0; i < 10; i++) {
            switch (ltr[i]) {
                case 'a':
                    ltr[i] = ' ';
                    break;
                case 'e':
                    ltr[i] = ' ';
                    break;
                case 'i':
                    ltr[i] = ' ';
                    break;
                case 'o':
                    ltr[i] = ' ';
                    break;
                case 'u':
                    ltr[i] = ' ';
                    break;
                default:
                    cons = cons + 1;
            }
        }
        System.out.println("O número de consoantes digitadas é: " + cons);
        for (int i = 0; i < 10; i++) {
            if (ltr[i] != ' ') {
                System.out.println("As consoantes digitadas são: " + ltr[i]);
            }
            
        }
    }
}
