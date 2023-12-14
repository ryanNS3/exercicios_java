package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog("Digite a letra do coneceito  ").toUpperCase();
        switch (opcao) {
            case "A","É","I","O","U":
                JOptionPane.showMessageDialog(null, "É vogal ");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Não é vogal");
        }
    }
}