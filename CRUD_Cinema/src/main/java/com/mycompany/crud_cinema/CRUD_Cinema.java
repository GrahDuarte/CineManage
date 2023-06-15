/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crud_cinema;

import java.util.ArrayList;
import models.Classes.Cinema;
import models.Classes.Endereco;
import models.Daos.CinemaDao;
import models.Daos.EnderecoDao;
//import models.Sala;

/**
 *
 * @author Warley Ramires
 */
public class CRUD_Cinema {

    public static void main(String[] args) {
         // Criando um objeto Endereco
        Endereco endereco = new Endereco("Brasil", "São Paulo", "São Paulo", "Centro", "Rua Principal");
    
       // ArrayList<Sala> salas = new ArrayList<>();
//        Sala sala1 = new Sala(1, 100);
//        Sala sala2 = new Sala(2, 80);
//        salas.add(sala1);
//        salas.add(sala2);

 // Criando um objeto Cinema
        Cinema cinema = new Cinema(null, "CineCity", 1234567890L, endereco, 9876543210L, "CC");
        System.out.println("Nome Fantasia: " + cinema.getNomeFantasia());
        System.out.println("CNPJ: " + cinema.getCnpj());
        System.out.println("Endereço: " + cinema.getEndereco());
        System.out.println("Telefone: " + cinema.getTelefone());
        System.out.println("Sigla: " + cinema.getSigla());
     //   System.out.println("Salas: " + cinema.getSalas());
     
     //Salvar no banco de dados
     //Long enderecoId = new EnderecoDao.saveOrUpdate(cinema.getEndereco());
//     Long cinemaId = new CinemaDao().saveOrUpdate(cinema);
//     cinema.setId(cinemaId);
    }
}
