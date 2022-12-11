package com.example.controller;

import com.example.dto.Response;
import com.example.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserServiceImpl bancoServiceImpl;

    @GetMapping(value= "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> getAllClients(){
        Response response = bancoServiceImpl.getAll();
        return new ResponseEntity(response, HttpStatus.OK);
    }
    
    @GetMapping(value= "/{idClient}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> getClientById(@PathVariable("idClient") Integer idClient){
        Response response = bancoServiceImpl.getById(idClient);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
