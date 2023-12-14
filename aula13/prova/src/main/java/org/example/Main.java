package org.example;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // O resultado tera o memso indice  do aluno em especificio
       ArrayList <Integer> resultados = new ArrayList<Integer>();
       ArrayList <String>  alunos = new ArrayList<String>();
       int pass= 0, repro = 0, faltou= 0;
        while (true){
            String qtdAlunos = JOptionPane.showInputDialog("Digite a quantidade de alunos").toUpperCase();

            while (qtdAlunos.matches("[A-Z]*") || Integer.parseInt(qtdAlunos) < 1){
                qtdAlunos = JOptionPane.showInputDialog("Digite a quantidade de alunos").toUpperCase();
            }

            for (int i = 0; Integer.parseInt(qtdAlunos) > i; i++){
                String aluno = JOptionPane.showInputDialog(String.format("Digite o nome do %d°",i + 1));
                String resultado = JOptionPane.showInputDialog(String.format("Escolha um dos três resultados \n 1-passou 2-reprovou 3-faltou")).toUpperCase();

                while (resultado.matches("[A-Z]*") || Integer.parseInt(resultado) > 3 || Integer.parseInt(resultado) < 1){
                    resultado = JOptionPane.showInputDialog(String.format("Escolha novamente um dos três resultados \n 1-passou 2-reprovou 3-faltou"));
                }
                // adiconado os valores de cada opção
                if (Integer.parseInt(resultado) == 1) {pass ++;}
                else if (Integer.parseInt(resultado) == 2) {repro ++;}
                else{faltou ++;}

                // adicionando os o resultado e o nome de cada aluno
                alunos.add(aluno);
                resultados.add(Integer.parseInt(resultado));

            }

            if (pass / Integer.parseInt(qtdAlunos) >= 0.7){
                JOptionPane.showMessageDialog(null, String.format("Curso Aprovado e reconhecido \nPassou = %d \n Reprovado %d\n Faltou %d",pass,repro,faltou));
            } else{
                JOptionPane.showMessageDialog(null, String.format("Exame realizado \nPassou = %d \n Reprovado %d\n Faltou %d",pass,repro,faltou));
            }

        }
    }
}