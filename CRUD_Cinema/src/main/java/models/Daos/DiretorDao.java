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
import models.Classes.Diretor;
import repository.Dao;

/**
 *
 * <code>
 * CREATE TABLE Diretor (
    id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    apelido VARCHAR(100),
    nacionalidade BIGINT UNSIGNED NOT NULL,
    genero VARCHAR(100) NOT NULL,
    principal BOOLEAN NOT NULL,
    fotografia BOOLEAN NOT NULL,
    arte BOOLEAN NOT NULL,
    FOREIGN KEY (nacionalidade) REFERENCES Pais(id)
);
 * </code>
 * @author loren
 */
public class DiretorDao extends Dao<Diretor>{
    
    public static final String TABLE = "Diretor";

    @Override
    public String getSaveStatment() {
       return "insert into " + TABLE + "(nome, apelido, nacionalidade, genero, principal, fotografia, arte)  values (?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        
        return "update " + TABLE + "set nome = ?, apelido = ?, nacionalidade = ?, genero = ?, principal = ?, fotografia = ?, arte = ? where id = ?";
       
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Diretor e) {
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
                pstmt.setString(2, e.getApelido());
                pstmt.setLong(3, e.getNacionalidade().getId());
                pstmt.setString(4, e.getGenero());
                pstmt.setBoolean(5, e.isPrincipal());
                pstmt.setBoolean(6, e.isFotografia());
                pstmt.setBoolean(7, e.isArte());
                
                
                 if (e.getId() != null) {
                    pstmt.setLong(8, e.getId());
        }

        } catch (SQLException ex) {
            Logger.getLogger(DiretorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
         return "select id, nome, apelido, nacionalidade, genero, principal, fotografia, arte"
                + " from Diretor where id = ?";
    }

    @Override
    public String getFindAllStatment() {
    
        return "select id, nome, apelido, nacionalidade, genero, principal, fotografia, arte"
                + " from Diretor";
                //+ " where exlcuido = false";
    }

    @Override
    public Diretor extractObject(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}