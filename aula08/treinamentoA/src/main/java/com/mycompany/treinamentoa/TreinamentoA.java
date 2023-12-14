

package com.mycompany.treinamentoa;
import java.util.Scanner;
public class TreinamentoA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        
        
        int[] num = new int[150];
        int anterior = 0;
        for (int i = 0;i < 150; i++){
            num[i] = i;
        }
        
        for (int n:num){
            System.out.println(n + anterior);
            anterior += n;
        }
    }
}
