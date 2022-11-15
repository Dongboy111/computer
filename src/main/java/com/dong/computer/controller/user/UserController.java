package com.dong.computer.controller.user;

import com.dong.computer.entity.User;
import com.dong.computer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService ;

    @RequestMapping(value = "/query/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") int id ){

        User u =  userService.getById(id) ;
//        userService.getById(id)
//        User a = new User() ;
//        a.setId(id);
        return u;

    }

}
