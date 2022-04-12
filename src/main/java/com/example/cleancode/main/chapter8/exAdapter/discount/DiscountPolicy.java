package com.example.cleancode.main.chapter8.exAdapter.discount;

import com.example.cleancode.main.chapter8.exAdapter.entity.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
