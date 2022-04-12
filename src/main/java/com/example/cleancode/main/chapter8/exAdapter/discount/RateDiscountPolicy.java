package com.example.cleancode.main.chapter8.exAdapter.discount;

import com.example.cleancode.main.chapter8.exAdapter.entity.Grade;
import com.example.cleancode.main.chapter8.exAdapter.entity.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? price * discountPercent / 100 : 0;
    }
}
