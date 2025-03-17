package edu.icet.ecom.controller;

import edu.icet.ecom.dto.User;
import edu.icet.ecom.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    final UserServiceImpl service;

    @PostMapping("/create")
    public void createUser(@RequestBody User user){
        service.createUser(user);


    }

}
