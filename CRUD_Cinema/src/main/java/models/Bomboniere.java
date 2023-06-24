/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Graciely Duarte
 */
public class Bomboniere {
    private ArrayList<Produto> produto;
    private int venda;

    public Sala() {
        produto = new Produto<>();
    }

    public Bomboniere(ArrayList<Produto> produto, int venda) {
        this.produto = produto;
        this.venda = venda;
    }

 public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }
    
    void adicionarProduto(Produto produto){
        produto.add(produto);
    }
    void removerProduto(Sessao produto){
        getSessoes(Produto.remove(produto));
    }

    void venderProduto(int venda){
        venda.add(venda);
    }

    @Override
    public String toString() {
        return 
                "Bomboniere{" 
                + "produto=" + produto
                + ", venda=" + venda 
                + '}';
    }

 
    
}