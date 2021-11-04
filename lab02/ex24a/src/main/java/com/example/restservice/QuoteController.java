package com.example.restservice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class QuoteController {

    private String url = "https://movie-quote-api.herokuapp.com/v1/quote";

    @GetMapping("/quote")
    public Map<String, String> quote() {

        // get from API
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseData = restTemplate.getForEntity(url, String.class);

        JSONObject jsonData = new JSONObject(responseData.getBody());

        Map<String, String> response = new HashMap<String, String>();
        response.put("quote",jsonData.toMap().get("quote").toString());
         return response;
    }
}
