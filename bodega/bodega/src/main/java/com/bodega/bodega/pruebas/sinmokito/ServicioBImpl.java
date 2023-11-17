package com.bodega.bodega.pruebas.sinmokito;

import com.bodega.bodega.pruebas.sinmokito.ServicioA;
import com.bodega.bodega.pruebas.sinmokito.ServicioB;

public class ServicioBImpl implements ServicioB {

    ServicioA servicioA;

    public  ServicioA getServicioA(){
        return servicioA;
    }
    public  void  setServicioA(ServicioA servicioA){
        this.servicioA = servicioA;
    }

    @Override
    public int multiplicarSumar(int a, int b, int multiplicador) {
        return servicioA.sumar(a,b) * multiplicador;
    }


    public int multipplicar(int a,int  b  ) {
        return a*b;
    }
}
