package com.example.clicker.controllers;

import com.example.clicker.services.ConnectionMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
    @Autowired
    ConnectionMethods connectionMethods;

    @GetMapping(value = "/")
    public ResponseEntity returnDocument(@RequestBody String url){
        return ResponseEntity.ok(connectionMethods.getDocument(url));

    }
}
