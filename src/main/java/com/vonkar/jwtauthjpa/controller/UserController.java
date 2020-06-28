package com.vonkar.jwtauthjpa.controller;

import com.vonkar.jwtauthjpa.entity.UserDAO;
import com.vonkar.jwtauthjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getEmployees() {
        return "Welcome!";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(Principal principal) {
        return ResponseEntity.ok(userService.fetchByUsernameIgnoreCaseAndActive(principal.getName(), true));
    }
}
