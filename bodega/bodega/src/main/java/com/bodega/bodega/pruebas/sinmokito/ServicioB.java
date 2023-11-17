package com.bodega.bodega.pruebas.sinmokito;



public interface ServicioB {

    public ServicioA getServicioA(); // instaciamos Servicio A creamor un tipo get para ser utilizado

    public  void  setServicioA(ServicioA servicioA);

    public  int multiplicarSumar(int a, int b, int multiplicador);

    public  abstract int multipplicar(int a , int b);

}
