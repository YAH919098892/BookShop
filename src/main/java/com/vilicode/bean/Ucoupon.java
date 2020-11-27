package com.vilicode.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ucoupon {
    private int ucouid;
    private User user;
    private Coupon coupon;
}
