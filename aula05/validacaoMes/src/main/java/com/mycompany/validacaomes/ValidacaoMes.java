
package com.mycompany.validacaomes;

import java.util.Scanner;

public class ValidacaoMes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mes = entrada.nextInt();
        
        if (mes <13 & mes > 0){
            
            if (mes == 1){
                System.out.println("janeiro");
            }
            
            else if (mes == 2){
                System.out.println("Fevereiro");
            }
            
            else if (mes == 3){
                System.out.println("Março");
            }
            
            else if ( mes == 4){
                System.out.println("Abril");
                
            }
            
            else if (mes == 5){
                System.out.println("maio");
            }
            
            else if(mes == 6 ){
                System.out.println("junho");
            }
            
            else if(mes == 7){
                System.out.println("julho");
            }
            
            else if(mes == 8){
                System.out.println("Agosto");
            }
            
            else if(mes == 9){
                System.out.println("Setembro");
            }
            
            else if(mes == 10){
                System.out.println("outubro");
            }
            
            else  if(mes == 11){
                System.out.println("noembro");
            }
            
            else{
                System.out.println("dezembro");
            }
            
        }
        
        else{
            System.out.println("Mês invalido");
        }
    }
}
