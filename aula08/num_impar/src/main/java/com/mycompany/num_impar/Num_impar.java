

package com.mycompany.num_impar;


public class Num_impar {

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i < 150;i++){
            if (i % 2 != 0){
                soma += i;
                
            }
            
        }
        
        System.out.println(soma);
    }
}
