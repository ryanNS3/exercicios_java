
package com.mycompany.calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner entrada = new Scanner(System.in);
        
        while (true) {
            System.out.println("Bem vindo a calculadora");
            System.out.println("********************************************");
            System.out.println("\nDigite a operação aritmética desejada(\n1- +\n 2- -\n 3- *\n 4- /\n)");
            int operacao = entrada.nextInt();
            System.out.println("*********************************************");
            
             System.out.println("Digite o primeiro número");
             float num1  = entrada.nextFloat();
             System.out.println("Digite o segundo número");
             float num2 = entrada.nextFloat();
             
             if (operacao == 1){
                 float resultado = num1 + num2;
                 System.out.printf("%.2f + %.2f = %.2f", num1,num2,resultado);
                 System.out.println("Deseja sair?(1- yes 2- no)");
                 int sair = entrada.nextInt();
                 
                 if (sair == 1){
                     break;
                 }
         
             }
             
             else if( operacao == 2){
                 float resultado = num1 - num2;
                 System.out.printf("%.2f - %.2f = %.2f", num1,num2,resultado);
                 
                  int sair = entrada.nextInt();
                 
                 if (sair == 1){
                     break;
                 }
                 
             }
             
             else if(operacao == 3){
                  float resultado = num1 * num2;
                  System.out.printf("%.2f X %.2f = %.2f", num1,num2,resultado);
                  
                  int sair = entrada.nextInt();
                 
                 if (sair == 1){
                     break;
                 }
               
             }
             
             else if(operacao == 4){
                 if (num2 == 0) {
                     System.out.println("valor incorreto, não possivel dividir o valor por 0");
                     
                 }
                 
                 else{
                      float resultado = num1 / num2;
                      System.out.printf("%.2f / %.2f = %.2f", num1,num2, resultado);
                       int sair = entrada.nextInt();
                 
                    if (sair == 1){
                        break;
                    }
                     
                 }
                 
                
                 
                 
                  
             }
             
             else{
                 System.out.println("Escolha incorreta");
             }
 
        }
    }
}
