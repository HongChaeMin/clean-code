package com.example.cleancode.main.chapter8.exAdapter.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
