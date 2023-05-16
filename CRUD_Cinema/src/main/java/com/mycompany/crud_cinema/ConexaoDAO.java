/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud_cinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Warley Ramires
 */
public class ConexaoDAO {
    
    public Connection conectaBD(){
        Connection conexao = null;
        
        try {
            //String recebe nosso drive de conexão
            String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=";
            conexao = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        
        return conexao;
    }
}
