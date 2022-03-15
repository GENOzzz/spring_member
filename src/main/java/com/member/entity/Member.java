package com.member.entity;

import com.member.constant.MemberLevelStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

import javax.persistence.*;


@Entity
@Table(name="member")
@Getter
@Setter
@ToString
public class Member {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long memberKey;//회원 키

    @Column(name="member_id",nullable=false,length = 16)
    private String id;//회원 id

    @Column(nullable = false)
    private String name;//회원 이름

    @Column(nullable = false)
    private Integer age;//회원 나이

    @Column(length = 11)
    private String phoneNum;//회원 전화번호

    @Column(nullable=true)
    private String addr;//회원 주소

    @Enumerated(EnumType.STRING)
    private MemberLevelStatus memberLevelStatus;//회원등급

    private LocalDateTime regTime;//가입한 날짜
}
