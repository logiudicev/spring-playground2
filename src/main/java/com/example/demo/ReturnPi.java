
package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnPi {
    @RequestMapping("/math/pi")
    public String piTest() {
        return "3.141592653589793";
    }
}


/*
@RestController
public class piTest {
    @RequestMapping("/math/pi")
    public String retrunPi() {
        return "3.141592653589793";
    }
}

 */