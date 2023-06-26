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
import models.Classes.Diretor;
import models.Classes.Pais;
import models.Classes.ProfissionalCinematografico;
import repository.Dao;

/**
 *<code>
 * CREATE TABLE ProfissionalCinematografico (
    id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    tipo ENUM ('Diretor', 'Ator') NOT NULL,
    FOREIGN KEY (id) REFERENCES Diretor(id) ON DELETE CASCADE,
    FOREIGN KEY (id) REFERENCES Ator(id) ON DELETE CASCADE
);
* </code>
 * @author loren
 */
public class ProfissionalCinematograficoDao extends Dao<ProfissionalCinematografico> {
    public static final String TABLE = "ProfissionalCinematografico";
    
    @Override
    public String getSaveStatment() {
       return "insert into " + TABLE + "(nome, apelido, nacionalidade, genero)  values (?, ?, ?, ?)";
    }
    
    @Override
    public String getUpdateStatment() {
        
        return "update " + TABLE + "set nome = ?, apelido = ?, nacionalidade = ?, genero = ? where id = ?";  
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, ProfissionalCinematografico artista) {
        try {
            pstmt.setString(1, artista.getNome());
            pstmt.setString(2, artista.getApelido());
            pstmt.setLong(3, artista.getNacionalidade().getId());
            pstmt.setString(4, artista.getGenero());

            // Verifica se o artista já possui um ID (para operações de atualização)
            if (artista.getId() != null) {
                pstmt.setLong(5, artista.getId());
            }
        } catch (SQLException ex) {
            // Trate a exceção adequadamente
            Logger.getLogger(ProfissionalCinematograficoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
         return "select * from " + TABLE + " where id = ?";
    }
    
    @Override
    public String getFindAllStatment() {
    
        return "select * from " + TABLE;
    }

    @Override
    public ProfissionalCinematografico extractObject(ResultSet resultSet) {
        ProfissionalCinematografico artista = null;
        try {
            Long id = resultSet.getLong("id");
            String nome = resultSet.getString("nome");
            String apelido = resultSet.getString("apelido");
            Long nacionalidadeId = resultSet.getLong("nacionalidade");
            String genero = resultSet.getString("genero");

            // Verifique se o artista é um diretor ou ator com base em outras colunas da tabela
            boolean principal = resultSet.getBoolean("principal");
            boolean fotografia = resultSet.getBoolean("fotografia");
            boolean arte = resultSet.getBoolean("arte");
            boolean protagonista = resultSet.getBoolean("protagonista");
            
            PaisDao paisDao = new PaisDao();

            // Recupere o país usando o método findById do PaisDao
            Pais pais = paisDao.findById(nacionalidadeId);

            if (principal && fotografia && arte) {
                // É um diretor
                Diretor diretor = new Diretor();
                diretor.setId(id);
                diretor.setNome(nome);
                diretor.setApelido(apelido);
                diretor.setNacionalidade(pais);
                diretor.setGenero(genero);
                diretor.setPrincipal(principal);
                diretor.setFotografia(fotografia);
                diretor.setArte(arte);

                artista = diretor;
            } else {
                // É um ator
                Ator ator = new Ator();
                ator.setId(id);
                ator.setNome(nome);
                ator.setApelido(apelido);
                ator.setNacionalidade(pais);
                ator.setGenero(genero);
                ator.setProtagonista(protagonista);

                artista = ator;
            }
        } catch (SQLException ex) {
            // Trate a exceção adequadamente
            ex.printStackTrace();
        }

        return artista;
    }
}
