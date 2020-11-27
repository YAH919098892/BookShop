package com.vilicode.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coupon {
    private  int couid;
    private int coutype;
    private int uid;
    private int coumoney;
    private int count;


}
