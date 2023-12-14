package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String opcao = JOptionPane.showInputDialog("Digite a letra do coneceito  ").toUpperCase();
        switch (opcao) {
            case "A":
                JOptionPane.showMessageDialog(null, "Execelente");
                break;
            case "B":
                JOptionPane.showMessageDialog(null, "Otimo");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "Bom");
                break;
            case "D":
                JOptionPane.showMessageDialog(null, "Regular");
                break;
            case "E":
                JOptionPane.showMessageDialog(null, "Ruim");
                break;
            case "F":
                JOptionPane.showMessageDialog(null, "Nos vemos de novo no ano que vem");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção incorreta");
        }
    }

}