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
import models.Classes.Genero;
import repository.Dao;

/**
 *
 * <code>
 * CREATE TABLE Genero (
    id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    principalGenero VARCHAR(100) UNIQUE NOT NULL
);
 * </code>
 * @author lorena
 */
public class GeneroDao extends Dao<Genero>{
    
    public static final String TABLE = "Genero";

    @Override
    public String getSaveStatment() {
       return "insert into " + TABLE + "(principalGenero)  values (?)";
    }

    @Override
    public String getUpdateStatment() {
        
        return "update " + TABLE + "set principalGenero = ? where id = ?";
       
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Genero e) {
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

                pstmt.setString(1, e.getPrincipalGenero());
                
                 if (e.getId() != null) {
                    pstmt.setLong(2, e.getId());
        }

        } catch (SQLException ex) {
            Logger.getLogger(GeneroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
         return "select id, principalGenero"
                + " from Genero where id = ?";
    }

    @Override
    public String getFindAllStatment() {
    
        return "select id, principalGenero"
                + " from Genero";
                //+ " where exlcuido = false";
    }

    @Override
    public Genero extractObject(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}