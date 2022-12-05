package com.learn.StockAPI.User;


import com.learn.StockAPI.Stock.Stock;
import com.learn.StockAPI.Transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


//    // INIT
//    @RequestMapping(method = RequestMethod.GET, value = "/user/init")
//    public void init(){
//        Set <Stock> stockSet = new HashSet<>();
//        Set < Transaction> transactionSet = new HashSet<>();
//        User temp = new User(100, 999, stockSet, transactionSet);
//        userService.addUser(temp);
//    }

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
