package com.learn.StockAPI.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    // GET
    @RequestMapping(method = RequestMethod.GET, value = "/user/")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @RequestMapping(method = RequestMethod.GET, value = "/user/{user_id}")
    public User getUser(@PathVariable int user_id){
        return userService.getUser(user_id);
    }

    // POST
    @RequestMapping(method = RequestMethod.POST, value = "/user/")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    // DELETE
    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{user_id}")
    public void deleteUser(@PathVariable int user_id){
        userService.deleteUser(user_id);
    }

    // PUT
    @RequestMapping(method = RequestMethod.PUT, value = "/user/{user_id}")
    public void updateUser(@PathVariable int user_id, @RequestBody User user){
        userService.updateUser(user,user_id);
    }
}
