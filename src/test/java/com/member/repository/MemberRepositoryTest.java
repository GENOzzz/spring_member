package com.member.repository;

import com.member.constant.MemberLevelStatus;
import com.member.entity.Member;

import org.apache.tomcat.jni.Local;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations ="classpath:application-test.properties")
class MemberRepositoryTest{

    @Autowired//bean 객체 생성
    MemberRepository memberRepository;

    @Test
    @DisplayName("멤버 저장 테스트")
    public void createMemberTest(){
        Member member=new Member();
        member.setId("dsa01282");
        member.setName("박현호");
        member.setAge(29);
        member.setAddr("대구 남구 큰골4길 15-8");
        member.setPhoneNum("01029257018");
        member.setMemberLevelStatus(MemberLevelStatus.ADMIN);
        member.setRegTime(LocalDateTime.now());
        Member saveMember = memberRepository.save(member);
        System.out.println(saveMember.toString());
    }
}