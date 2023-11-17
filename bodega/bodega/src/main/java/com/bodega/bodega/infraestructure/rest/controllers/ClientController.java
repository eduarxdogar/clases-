package com.bodega.bodega.infraestructure.rest.controllers;

import com.bodega.bodega.application.ICreateClientService;
import com.bodega.bodega.domain.models.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bodega")
@Slf4j
public class ClientController {

    private final ICreateClientService iCreateClientService;

    public ClientController(ICreateClientService iCreateClientService) {
        this.iCreateClientService = iCreateClientService;
    }
    @GetMapping
    public ResponseEntity<Iterable<Client>> getClients(){
        return  new ResponseEntity<>(this.iCreateClientService.getListCliente(), HttpStatus.OK);

    }
    @PostMapping
    public  ResponseEntity<Client> saveClient(@RequestBody Client client){
        log.info("Guardo Con Exito Su Cliente");
        log.info("client : {}",client);
        return  new ResponseEntity<>(iCreateClientService.saveClient(client),HttpStatus.CREATED);

    }
    @GetMapping("/{nit}")
    public  ResponseEntity<Client> getClient(@PathVariable Integer nit){
        log.info("Nit"+nit);
        log.info("client{}",this.iCreateClientService.getClienteById(nit));
        return new ResponseEntity<>(this.iCreateClientService.getClienteById(nit),HttpStatus.OK);
    }
    @DeleteMapping("/{nit}")
    public void deleteClient(@PathVariable Integer nit){
        this.iCreateClientService.deleteClientById(nit);
    }



}
