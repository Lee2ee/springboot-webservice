package com.jvision.admin.web;

import com.jvision.admin.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Spring boot Start!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello~!";
    }

    @GetMapping("/hello/test")
    public String test() {
        return "Test Pass!";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto hlloDto(@RequestParam("name") String name, @RequestParam("amount") int amount, @RequestParam("address") String address) {
        HelloResponseDto dto = new HelloResponseDto(name, amount, address);
        return dto;
    }
}
