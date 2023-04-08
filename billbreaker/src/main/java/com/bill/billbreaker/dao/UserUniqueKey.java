package com.bill.billbreaker.dao;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUniqueKey {
    private String emailId;
    private String mobileNum;
}
