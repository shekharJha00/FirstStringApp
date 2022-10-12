package com.example.springApp.Controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping(value = {"","/","/home"})
    public String sayHello() {
        return "Hello From BridgeLabz";
    }
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello "+name+", from BridgeLabz.";
    }
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+name+", from BridgeLabz.";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello "+user.getFullName()+", from BridgeLabz.";
    }
    @PostMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello "+firstName+" "+lastName+", from BridgeLabz.";
    }
}
