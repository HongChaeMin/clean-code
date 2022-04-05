package com.example.cleancode.main.chapter5;

import java.lang.reflect.Member;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.util.StringUtils.hasText;

public class Newspaper {

    /*private final JPAQueryFactory queryFactory;

    public List<MemberPageDTO> retrievePage(MemberSearchCondition condition) {
        List<Member> result = searchPage(condition);
        return result.stream().map(MemberPageDTO::of).distinct().collect(Collectors.toList());
    }

    private List<Member> searchPage(MemberSearchCondition condition) {
        return queryFactory
                .select(member)
                .from(member)
                .leftJoin(member.team, team)
                .where(
                        userNameEq(condition.getUserName()),
                        teamNameEq(condition.getTeamName()),
                        ageGoe(condition.getAgeGoe()),
                        ageLoe(condition.getAgeLoe())
                );
    }

    private BooleanExpression userNameEq(String userName) {
        return hasText(userName) ? member.userName.eq(userName) : null;
    }

    private BooleanExpression teamNameEq(String teamName) {
        return hasText(teamName) ? team.name.eq(teamName) : null;
    }

    private BooleanExpression ageGoe(Integer ageGoe) {
        return ageGoe != null ? member.age.goe(ageGoe) : null;
    }

    private BooleanExpression ageLoe(Integer ageLoe) {
        return ageLoe != null ? member.age.loe(ageLoe) : null;
    }*/


}
