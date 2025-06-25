/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;
import java.sql.*;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author dev
 */
public class ModuloConexao {
    
    public static Connection conector(){
        
         java.sql.Connection conexao = null;
    
          // a linha abaixo "chama" o driver
    
          String driver = "com.mysql.cj.jdbc.Driver";
    
           //informações referentes ao banco
    
            String url = "jdbc:mysql://localhost:3306/dbinfox";
            String user = "root";
            String password = "";
    
           // estabelecendo a conexão
           
           try{
               
               Class.forName(driver);
               conexao = DriverManager.getConnection(url,user,password);
               return conexao;
               
             }catch(Exception e){
                //caso a cone~xao não funcione isso vai aparecer na tela  
               // System.out.println(e);
                return null;
                
           
           }
    
    
    
    
    
    }
 }
