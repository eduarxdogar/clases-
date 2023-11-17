package com.bodega.bodega.infraestructure.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "Seller")
public class SellerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String nombre;

    private  String apellido;

    private  String email;
}
