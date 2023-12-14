

package com.mycompany.graus_celsius;
import java.util.Scanner;


public class Graus_celsius {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os graus Celsius atual");
        float grauC = entrada.nextFloat();
        
        if (grauC > 35){
            System.out.println("O clima esta muito quente!");
            
        }
        
        else if (grauC >= 24){
            System.out.println("O clima esta quente");
        }
        
        else if (grauC >= 19 & grauC <= 23){
            System.out.println("O clima esta agradável");
        }
        
        else{
            System.out.println("O clima esta frio");
        }
    }
}
