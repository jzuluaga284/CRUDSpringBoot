package com.dev.testOne.com.dev.testOne.controllers;

import com.dev.testOne.com.dev.testOne.Entity.Client;
import com.dev.testOne.com.dev.testOne.Exception.UserNotFoundException;
import com.dev.testOne.com.dev.testOne.Services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HelloWorldController {

    private ClientService clientService;

    public HelloWorldController(ClientService clientService){
        this.clientService = clientService;
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/test")
    public HttpStatus test(){
        return HttpStatus.OK;
    }

    @GetMapping("/client/{id}")
    public Optional<Client> test2(@PathVariable int id){
        Optional<Client> client = clientService.getClient(id);
        if(!client.isEmpty()){
            return client;
        }else{
            throw new UserNotFoundException("id: " + id);
        }
    }

    @PostMapping("/client")
    public void saveClient(@RequestBody Client client){
        clientService.setClient(client);
    }

    @DeleteMapping("/client/{id}")
    public void deleteClient(@PathVariable int id){
        clientService.deleteClient(id);
    }
}
