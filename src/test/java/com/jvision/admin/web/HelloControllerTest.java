package com.jvision.admin.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class) // 테스트 코드 실행 방법(확장 클래스를 사용 시)
@WebMvcTest(controllers = HelloController.class) // 컨트롤러만 테스트 할 경우

public class HelloControllerTest {

    @Autowired // 스프링이 관리하는 Bean 주입받을 때
    private MockMvc mvc;

    @Test
    public void hello_리턴() throws Exception {
        String hello = "Hello~!";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void test_리턴() throws Exception {
        String data = "Test Pass!";

        mvc.perform(get("/hello/test"))
                .andExpect(status().isOk())
                .andExpect(content().string(data));
    }

    @Test
    public void helloDto_리턴() throws Exception {
        String name = "test";
        int amount = 1000;
        String address = "vision";

        mvc.perform(get("/hello/dto").param("name", name)
                        .param("amount", String.valueOf(amount)).param("address", address))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)))
                .andExpect(jsonPath("$.address", is(address)));

        // JSON(JavaScript Object Notation) : 데이터 전송용 포맷
    }
}