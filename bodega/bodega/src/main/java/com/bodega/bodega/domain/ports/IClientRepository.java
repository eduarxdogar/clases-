package com.bodega.bodega.domain.ports;

import com.bodega.bodega.domain.models.Client;

import java.util.Optional;

public interface IClientRepository {



    Iterable<Client>getListCliente();


    Optional<Client> getClienteById(Integer nit);

    Client saveClient(Client client);

    void  deleteClientById(Integer nit);
}
