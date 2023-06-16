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
import models.Classes.Endereco;
import repository.Dao;

/**
 * Classe EnderecoDao
 * 
 * <code>
 * CREATE TABLE Endereco (
    id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    pais VARCHAR(100) NOT NULL,
    estado VARCHAR(100) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    logradouro VARCHAR(100) NOT NULL,
    numero INTEGER,
    complemento VARCHAR(100)
);
 * </code>
 * 
 * @author Warley Ramires
 */
public class EnderecoDao extends Dao<Endereco>{
    
    public static final String TABLE = "Endereco";

    @Override
    public String getSaveStatment() {
       return "insert into " + TABLE + "(pais, estado, cidade, bairro, logradouro, numero, complemento)  values (?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        
        return "update " + TABLE + "set pais = ?, estado = ?, cidade = ?, bairro = ?, logradouro = ?, numero = ?, complemento = ? where id = ?";
       
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Endereco e) {
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

                pstmt.setString(1, e.getPais());
                pstmt.setString(2, e.getEstado());
                pstmt.setString(3, e.getCidade());
                pstmt.setString(4, e.getBairro());
                pstmt.setString(5, e.getLogradouro());
                pstmt.setInt(6, e.getNumero());
                pstmt.setString(7, e.getComplemento());
                
                 if (e.getId() != null) {
                    pstmt.setLong(8, e.getId());
        }

        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
         return "select id, pais, estado, cidade, bairro, logradouro, numero, complemento"
                + " from Endereco where id = ?";
    }

    @Override
    public String getFindAllStatment() {
    
        return "select id, pais, estado, cidade, bairro, logradouro, numero, complemento"
                + " from Endereco";
                //+ " where exlcuido = false";
    }

    @Override
    public Endereco extractObject(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
