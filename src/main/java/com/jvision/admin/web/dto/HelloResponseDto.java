package com.jvision.admin.web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor // (final 멤버변수를 매개변수로 가진) 생성자 자동 생성
public class HelloResponseDto {
    private final String name;
    private final int amount;
    private final String address;
}
