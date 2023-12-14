package org.example;

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        String grausCstr = JOptionPane.showInputDialog("Digite os graus celsius");
        float grausC = Float.parseFloat(grausCstr);

    while (true){
        String opcao = JOptionPane.showInputDialog("Digite base para a conversão: \n 1- fahrenheit \n 2- kelvin");
        if (opcao.equals("1")){
            float calculo = grausC * 1.8f + 32;
            JOptionPane.showMessageDialog(null, grausC + " convertido para fahrenheit = "+ calculo,"Resultado",JOptionPane.INFORMATION_MESSAGE );
            System.out.printf("%.2f C convertido em fahrenheit = %.2f", grausC,calculo);
        }

        else if (opcao.equals("2")){
            float calculo = grausC + 273.15f;
            JOptionPane.showMessageDialog(null, grausC + " convertido para kelvin = "+ calculo,"Resultado",JOptionPane.INFORMATION_MESSAGE );
        }

        else{
            JOptionPane.showMessageDialog(null, String.format("%s Opção inválida", opcao),"Erro",JOptionPane.ERROR_MESSAGE);

        }

        String sair = JOptionPane.showInputDialog("Deseja sair?(s)-sim (n)-não");

        if( sair.equals("s") ){
            break;

        }

    }

    }
}