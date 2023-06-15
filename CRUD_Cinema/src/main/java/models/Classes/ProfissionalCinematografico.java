/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Classes;

import entity.Entity;

/**
 *
 * @author lorena
 */
public class ProfissionalCinematografico extends Entity {
    private String nome;
    private String apelido;
    private Pais nacionalidade;
    private String genero;

    public ProfissionalCinematografico() {
    }

    public ProfissionalCinematografico(String nome, String apelido, Pais nacionalidade, String genero) {
        this.nome = nome;
        this.apelido = apelido;
        this.nacionalidade = nacionalidade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Pais getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Pais nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

