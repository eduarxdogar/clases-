package com.bodega.bodega.infraestructure.adapter;

import com.bodega.bodega.domain.models.Client;
import com.bodega.bodega.domain.ports.IClientRepository;
import com.bodega.bodega.infraestructure.entity.ClientEntity;
import com.bodega.bodega.infraestructure.rest.mapper.IClientMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Slf4j
public class ClientRepositoryMySQL implements IClientRepository {

    private  final  IClientCrudRepositoryAdapter iClientCrudRepositoryAdapter;

    @Autowired
    private IClientMapper iClientMapper;

    public ClientRepositoryMySQL(IClientCrudRepositoryAdapter iClientCrudRepositoryAdapter) {
        this.iClientCrudRepositoryAdapter = iClientCrudRepositoryAdapter;
    }

    @Override
    public Iterable<Client> getListCliente() {
        return this.iClientMapper.toClient(this.iClientCrudRepositoryAdapter.findAll());
    }

    @Override
    public Optional<Client> getClienteById(Integer nit) {
        ClientEntity client = this.iClientCrudRepositoryAdapter.findById(nit).orElseThrow(
                ()-> new ResourceNotFoundException("Recurso no Encontrado")
        );
        return Optional.of(this.iClientMapper.toClient(client));

    }


    @Override
    public Client saveClient(Client client) {
        ClientEntity clientEntity= this.iClientMapper.toClientEntity(client);
        System.out.println("nit" + clientEntity.getNit());
        return this.iClientMapper.toClient(this.iClientCrudRepositoryAdapter.save(clientEntity));
    }

    @Override
    public void deleteClientById(Integer nit) {
        ClientEntity clientEntity = this.iClientCrudRepositoryAdapter.findById(nit).orElseThrow(
                ()-> new ResourceNotFoundException("Recurso no Encontrado")
        );
        this.iClientCrudRepositoryAdapter.deleteById(clientEntity.getNit());


    }
}
