package com.vilicode.controller;

import com.vilicode.bean.Coupon;
import com.vilicode.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//优惠券管理
@Controller
public class CouponController {
    @Autowired
    CouponService couponService;
//    显示
    @RequestMapping("/admin/showCou")
    public String showCou( HttpServletRequest request){
        List<Coupon> coupons = couponService.selectAllCoupon();
        request.setAttribute("allcoupone",coupons);
        return "admin/type_coupon";
    }
    //    显示
    @RequestMapping("/showCou2")
    public String showCou2( HttpServletRequest request){
        List<Coupon> coupons = couponService.selectAllCoupon();
        request.setAttribute("allcoupone",coupons);
        System.out.println(coupons.size());
        return "showcoupon";
    }
//    添加
    @RequestMapping("/admin/addCou")
    public String addCou(Coupon coupon,HttpServletRequest request){
        List<Coupon> coupons = couponService.selectAllCoupon();
        request.setAttribute("allcoupone",coupons);
        int coutype=coupon.getCoutype();
        int coumoney=coupon.getCoumoney();
        int count=coupon.getCount();
        Map<String, Integer> map=new HashMap<String, Integer>();
        map.put("coutype",coutype);
        map.put("coumoney",coumoney);
        map.put("count",count);
        couponService.addCoupon(map);
        System.out.println(coupons.toString());
        return "redirect:showCou.action";
    }
//    删除
    @RequestMapping("/admin/delectCou")
    public String delectCou(int couid){
        couponService.delectCouponById(couid);
        return "redirect:showCou.action";
    }
    //    查一个param
    @RequestMapping("/admin/selectCouponById")
    public String selectCouponById(int couid,HttpServletRequest request){
        Coupon coupon=couponService.selectCouponById(couid);
        request.setAttribute("onecoupon",coupon);
        return "admin/upd_coupon";
    }
//    修改
    @RequestMapping("/admin/updCoupon")
    public String updCoupon(Coupon coupon,HttpServletRequest request){
        int couid =coupon.getCouid();
        int coutype=coupon.getCoutype();
        int coumoney=coupon.getCoumoney();
        int count=coupon.getCount();
        Map<String, Integer> map=new HashMap<String, Integer>();
        map.put("couid",couid);
        map.put("coutype",coutype);
        map.put("coumoney",coumoney);
        map.put("count",count);
       couponService.updCoupon(map);
       return "redirect:showCou.action";
    }
}
