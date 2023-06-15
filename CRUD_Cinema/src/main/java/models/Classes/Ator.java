/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Classes;

/**
 *
 * @author lorena
 */
public class Ator extends ProfissionalCinematografico {
    private boolean protagonista;

    public Ator(boolean protagonista) {
        this.protagonista = protagonista;
    }

    public Ator(boolean protagonista, String nome, String apelido, Pais nacionalidade, String genero) {
        super(nome, apelido, nacionalidade, genero);
        this.protagonista = protagonista;
    } 

    public boolean isProtagonista() {
        return protagonista;
    }

    public void setProtagonista(boolean protagonista) {
        this.protagonista = protagonista;
    }   
}