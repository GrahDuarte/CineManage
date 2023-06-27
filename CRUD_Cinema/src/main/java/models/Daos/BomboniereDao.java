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
import models.Classes.Bomboniere;
import models.Classes.Produto;
import repository.Dao;

/**
 * 
 * <code>
 *  CREATE TABLE Bomboniere(
 *  id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 *  produto_id BIGINT UNSIGNED,
 *  venda BIGINT,
 *  FOREING KEY (produto_id) REFERENCES Produto(id),
 *  FOREING KEY (venda_id) REFERENCES Venda(id)
 * );
 * 
 * </code>
 *
 * @author Warley Ramires
 */
public class BomboniereDao extends Dao<Bomboniere>{
    
     public static final String TABLE = "Bomboniere";

    @Override
    public String getSaveStatment() {
         return "insert into " + TABLE + "(produto_id, venda)  values (?, ?)";
    
    }

    @Override
    public String getUpdateStatment() {
         return "UPDATE " + TABLE + " SET produto_id = ?, venda = ? " +
                "WHERE id = ?"; 
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Bomboniere bomboniere) {
        try{
            if(bomboniere.getProduto() != null && !bomboniere.getProduto().isEmpty()){
                for(int i = 0; i < bomboniere.getProduto().size(); i++){
                    pstmt.setLong(i + 1, bomboniere.getProduto().get(i).getId());
                }
            }
            if(bomboniere.getVenda() != null && !bomboniere.getVenda().isEmpty()){
                for (int i = 0; i < bomboniere.getVenda().size(); i++) {
                pstmt.setLong(i + 2, bomboniere.getVenda().get(i).getId());
            }
            }
           
        }catch(SQLException ex){
            Logger.getLogger(Bomboniere.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
          return "SELECT id, produto_id, venda " +
                "FROM " + TABLE + " WHERE id = ?";
    }

    @Override
    public String getFindAllStatment() {
       return "SELECT id, produto_id, venda " + TABLE;
     }

    @Override
    public Bomboniere extractObject(ResultSet resultSet) {
        try{
            Long id = resultSet.getLong("id");
            String produtoIdsString = resultSet.getString("produto_ids");
            List<Long> produtoIds = new ArrayList<>();
            if(produtoIdsString != null && !produtoIdsString.isEmpty()){
                String[] produtoIdsArray = produtoIdsString.split(",");
                for(String produtoId : produtoIdsArray){
                    produtoIds.add(Long.parseLong(produtoId));
                }
                
            }
            
         
            String vendaIdsString = resultSet.getString("produto_ids");
            List<Long> vendaIds = new ArrayList<>();
            if(vendaIdsString != null && !vendaIdsString.isEmpty()){
                String[] vendaIdsArray = vendaIdsString.split(",");
                for(String vendaId : vendaIdsArray){
                    vendaIds.add(Long.parseLong(vendaId));
                }
                
            }
            
            Bomboniere bomboniere = new Bomboniere();
             List<Produto> produtos = new ArrayList<>();
        for (Long generoId : produtoIds) {
            ProdutoDao generoDao = new GeneroDao();
            Produto produto = produtoDao.findById(produtoId);
            if (produto != null) {
                produtos.add(produto);
            }
        }
        bomboniere.setProduto((ArrayList<Produto>) produtos);
        
        return bomboniere;
        }catch(SQLException ex){
            Logger.getLogger(FilmeDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return null;
    }
     
    
}
