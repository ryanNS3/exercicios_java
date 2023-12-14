

package com.mycompany.telefone;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Telefone {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> letrasArr = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        int i = 0;
        int a = 0;
        while ( a <= 15) {     
            String letras = entrada.next();
            letrasArr.add(letras);
            
            
            System.out.println("Deseja adcionar mais uma letra = (y-yes n-no)");
            String adicionar = entrada.next();
            if ("n".equals(adicionar)) {
               break;
            } 
            
           a++;
            
        }
            
        while (letrasArr.size() > i) {
            
            if ("a".equals(letrasArr.get(i)) || "b".equals(letrasArr.get(i)) || "c".equals(letrasArr.get(i))){
                numeros.add(2);
            }
            
            else if ("d".equals(letrasArr.get(i)) || "e".equals(letrasArr.get(i)) || "f".equals(letrasArr.get(i))){
                numeros.add(3);
            }
            
            else if ("g".equals(letrasArr.get(i)) || "h".equals(letrasArr.get(i)) || "i".equals(letrasArr.get(i))){
                numeros.add(4);
                
            }
            
            else if ("j".equals(letrasArr.get(i)) || "k".equals(letrasArr.get(i)) || "l".equals(letrasArr.get(i))){
                numeros.add(5);
            }
            
            else if ("m".equals(letrasArr.get(i)) || "n".equals(letrasArr.get(i)) || "o".equals(letrasArr.get(i))){
                   numeros.add(6);
        }
            else if ("s".equals(letrasArr.get(i)) || "p".equals(letrasArr.get(i)) || "q".equals(letrasArr.get(i)) || "r".equals(letrasArr.get(i))){
                numeros.add(7);
            }
            
            else if("t".equals(letrasArr.get(i)) || "u".equals(letrasArr.get(i)) || "v".equals(letrasArr.get(i))){
                numeros.add(8);
            } 
            else{
                numeros.add(9);
            }
            i++;
            
        }
        
        System.out.printf("Letras selecionadas %s \n", letrasArr);
        System.out.println(numeros);
        
        
            
        }
}
      

