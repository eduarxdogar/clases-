package com.bodega.bodega.pruebas;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaCaptor {// clase

    @Mock// anotacion
    List<String> getMockedList;

    @Captor
    ArgumentCaptor argCaptor; //ArgumentCaptor nos permite capturar un argumento pasado a un método para inspeccionarlo. Esto es especialmente útil cuando no podemos acceder al argumento fuera del método que nos gustaría probar

    @Test
    public void whenUseCaptorAnnotation_thenTheSame() {
        getMockedList.add("one");
        Mockito.verify(getMockedList).add((String) argCaptor.capture());

        assertEquals("one", argCaptor.getValue());



    }
}
