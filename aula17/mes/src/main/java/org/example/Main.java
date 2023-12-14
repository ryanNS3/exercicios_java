package org.example;
import  javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String mes = JOptionPane.showInputDialog("Digite um valor entre 1-12");

        switch (Integer.parseInt(mes)){
            case 1: JOptionPane.showMessageDialog(null,"Mês de janeiro");
            break;
            case 2: JOptionPane.showMessageDialog(null,"Mês de feveiro");
            break;
            case 3: JOptionPane.showMessageDialog(null,"Mês de março");
            break;
            case 4: JOptionPane.showMessageDialog(null,"Mês de Abril");
            break;
            case 5: JOptionPane.showMessageDialog(null,"Mês de maio");
            break;
            case 6: JOptionPane.showMessageDialog(null,"Mês de junho");
            break;
            case 7: JOptionPane.showMessageDialog(null,"Mês de julho");
            break;
            case 8: JOptionPane.showMessageDialog(null,"Mês de agosto");
            break;
            case 9: JOptionPane.showMessageDialog(null,"Mês de setembro");
            break;
            case 10: JOptionPane.showMessageDialog(null,"Mês de outubro");
            break;
            case 11: JOptionPane.showMessageDialog(null,"Mês de novembro");
            break;
            case 12: JOptionPane.showMessageDialog(null,"Mês de dezembro");
            break;

            default: JOptionPane.showMessageDialog(null,"mes incorreto");
        }
    }
}