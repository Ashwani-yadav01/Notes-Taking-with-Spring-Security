package com.ashwani.secure.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    String hello(){
        return "Hello Notes taking app";
    }
    @GetMapping("/contact")
    String contact(){
        return "Contact page to be loaded";
    }
}
