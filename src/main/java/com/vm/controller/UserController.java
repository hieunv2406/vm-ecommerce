package com.vm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vm.dto.ResultDto;
import com.vm.dto.UserDto;
import com.vm.exceptions.UserNotFoundException;
import com.vm.services.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/info")
    public ResponseEntity<UserDto> getUserInfo() {
        UserDto userInfo = userService.getUserinfo();
        return new ResponseEntity<>(userInfo, HttpStatus.OK);
    }

    @PutMapping(path = "/edit")
    public ResponseEntity<ResultDto> editUser(@RequestBody UserDto userDto) throws UserNotFoundException {
        ResultDto resultDto = userService.editUser(userDto);
        return new ResponseEntity<>(resultDto, HttpStatus.OK);
    }
}
