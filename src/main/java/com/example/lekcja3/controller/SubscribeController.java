package com.example.lekcja3.controller;

import com.example.lekcja3.model.Person;
import com.example.lekcja3.service.SubscribeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class SubscribeController {

    private final SubscribeService subscribeService;

    public SubscribeController(SubscribeService subscribeService) {
        this.subscribeService = subscribeService;
    }

    @GetMapping("signed")
    public String signed() {
        String response = "";
        for (String name : subscribeService.getNames()) {
            response += name + "\n";
        }

        return response;
    }

    @PostMapping("sign")
    public String sign(@RequestBody String name) {
        subscribeService.addName(name);
        System.out.println("Saving " + name);
        return "Saved " + name;
    }

    @PostMapping("addPerson")
    public Person addPerson(@RequestBody Person person) {
        System.out.println("Adding person " + person);
        subscribeService.addPerson(person);
        return person;
    }

    @GetMapping("signedPersons")
    @ResponseBody
    public List<Person> signedPersons() {
        return subscribeService.getPersons();
    }
}
