package org.example;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String numeros1 = JOptionPane.showInputDialog("Digite o primeiro número").toUpperCase();
        String numeros2 = JOptionPane.showInputDialog("Digite o segundo número").toUpperCase();

        while(numeros1.matches("[A-Z*]") || numeros1.matches("[!@#$%¨&*()_+=:~}|]") || numeros2.matches("[A-Z*]") || numeros2.matches("[!@#$%¨&*()_+=:~}|]")){
            numeros1 = JOptionPane.showInputDialog("Digite o primeiro número").toUpperCase();
            numeros2 = JOptionPane.showInputDialog("Digite o segundo número").toUpperCase();
        }
        String escolha = JOptionPane.showInputDialog("Digite a escolha").toUpperCase();
        Integer num1 = Integer.parseInt(numeros1);
        Integer num2 = Integer.parseInt(numeros2);
        switch (Integer.parseInt(escolha)){
            case 1 :
                JOptionPane.showMessageDialog(null,String.format("A media entre o numero %d  e %d = %d", num1, num2,(num1 + num2) / 2));
                break;
            case 2 :
                if (num1 > num2) {JOptionPane.showMessageDialog(null,String.format("A difença de %d e %d = %d", num1,num2, num1 - num2 ));}
                else if (num2 > num1) {JOptionPane.showMessageDialog(null,String.format("A difença de %d e %d = %d", num2,num1, num2 - num1 ));}
                break;
            case 3:
                JOptionPane.showMessageDialog(null,String.format("%d / %d = %d", num1,num2,num1 / num2));
                JOptionPane.showMessageDialog(null,String.format("%d / %d = %d", num2,num1,num2 / num1));
                break;
            case 4:
                JOptionPane.showMessageDialog(null,String.format("%d / %d = %d", num1,num2,num1 /num2));
                break;
            default:
                JOptionPane.showMessageDialog(null,"Mensagem incorreta");
        }

    }
}