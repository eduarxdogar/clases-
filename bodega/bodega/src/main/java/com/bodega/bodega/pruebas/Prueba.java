package com.bodega.bodega.pruebas;


import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prueba {


    @Mock
    List<String> mockedList;

    @Test
    public  void inyeccionMocks(){

        mockedList.add("one");
        Mockito.verify(mockedList).add("one");
        assertEquals(0, mockedList.size());

        Mockito.when(mockedList.size()).thenReturn(100);
        assertEquals(100,mockedList.size());
    }




    @Spy
    List<String> spiedList = new ArrayList<String>();


    @Test
    public void spyInyeccion(){
        spiedList.add("one");
        spiedList.add("two");

        Mockito.verify(spiedList).add("one");
        Mockito.verify(spiedList).add("two");


        assertEquals(2, spiedList.size());
        Mockito.doReturn(100).when(spiedList).size();
        assertEquals(100,spiedList);

    }



}
