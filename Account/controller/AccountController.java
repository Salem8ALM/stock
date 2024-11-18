package com.example.Account.controller;

import com.example.Account.bo.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest;

@RestController
@RequestMapping("api/")
public class AccountController {

    private final RestTemplate restTemplate;

    private static final String STOCK_API = "http://localhost:8080/api/account";

    public AccountController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/account")
    public AccountResponse showStocks() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<AccountResponse> responseEntity = restTemplate.getForEntity(STOCK_API, AccountResponse.class);

        System.out.println(responseEntity);
        System.out.println(responseEntity.getBody().toString());


        return responseEntity.getBody();
    }


}
