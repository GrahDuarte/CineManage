/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Classes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Graciely Duarte
 */
public class Venda {
    private ArrayList<Produto> produto;
    private LocalDateTime emissaoDaVenda;
    private BigDecimal precoTotal;

    public Venda() {
        produto = new ArrayList<>();
    }

    public Venda(ArrayList<Produto> produto, LocalDateTime emissaoDaVenda, BigDecimal precoTotal) {
        this.produto = produto;
        this.emissaoDaVenda = emissaoDaVenda;
        this.precoTotal = precoTotal;
    }
  
    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    public LocalDateTime getEmissaoDaVenda() {
        return emissaoDaVenda;
    }

    public void setEmissaoDaVenda(LocalDateTime emissaoDaVenda) {
        this.emissaoDaVenda = emissaoDaVenda;
    }
    
   public BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(BigDecimal precoTotal) {
        this.precoTotal = precoTotal;
    }
}