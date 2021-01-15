package com.tahanebti.restcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tahanebti.restcrud.dto.UserLocationDto;
import com.tahanebti.restcrud.services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/map")
    @ResponseBody
    public List<UserLocationDto> getAllUsersLocation() {
        List <UserLocationDto> usersLocation = userService.getAllUsersLocation();
        return usersLocation;
    }
}
