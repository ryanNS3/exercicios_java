

package com.mycompany.bittrocados;

import java.util.Scanner;
public class BitTrocados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 1 5 10 50
        int[] bits =  {0, 0,0,0};
        System.out.println("Bem vindo ao caixa eletônico!");
        System.out.println("-------------------------------------------");
        System.out.println("Digite o valor que deseja sacar \nNotas disponiveis = 1$B 5$B 10$B 50$B\n ");
        int saque = entrada.nextInt();
        System.out.println("Sacando......");
        while (saque >= 50) {            
            saque = saque - 50;
            bits[3] ++;
        }
        
        while (saque >= 10) {
            saque = saque - 10;
            bits[2] ++;
        }
        
        while (saque >= 5) {
            saque = saque - 5;
            bits[1] ++;
        }
        
        while (saque >= 1) {
            saque = saque - 1;
            bits[0] ++;
        }
        
        System.out.printf("Notas utlizadas : 1bit %d 5bit %d 10bit %d 50bit %d", bits[0],bits[1],bits[2],bits[3]);
         
    }
}
