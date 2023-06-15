/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Classes;

import entity.Entity;
import java.util.ArrayList;

/**
 *
 * @author lorena
 */
public class Filme extends Entity {
    private ClassificacaoEtaria classificacaoIndicativa;
    private String tituloPortugues;
    private String tituloOriginal;
    private boolean legendado;
    private boolean dublado;
    private ArrayList<Genero> generos;
    private Integer duracao;
    private ArrayList<ProfissionalCinematografico> artista;

    public Filme() {
    }

    public Filme(ClassificacaoEtaria classificacaoIndicativa, String tituloPortugues, String tituloOriginal, boolean legendado, boolean dublado, ArrayList<Genero> generos, Integer duracao, ArrayList<ProfissionalCinematografico> artista) {
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.tituloPortugues = tituloPortugues;
        this.tituloOriginal = tituloOriginal;
        this.legendado = legendado;
        this.dublado = dublado;
        this.generos = generos;
        this.duracao = duracao;
        this.artista = artista;
    }

    public ClassificacaoEtaria getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(ClassificacaoEtaria classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getTituloPortugues() {
        return tituloPortugues;
    }

    public void setTituloPortugues(String tituloPortugues) {
        this.tituloPortugues = tituloPortugues;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public boolean isLegendado() {
        return legendado;
    }

    public void setLegendado(boolean legendado) {
        this.legendado = legendado;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    public ArrayList<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<Genero> generos) {
        this.generos = generos;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public ArrayList<ProfissionalCinematografico> getArtista() {
        return artista;
    }

    public void setArtista(ArrayList<ProfissionalCinematografico> artista) {
        this.artista = artista;
    }   
}