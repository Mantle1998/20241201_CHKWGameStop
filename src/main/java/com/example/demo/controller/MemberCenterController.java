package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberCenterController {

	// 顯示個人會員中心頁面 (http://localhost:8080/memberCenter)
    @GetMapping("/memberCenter")
    public String showmemberCenter() {
        return "memberCenter/memberCenter";
    }
    
    // 顯示個人資料頁面 (http://localhost:8080/memberCenter/profile)
    @GetMapping("/memberCenter/profile")
    public String showmemberProfile() {
        return "memberCenter/memberProfile";
    }
    
    // 顯示購買清單頁面 (http://localhost:8080/memberCenter/purchase)
    @GetMapping("/memberCenter/purchase")
    public String showmemberPurchase() {
        return "memberCenter/memberPurchase";
    }
    
    // 顯示訂單通知頁面 (http://localhost:8080/memberCenter/order)
    @GetMapping("/memberCenter/order")
    public String showmemberOrder() {
        return "memberCenter/memberOrder";
    }
    
   

}
