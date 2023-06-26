/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Classes;

/**
 *
 * @author lorena
 */



public class Diretor extends ProfissionalCinematografico {
    private boolean principal;
    private boolean fotografia;
    private boolean arte;

    
    public Diretor() {  
    }

    public Diretor(boolean principal, boolean fotografia, boolean arte) {
        this.principal = principal;
        this.fotografia = fotografia;
        this.arte = arte;
    }

    public Diretor(boolean principal, boolean fotografia, boolean arte, Long id, String nome, String apelido, Pais nacionalidade, String genero) {
        super(id, nome, apelido, nacionalidade, genero);
        this.principal = principal;
        this.fotografia = fotografia;
        this.arte = arte;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    public boolean isFotografia() {
        return fotografia;
    }

    public void setFotografia(boolean fotografia) {
        this.fotografia = fotografia;
    }

    public boolean isArte() {
        return arte;
    }

    public void setArte(boolean arte) {
        this.arte = arte;
    }
}