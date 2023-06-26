/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Classes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author Warley Ramires
 */
public class Ingresso {
    private Sessao sessao;
    private boolean meiaEntrada;
    private String documentoComprobatorio;
    private Assento assento;
    private LocalDateTime emissao;
    private BigDecimal preco;

    public Ingresso() {
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public boolean isMeiaEntrada() {
        return meiaEntrada;
    }

    public void setMeiaEntrada(boolean meiaEntrada) {
        this.meiaEntrada = meiaEntrada;
    }

    public String getDocumentoComprobatorio() {
        return documentoComprobatorio;
    }

    public void setDocumentoComprobatorio(String documentoComprobatorio) {
        this.documentoComprobatorio = documentoComprobatorio;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public LocalDateTime getEmissao() {
        return emissao;
    }

    public void setEmissao(LocalDateTime emissao) {
        this.emissao = emissao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
    
    
}


