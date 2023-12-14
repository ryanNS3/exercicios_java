package org.example;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        String opcao = JOptionPane.showInputDialog("Digite qual prato você deseja ");
        switch (opcao){
            case "1" : JOptionPane.showMessageDialog(null,"Fejoada R$ 25,00");
                break;
            case "2" : JOptionPane.showMessageDialog(null,"Macarronada R$ 15,00");
                break;
            case "3" : JOptionPane.showMessageDialog(null,"Galinha caipira R$ 30,00");
                break;
            case "4" : JOptionPane.showMessageDialog(null,"Carne de sol R$30,00");
                break;

            default: JOptionPane.showMessageDialog(null,"Você não quer nada");
    }
}