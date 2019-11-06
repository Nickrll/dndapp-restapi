package org.springframework.internalrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.internalrestapi.models.Characteristics;
import org.springframework.internalrestapi.repository.CharacteristicsRepositry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/characteristics")
public class CharacteristicsController {
    @Autowired
    CharacteristicsRepositry characteristicsRepositry;

    @RequestMapping("")
    public List<Characteristics> getAllCharacters(){
        return characteristicsRepositry.findAll();
    }

}
