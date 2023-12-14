
package com.mycompany.conversor;

import java.util.Scanner;


public class Conversor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os graus atual em celsius:");
        float grausC = entrada.nextFloat();
        
        System.out.println("********************");
        System.out.println("Digite qual base de temperatura deseja converter 1- fahrenheit 2- kelvin");
        int opcao = entrada.nextInt();
        
        if (opcao == 1){
            float calculo = grausC * 1.8f + 32;
            System.out.printf("%.2f C convertido em fahrenheit = %.2f", grausC,calculo);
        }
        
        else if (opcao == 2){
            float calculo = grausC + 273.15f;
             System.out.printf("%.2f C convertido em kelvin = %.2f", grausC,calculo);
        }
        
        else{
            System.out.println("opcao incorreta");
        }
        
    }
}
