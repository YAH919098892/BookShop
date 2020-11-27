package com.vilicode.service;

import com.vilicode.bean.Ucoupon;

import java.util.List;
import java.util.Map;

public interface UcouponService {
    public int addUcoupon(Map map);
    public List<Ucoupon> selectAllUcoupon();
    public List<Ucoupon> selectOneUcouponByid(int uid);
    public int delectUcouponByid(int uconid);
    public int updUcouponByid(Map map);
}
