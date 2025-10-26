package com.dev.testOne.com.dev.testOne.Services;

import com.dev.testOne.com.dev.testOne.Entity.Client;
import com.dev.testOne.com.dev.testOne.repository.ClientJpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ClientService {

    private ClientJpaRepository clientJpaRepository;
    public ClientService(ClientJpaRepository clientJpaRepository){
        this.clientJpaRepository = clientJpaRepository;
    }
    public void setClient(Client client){
        clientJpaRepository.save(client);
    }

    public void deleteClient(int id){
        clientJpaRepository.deleteById(id);
    }
    public Optional<Client> getClient(int id){
        return clientJpaRepository.findById(id);
    }

    /**
     * This is a documentation test
     * @param client
     */
    public void upDateClient(Client client){
        clientJpaRepository.save(client);
    }


}
