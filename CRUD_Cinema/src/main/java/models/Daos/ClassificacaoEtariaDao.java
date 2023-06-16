import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Classes.ClassificacaoEtaria;
import repository.Dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
/**
 * 
 * <code>
 * CREATE TABLE Classificacao_etaria (
  descricao VARCHAR(3) PRIMARY KEY
);
 * </code>
 * @author lorena
 */
public class ClassificacaoEtariaDao extends Dao<ClassificacaoEtaria>{
    
    public static final String TABLE = "Classificacao_etaria";

    @Override
    public String getSaveStatment() {
       return "insert into " + TABLE + "(descricao)  values (?)";
    }

    @Override
    public String getUpdateStatment() {
        
        return "update " + TABLE + "set descricao = ? where descricao = ?";
       
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, ClassificacaoEtaria e) {
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

                pstmt.setString(1, e.getDescricao());
                

        } catch (SQLException ex) {
            Logger.getLogger(ClassificacaoEtariaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
         return "select descricao"
                + " from ClassificacaoEtaria where descricao = ?";
    }

    @Override
    public String getFindAllStatment() {
    
        return "select descricao"
                + " from ClassificacaoEtaria";
                //+ " where exlcuido = false";
    }

    @Override
    public ClassificacaoEtaria extractObject(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}