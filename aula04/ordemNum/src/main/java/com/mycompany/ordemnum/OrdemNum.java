

package com.mycompany.ordemnum;
import java.util.Scanner;


public class OrdemNum {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = entrada.nextInt();
        System.out.println("Digite o terceiro número:");
        int num3 = entrada.nextInt();
        
        if (num1 > num2 & num2 > num3){
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
            
        }
        
        else if (num1 > num3 & num3 > num2){
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        }
        
        else if (num2 > num1 & num1 > num3){
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
            
        }
        
        else if(num2 > num3 & num3 > num1){
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
            
        }
        
        else if(num3 > num1 & num1 > num2){
             System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
            
        }
        
        else{
             System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            
        }
    }
}
