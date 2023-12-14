package org.example;

import java.util.Scanner;
import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {

        while (true){
            String user;
            String senha;

            user  = showInputDialog("digite o seu usuário");
            senha = showInputDialog("digite sua senha");

            if ("aluno".equals(user) & "senhaC".equals(senha)){
                JOptionPane.showMessageDialog(null,"Usuario logado com sucesso", "information message",JOptionPane.INFORMATION_MESSAGE);
                break;

            } else{
                JOptionPane.showMessageDialog(null,"Usuário incorreto!", "error",JOptionPane.ERROR_MESSAGE);

            }

        }
    }

}