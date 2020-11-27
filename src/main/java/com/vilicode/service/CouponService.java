package com.vilicode.service;

import com.vilicode.bean.Coupon;

import java.util.List;
import java.util.Map;

public interface CouponService {
    public List<Coupon> selectAllCoupon();
    public Coupon selectCouponById(int couid);
    public int delectCouponById(int couid);
    public int addCoupon(Map map);
    public int updCoupon(Map map);
}
