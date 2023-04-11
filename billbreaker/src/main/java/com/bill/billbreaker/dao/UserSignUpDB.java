package com.bill.billbreaker.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_signup_db")
public class UserSignUpDB {

    @EmbeddedId
    private UserUniqueKey userUniqueKey;

    @Column(name="gender")
    private char gender;

    @Column(name="occupation")
    private String occupation;

    @Column(name="city")
    private String city;

    @Column(name="age")
    private Integer age;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="CREATED_DATE", updatable = false)
    private LocalDateTime createdDate;

    @Column(name="UPDATED_DATE", insertable = false)
    private LocalDateTime updatedDate;

}
