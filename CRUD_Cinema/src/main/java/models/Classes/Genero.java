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
public class Genero extends Entity {
    private String principalGenero;

    public Genero() {
    }

    public Genero(String principalGenero) {
        this.principalGenero = principalGenero;
    }

    public String getPrincipalGenero() {
        return principalGenero;
    }

    public void setPrincipalGenero(String principalGenero) {
        this.principalGenero = principalGenero;
    }        
}