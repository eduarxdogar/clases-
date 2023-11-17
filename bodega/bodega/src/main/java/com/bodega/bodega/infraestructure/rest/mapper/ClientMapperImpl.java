package com.bodega.bodega.infraestructure.rest.mapper;

import com.bodega.bodega.domain.models.Client;
import com.bodega.bodega.infraestructure.entity.ClientEntity;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Iterator;
/*
@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2023-07-15T40:41:29-0500",
        comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)

 */
@Component
public class ClientMapperImpl implements  IClientMapper {
    public ClientMapperImpl(){

    }



    public Client toClient(ClientEntity client) {
        if (client == null){
            return null;

        }else {

            Client client1 = new Client();

            client1.setNit(client.getNit());
            client1.setFechaTomaPedido(client.getFechaTomaPedido());
            client1.setNombre(client.getNombre());
            client1.setApellido(client.getApellido());
            return client1;
        }
    }


    public Iterable<Client> toClient(Iterable<ClientEntity> clientEntities) {
        if (clientEntities==null){
            return null;
        }else {
            ArrayList<Client> iterable = new ArrayList<>();
            Iterator var3 = clientEntities.iterator();
            while (var3.hasNext()){
                ClientEntity clientEntity = (ClientEntity) var3.next();
                iterable.add(this.toClient(clientEntity));
            }
            return  iterable;
        }

    }

    public ClientEntity toClientEntity(Client client) {
        if (client == null){
            return null;
        }else {
            ClientEntity clientEntity = new ClientEntity();
            clientEntity.setNit(client.getNit());
            clientEntity.setNombre(client.getNombre());
            clientEntity.setApellido(client.getApellido());
            clientEntity.setFechaTomaPedido(client.getFechaTomaPedido());
            return clientEntity;

        }

    }
}
