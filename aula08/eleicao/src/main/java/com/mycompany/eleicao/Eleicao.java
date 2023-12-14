
package com.mycompany.eleicao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.Arrays;
public class Eleicao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo(a) ");
        int A=0,B=0,C=0,D=0, branco=0,nulo=0;
        int maiorP = 0, maiorS = 0, maiorT = 0, maiorQ = 0;
        int indiceP = 0, indiceS = 0, indiceT = 0,indiceQ = 0;
        
        for(int i = 0; i<20;i++){
            System.out.println("Eleiçaoes de 2023:");
            System.out.println("****************************************************************");
            System.out.println(" Candidato A -1 \n Candidato B -2 \n Candidato C -3 \n Candidato D -4 \nEm branco -5 \n Nulo -6 \nEscolha uma opção\n");
            int candidato = entrada.nextInt();
            
            // tratamento do voto
            while (candidato <= 0 || candidato > 6) {
                System.out.println("Opção digite novamente:");
                candidato = entrada.nextInt();
                
            }
            // Adição de votos
            switch (candidato) {
                case 1 -> A += 1;
                case 2 -> B += 1;
                case 3 -> C += 1;
                case 4 -> D += 1;
                case 5 -> branco += 1;
                case 6 -> nulo += 1;
                default -> {
                }
            }
        
        }
        int[] votos = {A,B,C,D};
        String[] candidatos = {"Candidato A","CandidatoB","CandidatoC","CandidatoD"};
        System.out.println(Arrays.toString(votos));
        
        for (int i = 0; i < votos.length; i++){
            if (votos[i] > maiorP){
                maiorP = votos[i];
                indiceP = i;
                System.out.println(maiorP);
                
                  
            } else if (votos[i] > maiorS){
                maiorS = votos[i];
                indiceS = i;
                System.out.println(maiorS);
                
            } else if (votos[i] > maiorT){
                maiorT = votos[i];
                indiceT = i;
                System.out.println(maiorT);
                
            } else if (votos[i] > maiorQ){
                maiorQ = votos[i];
                indiceQ = i;
            }
        }
        
        int porBranco = branco * 5;
        int porNulo = nulo * 5;
        int[] conjuntoV = {maiorP,maiorS,maiorT,maiorQ};
       
        System.out.println("************************************");
        System.out.printf(" Total de votos = 20 \n Candidato A : %d \n Candidato B : %d\n Candidato C : %d\n Candidato D: %d\n Total nulos: %d \n Total brancos: %d \n",A,B,C,D,nulo,branco);
        System.out.println("*******************************");
        System.out.printf("Porcentagem votos em branco : %d\n", porBranco);
        System.out.printf("Porecentagem votos em nulo: %d\n", porNulo);
        if (nulo < maiorP){
             System.out.printf("%s= %d\n %s = %d \n %s = %d \n %s = %d\n", candidatos[indiceQ],maiorQ,candidatos[indiceT],maiorT,candidatos[indiceS],maiorS,candidatos[indiceP], maiorP);
             System.out.printf("*********************************************\nCandidato Eleito: %s \n",candidatos[indiceP]);
            
        }
        else if (nulo > maiorP){
            System.out.println("Nenhum candidato eleito!");
            if (nulo > branco){
                System.out.printf("Maior quantidade de votos nulo: %d",nulo);
            } else{
                System.out.printf("Maior quantidade de votos branco: %d",branco);
                
            }
        }
    
        }
        
        
    }


