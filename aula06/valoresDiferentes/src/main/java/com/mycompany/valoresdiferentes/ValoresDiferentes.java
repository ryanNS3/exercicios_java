

package com.mycompany.valoresdiferentes;

import java.util.Scanner;
public class ValoresDiferentes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float anterior = 0;
        float maior = 0;
        
        for (int i = 20; i > 0; i--){
            float num = entrada.nextFloat();
            if (num > anterior){
                maior = num;   
            } 
            
            anterior = num;   
            
        }
        
        System.out.println(maior);
    }
}
