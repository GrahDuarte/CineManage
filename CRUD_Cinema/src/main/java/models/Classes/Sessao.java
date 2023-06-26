/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Warley Ramires
 */
public class Sessao {
    private LocalDateTime data;
    private boolean tresD;
    private double preco;
    private Sala salaExibicao;
    private Filme filmeExibido;
    private ArrayList<Ingresso> ingressosVendidos;

    public Sessao(){
        ingressosVendidos = new ArrayList<>();
    }

    public Sessao(LocalDateTime data, boolean tresD, double preco, Sala salaExibicao, Filme filmeExibido, ArrayList<Ingresso> ingressosVendidos) {
        this.data = data;
        this.tresD = tresD;
        this.preco = preco;
        this.salaExibicao = salaExibicao;
        this.filmeExibido = filmeExibido;
        this.ingressosVendidos = ingressosVendidos;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isTresD() {
        return tresD;
    }

    public void setTresD(boolean tresD) {
        this.tresD = tresD;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Sala getSalaExibicao() {
        return salaExibicao;
    }

    public void setSalaExibicao(Sala salaExibicao) {
        this.salaExibicao = salaExibicao;
    }

    public Filme getFilmeExibido() {
        return filmeExibido;
    }

    public void setFilmeExibido(Filme filmeExibido) {
        this.filmeExibido = filmeExibido;
    }

    public ArrayList<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(ArrayList<Ingresso> ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }
    
    void VenderIngresso(){
        
    }
    
      void adicionarFilme(Filme filme){
    }
    
    void removerFilme(Filme filme){
    
    }
    
    
}

