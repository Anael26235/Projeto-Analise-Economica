package com.example.service;

import com.example.dto.Response;
import com.example.dto.ResponseList;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository bancoRepository;

    public Response getAll(){
        return new Response(200, false, "Success", new ResponseList(bancoRepository.findAll()));
    }

    public Response getById(Integer id){
        return new Response(200, false, "Success", new ResponseList(bancoRepository.findById(id)));
    }

}
