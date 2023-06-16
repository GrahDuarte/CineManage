/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crud_cinema;

import java.util.ArrayList;
import models.Classes.Ator;
import models.Classes.Cinema;
import models.Classes.Diretor;
import models.Classes.Endereco;
import models.Classes.Pais;
import models.Classes.ProfissionalCinematografico;
import models.Daos.AtorDao;
import models.Daos.CinemaDao;
import models.Daos.DiretorDao;
import models.Daos.EnderecoDao;
import models.Daos.PaisDao;
import models.Daos.ProfissionalCinematograficoDao;
//import models.Sala;

/**
 *
 * @author Warley Ramires
 */
public class CRUD_Cinema {

    public static void main(String[] args) {
         // Criando um objeto Endereco
        Endereco endereco = new Endereco(null, "Brasil", "São Paulo", "São Paulo", "Centro", "Rua Principal", 10, "SC");
    
       // ArrayList<Sala> salas = new ArrayList<>();
//        Sala sala1 = new Sala(1, 100);
//        Sala sala2 = new Sala(2, 80);
//        salas.add(sala1);
//        salas.add(sala2);

//Salvar no banco de dados
//     Long enderecoId = new EnderecoDao().saveOrUpdate(endereco);
//     endereco.setId(enderecoId);
 // Criando um objeto Cinema
        Cinema cinema = new Cinema(null, "CineCity", 1234567890L, endereco, 9876543210L, "CC");
        System.out.println("Nome Fantasia: " + cinema.getNomeFantasia());
        System.out.println("CNPJ: " + cinema.getCnpj());
        System.out.println("Endereço: " + cinema.getEndereco());
        System.out.println("Telefone: " + cinema.getTelefone());
        System.out.println("Sigla: " + cinema.getSigla());
     //   System.out.println("Salas: " + cinema.getSalas());
     
     //Salvar no banco de dados
//     Long cinemaId = new CinemaDao().saveOrUpdate(cinema);
//     cinema.setId(cinemaId);

        Pais pais = new Pais(null, "China");
//        Ator ator = new Ator(true, null, "JK", "JK", pais, "Masculino");
        // Salvar Pais no banco
        Long paisId = new PaisDao().saveOrUpdate(pais);
        pais.setId(paisId);
//        ProfissionalCinematografico profissional = new ProfissionalCinematografico(null, "JK", "JK", pais, "Masculino");
//        Long profissionalId = new ProfissionalCinematograficoDao().saveOrUpdate(profissional);
//        profissional.setId(profissionalId);
//        Long atorId = new AtorDao().saveOrUpdate(ator);
//        ator.setId(atorId);
        Diretor diretor = new Diretor(true, false, false, null, "JK", "JK", pais, "Masculino");
        Long diretorId = new DiretorDao().saveOrUpdate(diretor);
        diretor.setId(diretorId);
    }
}
