package com.bodega.bodega.infraestructure.config;

import com.bodega.bodega.application.ClientService;
import com.bodega.bodega.domain.models.Client;
import com.bodega.bodega.domain.ports.IClientRepository;
import org.springframework.context.annotation.Bean;

public class BeanClientConfig {


    public BeanClientConfig() {

    }


    private IClientRepository iClientRepository;


    @Bean
    public ClientService clientService(){
        ClientService clientService = new ClientService(iClientRepository);

        return clientService;
    }
}
