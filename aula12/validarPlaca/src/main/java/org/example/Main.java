package org.example;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String placa = JOptionPane.showInputDialog("Digite sua placa").toUpperCase().replace("-","");
        boolean especial = placa.substring(4,7).matches("[!#@$%¨&*].*");
        
        // validação da placa
        while(placa.length() != 7 || !placa.substring(0,3).matches("[A-Z]*") || placa.substring(4,7).matches("[A-Z]*") || especial ){
            JOptionPane.showMessageDialog(null,"Placa inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            placa = JOptionPane.showInputDialog("Digite sua placa").toUpperCase().replace("-","");
        }

        JOptionPane.showMessageDialog(null,String.format("Placa = %s \n É válido!", placa), "Valido com sucesso", JOptionPane.INFORMATION_MESSAGE);

    }
}