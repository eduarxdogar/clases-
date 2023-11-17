package com.bodega.bodega.pruebas.sinmokito;




import org.junit.Assert;
import org.junit.Test;


public class TestServicioA {

    @Test
    public  void  testSuma(){


        ServicioA servicioA= new ServicioAImpl();
        Assert.assertEquals(servicioA.sumar(2, 2),4);


    }
}
