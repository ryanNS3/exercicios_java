package org.example;
import  javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        while (true){
            String idade =  JOptionPane.showInputDialog("Digite sua idade").toUpperCase();
            String peso = JOptionPane.showInputDialog("Digite seu peso ").replace(",", ".").toUpperCase();
            String altura = JOptionPane.showInputDialog("Digite sua altura").replace(",", ".").toUpperCase();

            while (peso.matches("[A-Z]*") || idade.matches("[A-Z]*")|| altura.matches("[A-Z]*")){
                JOptionPane.showMessageDialog(null,"Valor incorreto, digite novamente","err0",JOptionPane.ERROR_MESSAGE);
                idade =  JOptionPane.showInputDialog("Digite sua idade").toUpperCase();
                peso = JOptionPane.showInputDialog("Digite seu peso ").replace(",", ".").toUpperCase();
                altura = JOptionPane.showInputDialog("Digite sua altura").replace(",", ".").toUpperCase();
            }
            int idadeint = Integer.parseInt(idade);
            float pesofloat = Float.parseFloat(peso), alturafloat = Float.parseFloat(altura);


           while(idadeint < 20 || idadeint > 123 || pesofloat < 0){
               peso = JOptionPane.showInputDialog("Digite seu peso ").replace(",", ".");
               pesofloat = Float.parseFloat(peso);


           }

           float imc = pesofloat / (alturafloat * alturafloat);
            System.out.println(imc);
           if (idadeint <= 60){
               if (imc > 40){
                   JOptionPane.showMessageDialog(null,"Obsidade classe III", "message",JOptionPane.INFORMATION_MESSAGE);
                   }
               else if (imc > 35){
                   JOptionPane.showMessageDialog(null,"Obsidade classe II", "message",JOptionPane.INFORMATION_MESSAGE);
               }

               else if(imc > 30){
                   JOptionPane.showMessageDialog(null,"Obsidade classe I", "message",JOptionPane.INFORMATION_MESSAGE);
               }

               else if(imc > 25){
                   JOptionPane.showMessageDialog(null,"Sobrepeso", "message",JOptionPane.INFORMATION_MESSAGE);

               }

               else if(imc > 18.5){
                   JOptionPane.showMessageDialog(null,"Intervalo normal", "message",JOptionPane.INFORMATION_MESSAGE);
               }
               else{
                   JOptionPane.showMessageDialog(null,"baixo do peso", "message",JOptionPane.INFORMATION_MESSAGE);


               }

           }

           else if(idadeint >= 61){
               if(imc > 30){
                   JOptionPane.showMessageDialog(null,"Obesidade", "message",JOptionPane.INFORMATION_MESSAGE);
               }
               else if(imc > 27){
                   JOptionPane.showMessageDialog(null,"Sobrepeso", "message",JOptionPane.INFORMATION_MESSAGE);
               }
               else if(imc > 22){
                   JOptionPane.showMessageDialog(null,"normal", "message",JOptionPane.INFORMATION_MESSAGE);
               }

               else if(imc < 21.9){
                   JOptionPane.showMessageDialog(null,"Baixo peso", "message",JOptionPane.INFORMATION_MESSAGE);
               }
           }

            String sair =  JOptionPane.showInputDialog("Deseja sair:(sim,não)").toUpperCase();

           if (sair.equals("SIM")){
               JOptionPane.showMessageDialog(null,"Você saiu", "message",JOptionPane.INFORMATION_MESSAGE);
               break;
           }




        }




    }
}