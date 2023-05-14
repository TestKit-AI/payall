package com.bill.billbreaker.controller;

import com.bill.billbreaker.dao.UserSignUpDB;
import com.bill.billbreaker.service.UserSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserSignupController {

    @Autowired
    private UserSignUpService userSignUpService;

    @PostMapping("/signup")
    public ResponseEntity<String> signupUser(@RequestBody UserSignUpDB userSignUpDB){
        String result =  userSignUpService.UserSigning(userSignUpDB);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
