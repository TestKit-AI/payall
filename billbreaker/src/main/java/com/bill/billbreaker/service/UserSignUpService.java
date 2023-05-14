package com.bill.billbreaker.service;

import com.bill.billbreaker.dao.UserSignUpDB;
import com.bill.billbreaker.dao.UserUniqueKey;

import java.util.Optional;

public interface UserSignUpService {
    public  String UserSigning(UserSignUpDB userSignUpDB);

    public Optional<UserSignUpDB> getUserDetails(UserUniqueKey userUniqueKey);
    public String deleteUserById(UserUniqueKey userUniqueKey);
}