package com.example.cleancode.main.chapter8.exAdapter.service;

import com.example.cleancode.main.chapter8.exAdapter.entity.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}