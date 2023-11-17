package com.bodega.bodega.domain.models.config;

import com.bodega.bodega.application.ClientService;
import com.bodega.bodega.application.ICreateClientService;
import com.bodega.bodega.domain.ports.IClientRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanClientConfiguration {
     private  final IClientRepository iClientRepository;

    public BeanClientConfiguration(IClientRepository iClientRepository) {
        this.iClientRepository = iClientRepository;
    }


    @Primary
    @Bean
    ICreateClientService ClientBeanService(){
        return  new ClientService(iClientRepository);

    }




}
