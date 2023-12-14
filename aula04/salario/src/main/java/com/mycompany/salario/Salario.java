

package com.mycompany.salario;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        //array
        int[] myarray = {1,2,3,4,5,6,7,8,9,10};
        
        for (int i = 0; myarray.length > i; i++){
            System.out.println(myarray[i]);
            
        }
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu salário: ");
        float salario = entrada.nextFloat();
        if (salario < 0) {
            System.out.println("Salário incorreto");
            
        }
        
        else{
            float reajuste = salario * 0.19f;
            float salario_reaju = salario + reajuste;
            // saida
            System.out.println("*******************************");
            System.out.println("valor do salário = " + salario);
            System.out.println("Valor do reajuste = " + reajuste);
            System.out.println("Salário reajustado = " + salario_reaju);
            System.out.printf("R$ %.2f", reajuste);

            
        }
       
        
            }
}
