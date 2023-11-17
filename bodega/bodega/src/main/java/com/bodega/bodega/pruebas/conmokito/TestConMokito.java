package com.bodega.bodega.pruebas.conmokito;

import com.bodega.bodega.pruebas.sinmokito.ServicioA;
import com.bodega.bodega.pruebas.sinmokito.ServicioB;
import com.bodega.bodega.pruebas.sinmokito.ServicioBImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestConMokito {//aislar las pruebas unitarias y una de las opciones es usar Java Mockito y crear un Mock Object. Los objetos Mock nos permiten simular ser un objeto real y eliminan dependencias , permitiendo que los test se ejecuten de forma aislada.

    @Test
    public  void  testmultiplicarSumar(){

        ServicioA servicioA = mock(ServicioA.class);
        when(servicioA.sumar(2,3)).thenReturn(5);// realiza solo  la suma



        ServicioB servicioB = new ServicioBImpl();
        servicioB.setServicioA(servicioA);
        Assert.assertEquals(servicioB.multiplicarSumar(2,3,2),10);// realiza suma y el resultado se multiplica
    }
}
