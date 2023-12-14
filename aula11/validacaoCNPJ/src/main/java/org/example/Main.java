package org.example;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite CNPJ");
        ArrayList <Integer> cnpjArr = new ArrayList<Integer>();
        ArrayList <Integer> cnpjArr2 = new ArrayList<Integer>();
        int multiplicacao = 0, multiplicacao2 = 0;
        Scanner entrada = new Scanner(System.in);
        String cnpj = entrada.next().replace("-", "");
        int[] digitos = new int[2];

        boolean roda= true, roda2 = true;

        // validaçaõ se o cpf tem letras
        while(roda){
            // verificação de letra
            for (int i = 0; cnpj.length() > i; i++){
                while(Character.isLetter(cnpj.charAt(i))){
                    cnpj = entrada.next().replace("-", "");
                }
            }
            // verificação de tamanho
            while (cnpj.length() != 14){
                cnpj = entrada.next().replace("-", "");
            }
            roda = false;

        }
        for (int i = 0; cnpj.length() -2 > i;i++){
            cnpjArr2.add(Integer.parseInt(String.valueOf(cnpj.charAt(i))));
        }
        // passando os valores do cnpj para inteiro
        for (int i = 0; cnpj.length() > i; i++){
            cnpjArr.add(Integer.parseInt(String.valueOf(cnpj.charAt(i))));
        }


        while(roda2) {
            for (int i = 0, v = 5, j = 0; i < 4; i++, v--, j++) {
                multiplicacao = multiplicacao + (cnpjArr.get(j) * v);
            }
            //i total de vezes do looping, v é o numero multiplicaddo e j é o indice da array
            for (int i = 8, v = 2, j = 11; i > 0; i--, v++, j--) {
                multiplicacao = multiplicacao + ((cnpjArr.get(j) * v));
            }

            int resto = multiplicacao % 11;

            if (resto == 0) {
                digitos[0] = 0;
                cnpjArr2.add(digitos[0]);
            } else {
                digitos[0] = 11 - resto;
                cnpjArr2.add(digitos[0]);
            }

            for (int i = 0, v = 6, j = 0; i < 5; i++, v--, j++) {
                multiplicacao2 = multiplicacao2 + (cnpjArr.get(j) * v);
            }

            for (int i = 8, v = 2, j = 12; i > 0; i--, v++, j--) {
                multiplicacao2 = multiplicacao2 + ((cnpjArr.get(j) * v));
            }

            resto = multiplicacao2 % 11;

            if (resto == 0) {
                digitos[1] = 0;
                cnpjArr2.add(digitos[1]);
            } else {
                digitos[1] = 11 - resto;
                cnpjArr2.add(digitos[1]);
            }
            System.out.println(digitos[1]);
            System.out.println(cnpjArr.get(cnpjArr.size() - 1));
            System.out.println(digitos[0]);


            if (digitos[0] == cnpjArr.get(cnpjArr.size() - 2) && digitos[1] == cnpjArr.get(cnpjArr.size() -1) ){
                System.out.println("CPF " + cnpj);
                System.out.println("Digitos " + digitos[0] + digitos[1]);
                System.out.println("CPF válido");
            } else{
                System.out.println("CPF invalido");

            }
            roda2 = false;
        }

    }
}