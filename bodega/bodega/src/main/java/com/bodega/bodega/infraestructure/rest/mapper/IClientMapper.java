package com.bodega.bodega.infraestructure.rest.mapper;


import com.bodega.bodega.domain.models.Client;
import com.bodega.bodega.infraestructure.entity.ClientEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel  ="sping")
public interface IClientMapper {


    @Mappings({
            @Mapping(source = "nit" , target = "nit"),
            @Mapping(source = "fechaTomaPedido" , target = "fechaTomaPedido"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "apellido",target ="apellido")
             }

    )
    Client toClient(ClientEntity client);

    Iterable<Client> toClient(Iterable<ClientEntity> clientEntities);

    @InheritInverseConfiguration
    ClientEntity toClientEntity(Client client);

}
