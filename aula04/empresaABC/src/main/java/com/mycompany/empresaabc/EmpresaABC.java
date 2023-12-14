

package com.mycompany.empresaabc;
import java.util.Scanner;


public class EmpresaABC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        while (true) {   
            
            System.out.println("Digite os gastos de mês de janeiro");
            float gastoJan = entrada.nextFloat();
            System.out.println("Digite os gastos de mês de fevereiro");
            float gastoFev = entrada.nextFloat();
            System.out.println("Digite os gastos de mês de março");
            float gastoMar = entrada.nextFloat();

            float gastoTotal = gastoJan + gastoFev + gastoMar;

            if (gastoTotal > 50000){
                System.out.printf("*************************");
                System.out.printf("\nMês de janeiro: %.2f \n Mês de fevereiro: %.2f \n Mês de março: %.2f \n Gasto total: %.2f", gastoJan,gastoFev,gastoMar,gastoTotal);
                System.out.println("\nUltrapassou o orçamento!");
                 System.out.println("Digite o 1-(sair) 2-(voltar)");
                int escolha = entrada.nextInt();
                
                if (escolha == 1){
                    break;
                }
                
                else{
                    continue;
                }
               
                
            }

            else{
                System.out.println("Não ultrapassou o limite!");
                System.out.printf("Mês de janeiro: %.2f \n Mês de fevereiro: %.2f \n Mês de março: %.2f \n Gasto total: %.2f", gastoJan,gastoFev,gastoMar,gastoTotal);
                int escolha = entrada.nextInt();
                
                if (escolha == 1){
                    break;
                }
                
                else{
                    continue;
                }
            }
            
        }
        
        
        
    }
}
