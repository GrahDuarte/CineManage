/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package models.Classes;

/**
 *
 * @author lorena
 */
public enum ClassificacaoEtaria {
    L("L"), DEZ("10"), DOZE("12"), QUARTORZE("14"), DEZESSEIS("16"), DEZOITO("18");
    
    private String descricao;
    
    ClassificacaoEtaria(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}