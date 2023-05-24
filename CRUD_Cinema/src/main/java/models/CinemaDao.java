/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.Dao;
import repository.IDao;

/**
 *
 * @author Warley Ramires
 */
public abstract class CinemaDao extends Dao<Cinema> {
    
    public static final String TABLE = "cinema";
    

    @Override
    public String getSaveStatment() {
        
        return "insert into " + TABLE + "(nomeFantasia, cnpj, endereco, telefone, sigla, salas) values (?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        
        return "update " + TABLE + "set nomeFantasia = ?, cnpj = ?, endereco = ?, telefone = ?, sigla = ?, salas = ? where id = ?";
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Cinema e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getFindByIdStatment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getFindAllStatment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Funcao responsavel por buscar um cinema no banco de dados e construir esse objeto na memoria
    @Override
    public Cinema extractObject(ResultSet rs){
        Cinema cin = new Cinema();
        try {
            while(rs.next()){
                cin.setNomeFantasia(rs.getString("nomeFantasia"));
                cin.setCnpj(rs.getLong("cnpj"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CinemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cin;
    }


    
}
