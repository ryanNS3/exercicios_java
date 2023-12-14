/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validacaoswitch;

import java.util.Scanner;

/**
 *
 * @author CT Desenvolvimento
 */
public class ValidacaoSwitch {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner entrada = new Scanner(System.in);
        int mes = entrada.nextInt();
        
        switch (mes) {
            case 1 :
                System.out.println("Janeiro");
                break;
                
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("junho");
                break;
            case 7:
                System.out.println("julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
                
            case 11:
                System.out.println("novembro");
                break;
            case 12:
                System.out.println("dezembro");
                break;
            default:
                System.out.println("Opção incorreton");
                
        }
    }
}
