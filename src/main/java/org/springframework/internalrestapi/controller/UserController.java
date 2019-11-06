package org.springframework.internalrestapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.internalrestapi.models.User;
import org.springframework.internalrestapi.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/{userId}")
    public Optional<User> getUser(@PathVariable("userId") String userId){
        return userRepository.findById(Long.parseLong(userId));
    }

    //@PostMapping("/add")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody String AddUser(@RequestBody String userdata){
        Gson gson = new Gson();

        User[] users = gson.fromJson(userdata, User[].class);

        for(User user : users){
            userRepository.save(user);

        }

        return "Users has been added";
    }

    @PostMapping("/delete")
    public @ResponseBody String DeleteUser(@RequestParam Long id){
        userRepository.deleteById(id);
        return "User has been deleted";
    }

    @PostMapping("/update")
    public @ResponseBody String UpdateUser(@RequestParam Long id,
                                           @RequestParam String name, @RequestParam String email){
        User userInDB = userRepository.findById(id).get();
        userInDB.setName(name);
        userInDB.setEmail(email);
        userRepository.save(userInDB);

        return "Succesfully updated";
    }
}
