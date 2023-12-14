package org.example;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
       String opcao = JOptionPane.showInputDialog("Escolha seu estado civil \n1-Solteiro \n2-Desquitado\n 3-casado \n 4-Divorciado \n 5-viúvo");
        switch (opcao){
            case "1" : JOptionPane.showMessageDialog(null,"Você é solteiro");
            break;
            case "2" : JOptionPane.showMessageDialog(null,"Você é Desquitado");
            break;
            case "3" : JOptionPane.showMessageDialog(null,"Você é casado");
            break;
            case "4" : JOptionPane.showMessageDialog(null,"Você é divorciado");
            break;
            case "5" : JOptionPane.showMessageDialog(null,"Você é viuvo");
            break;

            default: JOptionPane.showMessageDialog(null,"Você é nada");
        }

    }
}