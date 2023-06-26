///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package models;
//
//import java.util.ArrayList;
//
///**
// *
// * @author Warley Ramires
// */
//public class Sala {
//    private String numero;
//    private int capacidade;
//    private String tipoSom;
//    private ArrayList<Sessao> sessoes;
//
//    public Sala() {
//        sessoes = new Sessao<>();
//    }
//
//    public Sala(String numero, int capacidade, String tipoSom, ArrayList<Sessao> sessoes) {
//        this.numero = numero;
//        this.capacidade = capacidade;
//        this.tipoSom = tipoSom;
//        this.sessoes = sessoes;
//    }
//
//    public String getNumero() {
//        return numero;
//    }
//
//    public void setNumero(String numero) {
//        this.numero = numero;
//    }
//
//    public int getCapacidade() {
//        return capacidade;
//    }
//
//    public void setCapacidade(int capacidade) {
//        this.capacidade = capacidade;
//    }
//
//    public String getTipoSom() {
//        return tipoSom;
//    }
//
//    public void setTipoSom(String tipoSom) {
//        this.tipoSom = tipoSom;
//    }
//
//    public ArrayList<Sessao> getSessoes() {
//        return sessoes;
//    }
//
//    public void setSessoes(ArrayList<Sessao> sessoes) {
//        this.sessoes = sessoes;
//    }
//    
//    void adicionarSessao(Sessao sessao){
//        sessoes.add(sessao);
//    }
//    void removerSessao(Sessao sessao){
//        getSessoes(sessoes.remove(sessao));
//    }
//
//    @Override
//    public String toString() {
//        return 
//                "Sala{" 
//                + "numero=" + numero 
//                + ", capacidade=" + capacidade 
//                + ", tipoSom=" + tipoSom 
//                + ", sessoes=" + sessoes 
//                + '}';
//    }
//
// 
//    
//}
