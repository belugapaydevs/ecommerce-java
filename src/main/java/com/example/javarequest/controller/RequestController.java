package com.example.javarequest.controller;

import com.example.javarequest.bean.Request;
import com.example.javarequest.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

  @Autowired
  Services services;

  @PostMapping(value = "s")
  public ResponseEntity<Object> sendRequest(@RequestBody Request request) {
    return ResponseEntity.ok().body(services.sendRequest(request));
  }
}
