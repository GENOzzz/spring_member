package com.member.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class memberDto {
    private String id;
    private String pw;
    private String age;
    private String addr;
    private String phone;
    private String name;

    public memberDto(String name,String pw,String age,String addr,String phone, String id) {
        this.name = name;
        this.addr=addr;
        this.age=age;
        this.id=id;
        this.pw=pw;
        this.phone=phone;
    }

    @Override
    public String toString(){
        return "memberDto{\n"+
                "name="+name+"\n"+
                "age="+age+"\n"+
                "id="+id+"\n"+
                "}";
    }
}
