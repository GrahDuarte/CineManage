/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import entity.Entity;
import java.util.ArrayList;

/**
 *
 * @author Warley Ramires
 */
public class Cinema extends Entity {
    
    private String nomeFantasia;
    private long cnpj;
    private Endereco endereco;
    private long telefone;
    private String sigla;
    private ArrayList<Sala> salas;

    public Cinema() {
        salas = new ArrayList<>();
    }

    public Cinema(String nomeFantasia, long cnpj, Endereco endereco, long telefone, String sigla, ArrayList<Sala> salas) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sigla = sigla;
        this.salas = salas;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public ArrayList<Sala> getSala() {
        return salas;
    }

    public void setSala(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
    public void cadastrarSala(Sala sala){
        salas.add(sala);
    }
    
    public void removerSala(Sala sala){
        salas.remove(sala);
    }
    
    /*
    public void venderIngresso(Ingresso ingresso){    
    }
    public void venderProdutosBombonieire(Int venda){
    }
    
    */
    
    @Override
    public String toString(){
        return "nomeFantasia : " + this.nomeFantasia + "\n" +
                "cnpj : " + this.cnpj + "\n";
    }
}



