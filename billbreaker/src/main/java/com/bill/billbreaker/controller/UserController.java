package com.bill.billbreaker.controller;
import com.bill.billbreaker.dao.UserSignUpDB;
import com.bill.billbreaker.dao.UserUniqueKey;
import com.bill.billbreaker.service.UserSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserSignUpService userSignUpService;

    @GetMapping(value = "/user/details/")
    public Optional<UserSignUpDB> userDetails(@RequestBody UserUniqueKey userUniqueKey) {
        Optional<UserSignUpDB> user = userSignUpService.getUserDetails(userUniqueKey);
        return user;
    }

    @DeleteMapping(value = "/delete/user")
    public String deleteUser(@RequestBody UserUniqueKey userUniqueKey) {
        return userSignUpService.deleteUserById(userUniqueKey);

    }

//    @PutMapping("/update/user/details")
//    public String updateUserDetails() {
//
//    }

}
