/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Warley Ramires
 */
public class Endereco {
    
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;

    public Endereco() {
    }

    public Endereco(String pais, String estado, String cidade, String bairro, String logradouro) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }
    

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return 
                "Endereco{" 
                + "pais=" + pais 
                + ", estado=" + estado 
                + ", cidade=" + cidade 
                + ", bairro=" + bairro 
                + ", logradouro=" + logradouro + '}';
    }
    
    
}
