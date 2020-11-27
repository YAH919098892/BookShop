package com.vilicode.mapper;

import com.vilicode.bean.Ucoupon;

import java.util.List;
import java.util.Map;

public interface UcouponMapper {
    public int addUcoupon(Map map);
    public List<Ucoupon> selectAllUcoupon();
    public List<Ucoupon> selectOneUcouponByid(int uconid);
    public int delectUcouponByid(int uconid);
    public int updUcouponByid(Map map);
}
