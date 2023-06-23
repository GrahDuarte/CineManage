/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Classes;

/**
 *
 * @author Warley Ramires
 */
public class Assento {
    private char fileira;
    private int numero;

    public Assento() {
    }

    public Assento(char fileira, int numero) {
        this.fileira = fileira;
        this.numero = numero;
    }

    
    public char getFileira() {
        return fileira;
    }

    public void setFileira(char fileira) {
        this.fileira = fileira;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
