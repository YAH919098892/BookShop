package com.vilicode.test;

import com.vilicode.bean.Ucoupon;
import com.vilicode.service.CouponService;
import com.vilicode.service.UcouponService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mytest {
    @Test
    public void an(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
       CouponService couponService= (CouponService) applicationContext.getBean("couponServiceImpl");
        Map<String, Integer> map= new HashMap<String, Integer>();
        map.put("coutype",2);
        map.put("coumoney",5);
        map.put("count",5);
        System.out.println(couponService.addCoupon(map));
    }

    @Test
    public void an2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UcouponService ucouponService= (UcouponService) applicationContext.getBean("ucouponServiceImp");
        List<Ucoupon> ucoupons = ucouponService.selectAllUcoupon();
        for (Ucoupon ucoupon : ucoupons) {
            System.out.println(ucoupon.toString());
        }
    }
    @Test
    public void an22(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UcouponService ucouponService= (UcouponService) applicationContext.getBean("ucouponServiceImp");
        Map map=new HashMap();
        map.put("uid",26);
        map.put("couid",2);
        int i = ucouponService.addUcoupon(map);
        System.out.println(i);
    }
}
