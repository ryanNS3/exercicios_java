package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String opcao = JOptionPane.showInputDialog("Selecione o seu Cargo \n 1- comum \n 2-funcionário \n 3- vip");
        String valor = JOptionPane.showInputDialog("Digite o valor da compra");
        Float valorF = Float.parseFloat(valor);
        switch (opcao) {
            case "1":
                JOptionPane.showMessageDialog(null, String.format("Cargo comum  \n a pagar: %f", valorF));
                break;
            case "2":
                JOptionPane.showMessageDialog(null, String.format("Cargo funcionário \n a pagar: %f", valorF - (valorF * 0.10)));
                break;
            case "3":
                JOptionPane.showMessageDialog(null, String.format("Cargo VIP \n a pagar: %f", valorF - (valorF * 0.05)));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção incorreta");
        }
    }

}