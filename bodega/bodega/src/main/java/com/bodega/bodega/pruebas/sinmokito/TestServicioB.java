package com.bodega.bodega.pruebas.sinmokito;

import com.bodega.bodega.pruebas.sinmokito.ServicioA;
import com.bodega.bodega.pruebas.sinmokito.ServicioAImpl;
import com.bodega.bodega.pruebas.sinmokito.ServicioB;
import com.bodega.bodega.pruebas.sinmokito.ServicioBImpl;
import org.junit.Assert;
import org.junit.Test;




public class TestServicioB {

    @Test
    public  void  testMultiplicacion(){


        ServicioB servicioB = new ServicioBImpl();

        Assert.assertEquals(servicioB.multipplicar(5,5),25);
    }

    @Test
    public  void  testmultiplicarSumar(){
        ServicioA servicioA = new ServicioAImpl();

        ServicioB servicioB = new ServicioBImpl();

        servicioB.setServicioA(servicioA);
        Assert.assertEquals(servicioB.multiplicarSumar(2,3,2),10);

    }
}
