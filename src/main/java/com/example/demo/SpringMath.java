package com.example.demo;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;
import java.util.Map;

@RestController
public class SpringMath {

    //@GetMapping("/math/calculate")
    //public String mygetRequestMethod(@RequestParam(4,6)Integer x, Integer y){

    //}



    @GetMapping(value = "/math/calculate{x}+{y}")
    public String mathOps(
            @RequestParam ("x") int x,
            @RequestParam ("y") int y
    )

            //int sum = x + y;
    {
        return String.format("%x + %y = " + x+y);
    }

    @PostMapping(value = "/math/Sum")
    public String getAll(WebRequest webRequest) {
        Map<String, String[]> params = webRequest.getParameterMap();
        return "the Sum is";
    }
}
