package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Atribuição de variáveis
        ArrayList <Integer> listaCPF1 = new ArrayList<Integer>();
        ArrayList <Integer> listaCPF2 = new ArrayList<Integer>();
        int[] peso1 = {10,9,8,7,6,5,4,3,2};
        int[] peso2 = {11,10,9,8,7,6,5,4,3,2};
        ArrayList <Integer> digitos = new ArrayList<Integer>();
        int anterior1 = 0, anterior2 = 0, contador = 2 ;
        ArrayList <Integer> listaCompleta = new ArrayList<Integer>();

    // entrada do usuário
        Scanner entrada = new Scanner(System.in);
        System.out.println("Validador de CPF");
        System.out.println("Digite seu CPF");
        String cpf = entrada.next();
    // validação
        while (cpf.length() != 11){
            System.out.println("Quantidade de digitos invalido, por favor digite novamente");
            cpf = entrada.next();
        }
    // colocando os valores do input
    for (int v = 0; v < 1; v++) {
       for (int i = 0; i < 11;i++){
           
       }
        for (int i = 0; cpf.length() > i; i++) {
            listaCompleta.add(Integer.parseInt(String.valueOf(cpf.charAt(i))));
        }

        for (int i = 0; cpf.length() - 2 > i; i++) {
            listaCPF1.add(Integer.parseInt(String.valueOf(cpf.charAt(i))));
        }
        for (int i = 0; cpf.length() - 1 > i; i++) {
            listaCPF2.add(Integer.parseInt(String.valueOf(cpf.charAt(i))));
        }

        for (int i = 0; listaCPF1.size() > i; i++) {
            int multiplicacao = listaCPF1.get(i) * peso1[i];
            anterior1 += multiplicacao;

        }

        for (int i = 0; listaCPF2.size() > i; i++) {
            int multiplicacao = listaCPF2.get(i) * peso2[i];
            anterior2 += multiplicacao;

        }

        digitos.add(11 - (anterior1 % 11));
        digitos.add(11 - (anterior2 % 11));
        System.out.println(digitos);

        for (int i = 0; i < 2; i++) {
            if (digitos.get(i) < 2) {
                System.out.println("\n digito é 0");
            } else if (digitos.get(i) > 2) {
                System.out.printf("digito " + digitos.get(i));
            }
            if (digitos.get(1) != listaCompleta.get(listaCompleta.size() - 1) || digitos.get(0) != listaCompleta.get(listaCompleta.size() - 2)) {
                System.out.println(" \nO CPF é inválido");
                break;
            } else {
                System.out.println("CPF válido");
            }


            contador--;
        }
    }

    }
}