package com.example.cleancode.main.chapter8.exAdapter.discount;


import com.example.cleancode.main.chapter8.exAdapter.entity.Grade;
import com.example.cleancode.main.chapter8.exAdapter.entity.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private final int DISCOUNT_FIX_AMOUNT = 1000;

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? DISCOUNT_FIX_AMOUNT : 0;
    }
}
