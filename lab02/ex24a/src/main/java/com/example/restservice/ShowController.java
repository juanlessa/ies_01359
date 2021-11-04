package com.example.restservice;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ShowController {


    private String url = "https://movie-quote-api.herokuapp.com/";

	@GetMapping("/show")
	public List<Object> show() {

        // get from API
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseData = restTemplate.getForEntity(url, String.class);
		JSONObject jsonResponse = new JSONObject(responseData.getBody());

		JSONArray jsonData = jsonResponse
				.getJSONArray("showSlugs");

		List<Object> showSlugsList = (List<Object>) jsonData.toList();

		return showSlugsList;
	}
}
