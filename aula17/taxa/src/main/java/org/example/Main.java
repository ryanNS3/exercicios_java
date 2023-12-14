package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String opcao = JOptionPane.showInputDialog("Selecione a o que deseja calcular \n 1- natalidade \n 2-mortalidade ").toUpperCase();

        while( opcao.matches("[A-Z*]") ||)

        switch (opcao) {

            case "1":
                String habitantes = JOptionPane.showInputDialog("Digite a quantidade de habitantes");
                String criancas = JOptionPane.showInputDialog("Digite as crianças nascidas");
                JOptionPane.showMessageDialog(null, String.format("Taxa de natalidade = %d", (Integer.parseInt(criancas) * 1000) / Integer.parseInt(habitantes)));
                break;
            case "2":
                String habitantes2 = JOptionPane.showInputDialog("Digite a quantidade de habitantes");
                String obitos = JOptionPane.showInputDialog("Digite as crianças nascidas");
                JOptionPane.showMessageDialog(null, String.format("Taxa de mortalidade = %d", (Integer.parseInt(obitos) * 1000) / Integer.parseInt(habitantes2)) );


                break;
        }
    }
}