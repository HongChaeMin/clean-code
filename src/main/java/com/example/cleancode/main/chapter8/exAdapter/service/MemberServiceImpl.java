package com.example.cleancode.main.chapter8.exAdapter.service;

import com.example.cleancode.main.chapter8.exAdapter.entity.Member;
import com.example.cleancode.main.chapter8.exAdapter.repository.MemberRepository;
import com.example.cleancode.main.chapter8.exAdapter.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /*public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }*/

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
