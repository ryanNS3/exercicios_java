

package com.mycompany.cidadaoalfa;
import java.util.Scanner;
public class CidadaoAlfa {

    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Digite sua idade");
            
            int idade = entrada.nextInt();
            
            if (idade >= 18 &  idade < 71){
                System.out.println("Voçê pode votar e é obrigatório a votar");
            }
            
            else if (idade >= 15 || idade > 70){
                System.out.println("Voçê não é obrigado a votar, porem, é permitido o voto");
                
            }
            
            else{
                System.out.println("Voçê não pode votar!");
            }
       
        
    }
}
