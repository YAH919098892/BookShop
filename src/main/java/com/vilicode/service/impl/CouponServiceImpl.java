package com.vilicode.service.impl;

import com.vilicode.bean.Coupon;
import com.vilicode.mapper.CouponMapper;
import com.vilicode.service.CouponService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Setter
public class CouponServiceImpl implements CouponService {
    @Autowired
    CouponMapper couponMapper;
    @Override
    public List<Coupon> selectAllCoupon() {
        return couponMapper.selectAllCoupon();
    }

    @Override
    public Coupon selectCouponById(int couid) {
        return couponMapper.selectCouponById(couid);
    }

    @Override
    public int delectCouponById(int couid) {
        return couponMapper.delectCouponById(couid);
    }

    @Override
    public int addCoupon(Map map) {
        return couponMapper.addCoupon(map);
    }

    @Override
    public int updCoupon(Map map) {
        return couponMapper.updCoupon(map);
    }
}
