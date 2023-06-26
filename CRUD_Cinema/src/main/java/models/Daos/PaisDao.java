/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Classes.Pais;
import repository.Dao;

/**
 * 
 * <code>
 * CREATE TABLE Pais (
    id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) UNIQUE NOT NULL
);
 * </code>
 * @author lorena
 */
public class PaisDao extends Dao<Pais>{
    
    public static final String TABLE = "Pais";

    @Override
    public String getSaveStatment() {
       return "insert into " + TABLE + "(nome)  values (?)";
    }

    @Override
    public String getUpdateStatment() {
        
        return "update " + TABLE + "set nome = ? where id = ?";
       
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Pais e) {
        try {
//            pstmt.setString(1, e.getNomeFantasia());
//            // OR
//            // pstmt.setObject(1, e.getDescription(), java.sql.Types.VARCHAR);
//
//            // Null values
//            // NOT! pstmt.setByte(2, e.getProgress());
//            pstmt.setObject(2, e.getProgress(), java.sql.Types.TINYINT);
//
//            // LocalDate
//            pstmt.setObject(3, e.getConclusion(), java.sql.Types.DATE);
//
//            // Just for the update
//            if (e.getId() != null) {
//                pstmt.setLong(4, e.getId());
//            }

                pstmt.setString(1, e.getNome());
                
                 if (e.getId() != null) {
                    pstmt.setLong(2, e.getId());
        }

        } catch (SQLException ex) {
            Logger.getLogger(PaisDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
         return "select id, nome"
                + " from Pais where id = ?";
    }

    @Override
    public String getFindAllStatment() {
    
        return "select id, nome"
                + " from Pais";
                //+ " where exlcuido = false";
    }

    @Override
    public Pais extractObject(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

