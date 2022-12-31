package com.hersac.middleware;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MiddlewareController {

    @PostMapping("/validar")
    public User login(@RequestBody User user) {
        String url = "http://localhost:3000/data/validar";
        RestTemplate request = new RestTemplate();
        User response = request.postForObject(url, user, User.class);
        return response;
    }

}
