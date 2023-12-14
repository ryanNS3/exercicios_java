package com.mycompany.loginsenhaa;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class LoginSenhaa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        while (true){
            System.out.println("Digite seu usuário:");
            String user = entrada.next();
            System.out.println("Digite a senha:");
            String senha = entrada.next();
            
            if ("aluno".equals(user) & "senhaC".equals(senha)){
                System.out.println("Usuário logado com sucessor");
                break;
                
            } else{
                System.out.println("Usuário ou senha incorreta");
                System.out.println("Digite novamente");
                
            }
             
        }
        
    }
}
