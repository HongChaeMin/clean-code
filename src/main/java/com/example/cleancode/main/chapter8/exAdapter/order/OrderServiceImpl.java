package com.example.cleancode.main.chapter8.exAdapter.order;

import com.example.cleancode.main.chapter8.exAdapter.discount.DiscountPolicy;
import com.example.cleancode.main.chapter8.exAdapter.discount.RateDiscountPolicy;
import com.example.cleancode.main.chapter8.exAdapter.entity.Member;
import com.example.cleancode.main.chapter8.exAdapter.repository.MemberRepository;
import com.example.cleancode.main.chapter8.exAdapter.repository.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    /*public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }*/

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
