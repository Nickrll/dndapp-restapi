package org.springframework.internalrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.internalrestapi.models.Charmander;
import org.springframework.internalrestapi.repository.CharacterRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterController {
    @Autowired
    CharacterRepository characterRepository;

    @RequestMapping("")
    public List<Charmander> getAllCharmanders(){
        return characterRepository.findAll();
    }

}
