package org.example;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        while (true){
            String num = JOptionPane.showInputDialog("Digite um número decimal para a conversão").toUpperCase();
            // validação
            while (num.matches("[A-Z*]") || num.matches("[!#@$%¨&*><:{}^~|°].*")){
                num = JOptionPane.showInputDialog("Valor incorreto, digite novamente decimal para a conversão").toUpperCase();
            }
            // mostrando o resultado na tela
            JOptionPane.showMessageDialog(null,String.format("Valor em decimal: %s\n Em binário: " + Integer.toBinaryString(Integer.parseInt(num)), num));

            String sair = JOptionPane.showInputDialog("Deseja sair?-1 sim -2 nao");
            // opção de sair
            if (sair.equals("-1")){
                break;
            }
        }

    }
}