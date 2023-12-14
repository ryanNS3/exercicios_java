package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        String opcao = JOptionPane.showInputDialog("Digite a letra da categoria do produto ").toUpperCase();
        String valor = JOptionPane.showInputDialog("Digite o valor ").toUpperCase();
        Float valorInt = Float.parseFloat(valor);
        switch (opcao){
            case "A" : JOptionPane.showMessageDialog(null,String.format(" com de desconto 10 = %.2f ", valorInt - (valorInt * 0.10)));
                break;
            case "B" : JOptionPane.showMessageDialog(null,String.format(" com de desconto 20 = %.2f ", valorInt - (valorInt * 0.20)));
                break;
            case "C" : JOptionPane.showMessageDialog(null,String.format(" com de desconto 30 = %.2f ", valorInt - (valorInt * 0.30)));
                break;
            case "D" : JOptionPane.showMessageDialog(null,String.format(" com de desconto 40 = %.2f ", valorInt - (valorInt * 0.40)));
                break;
            case "E" : JOptionPane.showMessageDialog(null,String.format(" com de desconto 50 = %.2f ", valorInt - (valorInt * 0.50)));
                break;

            default: JOptionPane.showMessageDialog(null,"Você não tem desconto");
    }
}
    }