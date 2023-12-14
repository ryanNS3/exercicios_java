/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conjuntodados;

import java.util.Scanner;

public class ConjuntoDados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contF = 0;
        int contM = 0;
        float maiorM = 0;
        float maiorF = 0;
        float menorM = 100;
        float menorF = 100;
        float mediaF = 0;
        float mediaM = 0;
        float menor = 0;
        float maior = 0;
        
        for (int i = 10; i > 1; i--){
            System.out.println("Digite o seu sexo(1-feminino 2-masculino)");
            int sexo = entrada.nextInt();
            
            
            if (sexo == 1) {
                contF += 1;
                System.out.println("Digite sua altura: ");
                float alturaF = entrada.nextFloat();
                mediaF = alturaF / contF;
                
                if (alturaF > maiorF){
                    maiorF = alturaF;
                }
                
                else{
                    menorF = alturaF;
                }
                
                
                
            }
            
            else if (sexo == 2){
                contM += 1;
                System.out.println("Digite sua altura: ");
                float alturaM = entrada.nextFloat();
                mediaM = alturaM / contM;
                
                 if (alturaM > maiorM){
                    maiorM = alturaM;
                }
                
                else{
                    menorM = alturaM;
                }
                
               
                
                
            }
            
            else{
                System.out.println("opção incorreta");
            }
            
            
            
        }
        while(true){
            if (menorF < menorM){
            menor = menorF;
            break;
        }
        
        else if (menorM < menorF){
            menor = menorM;
            break;
        }
            
        }
        
        while (true) {
            if (maiorM > maiorF){
                maior = maiorM;
                break;
            }
            
            else{
                maior = maiorF;
                break;
            }
            
        }
        System.out.println("******************************************");
        System.out.println("maior altura geral");
        System.out.println(maior);
        System.out.println("menor altura geral");
        System.out.println(menor);
        System.out.println("Média de altura dos homens:");
        System.out.println(mediaM);
        System.out.println("Número total de mulheres");
        System.out.println(contF);
       
       
        
        
        
        
        
    }
}
