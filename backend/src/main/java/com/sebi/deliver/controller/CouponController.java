package com.sebi.deliver.controller;

import com.sebi.deliver.model.Coupon;
import com.sebi.deliver.model.Message;
import com.sebi.deliver.service.CouponService;
import com.sebi.deliver.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/coupons")
public class CouponController {

    private final CouponService couponService;

    @Autowired
    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    @GetMapping
    public List<Coupon> getAllCoupons() {
        return couponService.getAllCoupons();
    }

    @GetMapping("/user/{id}")
    public List<Coupon> getUserCoupons(@PathVariable Long id) {
        return couponService.getUserCoupons(id);
    }

    @GetMapping("{id}")
    public Coupon getCoupon(@PathVariable Long id) {
        return couponService.getCoupon(id);
    }

    @PostMapping("{id}")
    public Coupon addCoupon(@PathVariable Long id, @RequestBody Coupon coupon) {
        return couponService.addCoupon(id, coupon);
    }

    @DeleteMapping("{id}")
    public void deleteCoupon(@PathVariable Long id) {
        couponService.deleteCoupon(id);
    }

    @PutMapping("/{id}")
    public Coupon updateCoupon(@PathVariable Long id, @RequestBody Coupon coupon) {
        return couponService.updateCoupon(id, coupon);
    }
}
