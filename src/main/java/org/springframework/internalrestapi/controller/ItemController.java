package org.springframework.internalrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.internalrestapi.models.Item;
import org.springframework.internalrestapi.repository.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemRepository itemRepository;

    @RequestMapping("")
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    @RequestMapping("/{itemid}")
    public Optional<Item> getItem(@PathVariable("itemid") String itemid){
        return itemRepository.findById(Long.parseLong(itemid));
    }

    @PostMapping("/add")
    public @ResponseBody String AddItem(@RequestParam String name){

        Item item = new Item();
        item.setName(name);

        itemRepository.save(item);

        return "User has been added";
    }

    @PostMapping("/delete")
    public @ResponseBody
    String DeleteItem(@RequestParam Long id){
        itemRepository.deleteById(id);
        return "Item has been deleted";
    }

    @PostMapping("/delete/all")
    public @ResponseBody
    String DeleteAllUser() {
        itemRepository.deleteAll();
        return "All items have been deleted";
    }


    @PostMapping("/update")
    public @ResponseBody String UpdateUser(@RequestParam Long id,
                                           @RequestParam String name){
        Item itemInDB = itemRepository.findById(id).get();
        itemInDB.setName(name);
        itemRepository.save(itemInDB);

        return "Succesfully updated";
    }

}
