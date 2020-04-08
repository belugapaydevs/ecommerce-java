package com.example.javarequest.service;

import com.example.javarequest.bean.Request;
import com.example.javarequest.util.RestClient;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

@Service
public class Services {
  public String sendRequest(Request request) {
    Gson gson = new Gson();
    RestClient restClient = new RestClient("Content-Type", "application/json");
    String body = gson.toJsonTree(request).toString();
    return restClient.post("https://transaction.belugapay.com/api/v2/sale", body);
  }
}
