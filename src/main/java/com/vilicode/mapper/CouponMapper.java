package com.vilicode.mapper;

import com.vilicode.bean.Coupon;

import java.util.List;
import java.util.Map;

public interface CouponMapper {
    public List<Coupon> selectAllCoupon();
    public Coupon selectCouponById(int couid);
    public int delectCouponById(int couid);
    public int addCoupon(Map map);
    public int updCoupon(Map map);
}
