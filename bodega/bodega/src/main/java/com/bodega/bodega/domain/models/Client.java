package com.bodega.bodega.domain.models;

import lombok.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
@Data

public class Client {



    // Atributos
    private LocalDateTime fechaTomaPedido;

    private String nombre;

    private String apellido;

    private  Integer nit;



}
