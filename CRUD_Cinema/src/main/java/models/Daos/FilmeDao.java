/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Classes.ClassificacaoEtaria;
import models.Classes.Filme;
import models.Classes.Genero;
import models.Classes.ProfissionalCinematografico;
import repository.Dao;
import repository.IDao;

/**
 * Classe FilmeDao
 *
 * <code>
 * CREATE TABLE Filme (
    id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    classificacao_indicativa VARCHAR(20),
    titulo_portugues VARCHAR(100),
    titulo_original VARCHAR(100),
    legendado BOOLEAN,
    dublado BOOLEAN,
    duracao INT,
    genero_id BIGINT UNSIGNED,
    artista_id BIGINT UNSIGNED,
    FOREIGN KEY (genero_id) REFERENCES Genero(id),
    FOREIGN KEY (artista_id) REFERENCES ProfissionalCinematografico(id)
);
 * </code>
 * @author lorena
 */
public class FilmeDao extends Dao<Filme> {

    public static final String TABLE = "Filme";

    
    @Override
    public String getSaveStatment() {
       return "INSERT INTO " + TABLE + " (classificacao_indicativa, titulo_portugues, titulo_original, legendado, dublado, duracao, genero_id, artista_id) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    }
    
    @Override
    public String getUpdateStatment() {
        return "UPDATE " + TABLE + " SET classificacao_indicativa = ?, titulo_portugues = ?, titulo_original = ?, legendado = ?, dublado = ?, duracao = ?, genero_id = ?, artista_id = ? " +
                "WHERE id = ?"; 
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Filme filme) {
        try {
            pstmt.setString(1, filme.getClassificacaoIndicativa().getDescricao());
            pstmt.setString(2, filme.getTituloPortugues());
            pstmt.setString(3, filme.getTituloOriginal());
            pstmt.setBoolean(4, filme.isLegendado());
            pstmt.setBoolean(5, filme.isDublado());
            pstmt.setInt(6, filme.getDuracao());
            // Set genero_id
            if (filme.getGeneros() != null && !filme.getGeneros().isEmpty()) {
            for (int i = 0; i < filme.getGeneros().size(); i++) {
                pstmt.setLong(i + 7, filme.getGeneros().get(i).getId());
            }
        }

            if (filme.getArtistas() != null && !filme.getArtistas().isEmpty()) {
            for (int i = 0; i < filme.getArtistas().size(); i++) {
                pstmt.setLong(i + 8, filme.getArtistas().get(i).getId());
            }
        }

            // Set the film ID for update statement
            if (filme.getId() != null) {
                pstmt.setLong(9, filme.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(FilmeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String getFindByIdStatment() {
         return "SELECT id, classificacao_indicativa, titulo_portugues, titulo_original, legendado, dublado, duracao, genero_id, artista_id " +
                "FROM " + TABLE + " WHERE id = ?";
    }

    @Override
    public String getFindAllStatment() {
        return "SELECT id, classificacao_indicativa, titulo_portugues, titulo_original, legendado, dublado, duracao, genero_id, artista_id FROM " + TABLE;
    }

    @Override
    public Filme extractObject(ResultSet resultSet) {
        try {
        Long id = resultSet.getLong("id");
        String classificacaoIndicativa = resultSet.getString("classificacao_indicativa");
        String tituloPortugues = resultSet.getString("titulo_portugues");
        String tituloOriginal = resultSet.getString("titulo_original");
        boolean legendado = resultSet.getBoolean("legendado");
        boolean dublado = resultSet.getBoolean("dublado");
        int duracao = resultSet.getInt("duracao");

        // Get genero_ids
        String generoIdsString = resultSet.getString("genero_ids");
        List<Long> generoIds = new ArrayList<>();
        if (generoIdsString != null && !generoIdsString.isEmpty()) {
            String[] generoIdsArray = generoIdsString.split(",");
            for (String generoId : generoIdsArray) {
                generoIds.add(Long.parseLong(generoId));
            }
        }

        // Get artistas_ids
        String artistasIdsString = resultSet.getString("artistas_ids");
        List<Long> artistasIds = new ArrayList<>();
        if (artistasIdsString != null && !artistasIdsString.isEmpty()) {
            String[] artistasIdsArray = artistasIdsString.split(",");
            for (String artistaId : artistasIdsArray) {
                artistasIds.add(Long.parseLong(artistaId));
            }
        }

        Filme filme = new Filme();
        filme.setId(id);
        filme.setClassificacaoIndicativa(ClassificacaoEtaria.valueOf(classificacaoIndicativa));
        filme.setTituloPortugues(tituloPortugues);
        filme.setTituloOriginal(tituloOriginal);
        filme.setLegendado(legendado);
        filme.setDublado(dublado);
        filme.setDuracao(duracao);

        // Set generos
        List<Genero> generos = new ArrayList<>();
        for (Long generoId : generoIds) {
            GeneroDao generoDao = new GeneroDao();
            Genero genero = generoDao.findById(generoId);
            if (genero != null) {
                generos.add(genero);
            }
        }
        filme.setGeneros((ArrayList<Genero>) generos);

        // Set artistas
        List<ProfissionalCinematografico> artistas = new ArrayList<>();
        for (Long artistaId : artistasIds) {
            ProfissionalCinematografico artista = null;
            // Verificar se é um Diretor ou Ator
            DiretorDao diretorDao = new DiretorDao();
            artista = diretorDao.findById(artistaId);
            if (artista == null) {
                AtorDao atorDao = new AtorDao();
                artista = atorDao.findById(artistaId);
            }
            if (artista != null) {
                artistas.add(artista);
            }
        }
        filme.setArtistas((ArrayList<ProfissionalCinematografico>) artistas);

        return filme;
    } catch (SQLException ex) {
        Logger.getLogger(FilmeDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }
}