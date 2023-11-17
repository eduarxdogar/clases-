package com.bodega.bodega.application;

import com.bodega.bodega.domain.models.Client;
import com.bodega.bodega.domain.ports.IClientRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class ClientService implements ICreateClientService {

    private final  IClientRepository iClientRepository;

    public ClientService(IClientRepository iClientRepository) {
        this.iClientRepository = iClientRepository;
    }

    @Override
    public Iterable<Client> getListCliente() {
        return (List<Client>) this.iClientRepository.getListCliente();
    }


    @Override
    public Client getClienteById(Integer nit) {
        return this.iClientRepository.getClienteById(nit).get();
    }

    @Override
    public Client saveClient(Client client) {
       if (client.getNit()!= null){
            client.setFechaTomaPedido(LocalDateTime.now());
        }else {
            client.setFechaTomaPedido(LocalDateTime.now());
        }
        return this.iClientRepository.saveClient(client);
    }

    @Override
    public void deleteClientById(int nit) {
        this.iClientRepository.deleteClientById(nit);

    }
}
