package org.example;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String produto = JOptionPane.showInputDialog("Digite o produto com o respectivo numero de origem").toUpperCase().replace(".","");

        while (produto.matches("[A-Z*]") || produto.matches("[!@#$%¨&*()/?°^~{}<>]")){
            produto = JOptionPane.showInputDialog("Digite o produto com o respectivo numero de origem");
        }

        switch (Integer.parseInt(produto)){
            case 1 : JOptionPane.showMessageDialog(null,"sul");
            break;
            case 2 : JOptionPane.showMessageDialog(null,"norte");
            break;
            case 3 : JOptionPane.showMessageDialog(null,"leste");
            break;
            case 4 : JOptionPane.showMessageDialog(null,"Oeste");
            break;
            case 5,6: JOptionPane.showMessageDialog(null,"Nordeste");
            break;
            case 7,8,9 : JOptionPane.showMessageDialog(null,"Sudeste");
            case 10,11,12,13,14,15,16,17,18,20 : JOptionPane.showMessageDialog(null,"Centro-oeste");
            break;
            case 21,22,23,24,25,26,27,28,19,30 : JOptionPane.showMessageDialog(null, "Nordeste");
            break;



            default: JOptionPane.showMessageDialog(null,"Nenhuma região encontrada");




        }
    }
}