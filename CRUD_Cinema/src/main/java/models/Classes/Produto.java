/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Classes;

/**
 *
 * @author Graciely Duarte
 */
public class Produto {
    private String nome;
    private String descricao;
    private String tamanho;
    private BigDecimal preco;

    public Produto() {
    }

    public Produto(String nome, String descricao, String tamanho, String preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco
    }

 public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
   public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

   public String getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }