package org.springframework.internalrestapi.controller;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.internalrestapi.models.Inventory;
import org.springframework.internalrestapi.models.Charmander;
import org.springframework.internalrestapi.repository.CharacterRepository;
import org.springframework.internalrestapi.repository.InventoryRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    InventoryRepository inventoryRepository;
    @Autowired
    CharacterRepository characterRepository;

    @RequestMapping("")
    public List<Inventory> getAllInventories(){
        return inventoryRepository.findAll();
    }

    @RequestMapping("/{characterid}")
    public Inventory getItem(@PathVariable("characterid") String characterid){
        Charmander character = characterRepository.findById(Long.parseLong(characterid)).get();
        Inventory inv = inventoryRepository.getOne(character.getId());
        return inv; //criteria.add(Restrictions.eq("characterid", character.get().getId()));
    }
}
