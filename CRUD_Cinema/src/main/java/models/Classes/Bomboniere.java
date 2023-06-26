/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Classes;

import java.util.ArrayList;

/**
 *
 * @author Graciely Duarte
 */
public class Bomboniere {
    private ArrayList<Produto> produto;
    private int venda;

    public Bomboniere() {
        produto = new ArrayList<>();
    }

    public Bomboniere(ArrayList<Produto> produto, int venda) {
        this.produto = produto;
        this.venda = venda;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }
    
    void adicionarProduto(Produto produto){

    }
    void removerProduto(Sessao produto){

    }

    void venderProduto(){

    }
}

   
