package com.example.cleancode.main.chapter8.adapter;

import com.example.cleancode.main.chapter8.exAdapter.AppConfig;
import com.example.cleancode.main.chapter8.exAdapter.entity.Grade;
import com.example.cleancode.main.chapter8.exAdapter.entity.Member;
import com.example.cleancode.main.chapter8.exAdapter.order.Order;
import com.example.cleancode.main.chapter8.exAdapter.order.OrderService;
import com.example.cleancode.main.chapter8.exAdapter.order.OrderServiceImpl;
import com.example.cleancode.main.chapter8.exAdapter.service.MemberService;
import com.example.cleancode.main.chapter8.exAdapter.service.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    /*MemberService memberService;
    OrderService orderService;*/
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    /*@BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }*/

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}
