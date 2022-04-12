package com.example.cleancode.main.chapter8.exAdapter;

import com.example.cleancode.main.chapter8.exAdapter.discount.DiscountPolicy;
import com.example.cleancode.main.chapter8.exAdapter.discount.RateDiscountPolicy;
import com.example.cleancode.main.chapter8.exAdapter.order.OrderService;
import com.example.cleancode.main.chapter8.exAdapter.order.OrderServiceImpl;
import com.example.cleancode.main.chapter8.exAdapter.repository.MemberRepository;
import com.example.cleancode.main.chapter8.exAdapter.repository.MemoryMemberRepository;
import com.example.cleancode.main.chapter8.exAdapter.service.MemberService;
import com.example.cleancode.main.chapter8.exAdapter.service.MemberServiceImpl;

public class AppConfig {

    /*public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }*/

}
