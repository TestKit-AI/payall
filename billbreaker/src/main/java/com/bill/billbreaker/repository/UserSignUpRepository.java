package com.bill.billbreaker.repository;

import com.bill.billbreaker.dao.UserSignUpDB;
import com.bill.billbreaker.dao.UserUniqueKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSignUpRepository extends JpaRepository<UserSignUpDB, UserUniqueKey> {
}
