/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Daos;

import models.Classes.Cinema;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Classes.Endereco;
//import models.Sala;
import repository.Dao;
import repository.IDao;

/**
 * Classe CinemaDao
 *
 * <code>
 * CREATE TABLE Cinema (
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nomeFantasia VARCHAR(100) NOT NULL,
    cnpj BIGINT UNSIGNED NOT NULL,
    endereco_id BIGINT UNSIGNED,
    telefone BIGINT UNSIGNED NOT NULL,
    sigla VARCHAR(10) NOT NULL,
    FOREIGN KEY (endereco_id) REFERENCES Endereco(id)
);
 * </code>
 * @author Warley Ramires
 */
public class CinemaDao extends Dao<Cinema> {
    
    public static final String TABLE = "cinema";
    

    @Override
    public String getSaveStatment() {
        
        return "insert into " + TABLE + "(nomeFantasia, cnpj, endereco_id, telefone, sigla) values (?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        
        return "update " + TABLE + "set nomeFantasia = ?, cnpj = ?, endereco = ?, telefone = ?, sigla = ?, salas = ? where id = ?";
       
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Cinema e) {
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

                pstmt.setString(1, e.getNomeFantasia());
                pstmt.setLong(2, e.getCnpj());
                pstmt.setLong(3, e.getEndereco().getId());
                pstmt.setLong(4, e.getTelefone());
                pstmt.setString(5, e.getSigla());
                
                 if (e.getId() != null) {
                    pstmt.setLong(7, e.getId());
        }

        } catch (SQLException ex) {
            Logger.getLogger(CinemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
         return "select id, nomeFantasia, cnpj, endereco, telefone, sigla, salas"
                + " from cinema where id = ?";
    }

    @Override
    public String getFindAllStatment() {
    
        return "select id, nomeFantasia, cnpj, endereco, telefone, sigla, salas"
                + " from cinema";
                //+ " where exlcuido = false";
    }

    // Funcao responsavel por buscar um cinema no banco de dados e construir esse objeto na memoria
    @Override
    public Cinema extractObject(ResultSet rs){
        Cinema cin = new Cinema();
        try {
            while(rs.next()){
                cin.setNomeFantasia(rs.getString("nomeFantasia"));
                cin.setCnpj(rs.getLong("cnpj"));
                long enderecoId = rs.getLong("endereco_id");
                // Utiliza o DAO de Endereco para obter o objeto Endereco correspondente ao ID
                EnderecoDao enderecoDao = new EnderecoDao();
               // Endereco endereco = enderecoDao.obterEnderecoPorId(enderecoId);
            
                // Define o objeto Endereco no Cinema
              //  cin.setEndereco(endereco);
                
                cin.setTelefone(rs.getLong("telefone"));
                cin.setSigla(rs.getString("sigla"));
               // cin.setSala((ArrayList<Sala>) rs.getArray("salas"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CinemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cin;
    }


    
}
