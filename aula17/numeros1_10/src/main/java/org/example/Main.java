package org.example;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String numeros = JOptionPane.showInputDialog("Digite um número");


        switch (Integer.parseInt(numeros)){
            case 1: JOptionPane.showMessageDialog(null,"Você escolheu o número 1") ;
            break;
            case 2: JOptionPane.showMessageDialog(null,"Você escolheu 2");
                break;
            case 3: JOptionPane.showMessageDialog(null,"Você escolheu 3");
                break;
            case 4: JOptionPane.showMessageDialog(null,"Você escolheu 4");
                break;
            case 5: JOptionPane.showMessageDialog(null,"Você escolheu 5");
                break;
            case 6: JOptionPane.showMessageDialog(null,"Você escolheu 6");
                break;
            case 7: JOptionPane.showMessageDialog(null,"Você escolheu 7");
                break;
            case 8: JOptionPane.showMessageDialog(null,"Você escolheu 8");
                break;
            case 9: JOptionPane.showMessageDialog(null,"Você escolheu 9");
                break;
            case 10: JOptionPane.showMessageDialog(null,"Você escolheu 10");
                break;

            default: JOptionPane.showMessageDialog(null,"Você escolheu errado");
        }

    }
}