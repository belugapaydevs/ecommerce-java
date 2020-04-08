package com.example.javarequest.util;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class RestClient {
  private RestTemplate rest;
  private HttpHeaders headers;
  private HttpStatus status;

  public RestClient(String headerName,String headerContent) {
    this.rest = new RestTemplate();
    this.headers = new HttpHeaders();
    headers.add(headerName, headerContent);
  }

  public String post(String url,String body) {
    try {
      HttpEntity<String> requestEntity = new HttpEntity<>(body, headers);

      ResponseEntity<String> responseEntity = rest.exchange(
          url,
          HttpMethod.POST,
          requestEntity,
          String.class
      );

      this.setStatus(responseEntity.getStatusCode());
      return responseEntity.getBody();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public void setStatus(HttpStatus status) {
    this.status = status;
  }
}
