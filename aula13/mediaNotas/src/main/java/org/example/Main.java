package org.example;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int soma = 0;
        ArrayList<Integer> notasarr = new ArrayList<Integer>();
        while (true){
            String qtdNotas = JOptionPane.showInputDialog("Quantas notas deseja inserir").toUpperCase();
            while (qtdNotas.matches("[A-Z]*")){
                qtdNotas = JOptionPane.showInputDialog("Digite novamente a quantidade de notas que deseja inserir").toUpperCase();
            }


            for (int i = 0; Integer.parseInt(qtdNotas) > i; i++){
                String notas = JOptionPane.showInputDialog(String.format("Digite a nota %d",i + 1)).toUpperCase();

                while (notas.matches("[A-Z]*") || Integer.parseInt(notas) >  100 ||  Integer.parseInt(notas) < 1 ){
                    notas = JOptionPane.showInputDialog(String.format("Digite a nota novamente %d",i + 1));
                }

                notasarr.add(Integer.parseInt(notas));
            }

            for (int i = 0;notasarr.size() > i;i++) {soma += notasarr.get(i);}
            JOptionPane.showMessageDialog(null, String.format("Média final: %d", soma / notasarr.size()));

            String sair = JOptionPane.showInputDialog("Deseja sair (-1=sim -2 não)");
            if(sair.equals("-1")){
                break;
            }


        }
    }
}