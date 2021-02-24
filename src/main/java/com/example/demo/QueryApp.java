package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class QueryApp {

    @GetMapping("/animals")
    public String favoriteAnimal(@RequestParam( value = "animal", defaultValue = "cat") String animal) {
        return animal+ "s are the best";
    }

    //@GetMapping("/animal/{animalid}/bananas")
    //public String accessSpecificAnimal(@PathVariable String animalId) {

    //}
}
