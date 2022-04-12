package com.example.cleancode.main.chapter8.exAdapter.repository;

import com.example.cleancode.main.chapter8.exAdapter.entity.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);

}
