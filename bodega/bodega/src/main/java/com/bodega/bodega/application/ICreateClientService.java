package com.bodega.bodega.application;

import com.bodega.bodega.domain.models.Client;

public interface ICreateClientService {

    Iterable<Client>getListCliente();

    Client getClienteById(Integer nit);

    Client saveClient(Client client);

    void  deleteClientById(int nit);

}
