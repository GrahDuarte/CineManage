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
import models.Classes.Ator;
import repository.Dao;

/**
 *
 * <code>
 * CREATE TABLE Ator (
    id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    protagonista BOOLEAN NOT NULL,
    nome VARCHAR(100) NOT NULL,
    apelido VARCHAR(100),
    nacionalidade BIGINT UNSIGNED NOT NULL,
    genero VARCHAR(100) NOT NULL,
    FOREIGN KEY (nacionalidade) REFERENCES Pais(id)
);
 * </code>
 * @author lorena
 */
public class AtorDao extends Dao<Ator>{
    
    public static final String TABLE = "Ator";

    @Override
    public String getSaveStatment() {
       return "insert into " + TABLE + "(protagonista, nome, apelido, nacionalidade, genero)  values (?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        
        return "update " + TABLE + "set protagonista = ?, nome = ?, apelido = ?, nacionalidade = ?, genero = ? where id = ?";
       
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Ator e) {
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
                pstmt.setBoolean(1, e.isProtagonista());
                pstmt.setString(2, e.getNome());
                pstmt.setString(3, e.getApelido());
                pstmt.setLong(4, e.getNacionalidade().getId());
                pstmt.setString(5, e.getGenero());
                
                 if (e.getId() != null) {
                    pstmt.setLong(6, e.getId());
        }

        } catch (SQLException ex) {
            Logger.getLogger(AtorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
         return "select id, protagonista, nome, apelido, nacionalidade, genero"
                + " from Ator where id = ?";
    }

    @Override
    public String getFindAllStatment() {
    
        return "select id, protagonista, nome, apelido, nacionalidade, genero"
                + " from Ator";
                //+ " where exlcuido = false";
    }

    @Override
    public Ator extractObject(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}