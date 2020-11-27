package com.vilicode.service.impl;

import com.vilicode.bean.Ucoupon;
import com.vilicode.mapper.UcouponMapper;
import com.vilicode.service.UcouponService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Setter
@Service
@Qualifier("ucouponServiceImp")
public class UcouponServiceImp implements UcouponService {
    @Autowired
    UcouponMapper ucouponMapper;
    @Override
    public int addUcoupon(Map map) {
        return ucouponMapper.addUcoupon(map);
    }

    @Override
    public List<Ucoupon> selectAllUcoupon() {
        return ucouponMapper.selectAllUcoupon();
    }

    @Override
    public List<Ucoupon> selectOneUcouponByid(int uconid) {
        return ucouponMapper.selectOneUcouponByid(uconid);
    }

    @Override
    public int delectUcouponByid(int uconid) {
        return ucouponMapper.delectUcouponByid(uconid);
    }

    @Override
    public int updUcouponByid(Map map) {
        return ucouponMapper.updUcouponByid(map);
    }
}
