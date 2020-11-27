package com.vilicode.controller;


import com.vilicode.bean.Ucoupon;
import com.vilicode.bean.User;
import com.vilicode.service.CouponService;
import com.vilicode.service.UcouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//获取优惠券
@Controller
public class GetCouponController {
    @Autowired
    CouponService couponService;
    @Autowired
    UcouponService ucouponService;
    @RequestMapping("/getAllUcoupon")
    public List<Ucoupon> selectAllUcoupon(){
        List<Ucoupon> ucoupons = ucouponService.selectAllUcoupon();
        return ucoupons;
    }
//    领取优惠券
    @RequestMapping("/getCoupon")
    public String getCoupon(HttpSession httpSession,int couid,int count){
        User user = (User) httpSession.getAttribute("user");
            count=count-1;
            Map map=new HashMap();
            Map map2=new HashMap();
            map.put("uid",user.getUid());
            map.put("couid",couid);
            map2.put("couid",couid);
            map2.put("count",count);
      ucouponService.addUcoupon(map);
       couponService.updCoupon(map2);
        return "redirect:index.action";
        }
//        显示用户的优惠券
    @RequestMapping("/selectOneUcouponByid")
    public String selectOneUcouponByid(HttpSession httpSession, HttpServletRequest request){
        User user = (User) httpSession.getAttribute("user");
        Integer uid = user.getUid();
        List<Ucoupon> ucoupons = ucouponService.selectOneUcouponByid(uid);
        request.setAttribute("ucoupons",ucoupons);
        return "user_center";
    }

}
