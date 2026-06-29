package com.example.dockerholaapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/hola")
    public String HolaController() {
        return "Hola desde Spring Boot en Docker";
    }
}
