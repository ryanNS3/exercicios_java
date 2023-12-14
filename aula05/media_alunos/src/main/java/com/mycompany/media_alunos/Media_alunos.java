
package com.mycompany.media_alunos;

import java.util.Scanner;
public class Media_alunos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        float maior = 0;
        float menor = 0;
       
        float soma = 0;
        
        for (int i = 10; i > 1;i--){
            System.out.println("Digite sua primeira nota ");
            float nota1 = entrada.nextFloat();
            System.out.println("Digite sua segunda nota ");
            float nota2 = entrada.nextFloat();
            
            float media = (nota1 + nota2) / 2;
             soma += media;
             
             if (media > maior){
                 maior = media;
                 
             } else if (media < menor){
                 menor = media;
             }
            
            
            
            
            if (media >= 80){
                System.out.println("Aprovado");
            } else if (media >= 50){
                System.out.println("Recuperação");
            } else{
                System.out.println("Reprovado");
            }
            
            
            
        }
        
         float mediag = soma / 10;
        
        System.out.println("*************************");
        System.out.println("Média geral" + mediag);
        System.out.println("Maior média = " + maior);
        System.out.println("Menor média = " + menor);
        
        
    }
}
