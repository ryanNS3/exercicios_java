/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CT Desenvolvimento
 */
public class ModuloConexao {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // a linha a baixo ira chamar o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // armazenamento informação referente ao banco
        String url = "jdbc:mysql://localhost:3306/agenda_contatos";
        String user = "root";
        String password = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        }  
        
        catch (Exception e){
            
            return null;
        }
        
        
        
    }
}
