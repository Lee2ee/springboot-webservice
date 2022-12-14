package com.jvision.admin.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void Lombok_기능_테스트() {
        String name = "test";
        int amount = 1000;
        String address = "vision";

        // Lombok으로 자동 생성한 생성자 메소드 테스트 --> 객체 생성 여부
        HelloResponseDto dto = new HelloResponseDto(name, amount, address);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        assertThat(dto.getAddress()).isEqualTo(address);
    }
}
