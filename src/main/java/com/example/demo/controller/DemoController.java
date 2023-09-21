package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.demo.service.DemoService;

@Controller
@RequiredArgsConstructor
public class DemoController {
    // 생성자 주입
//    private DemoService demoService;

    // DemoService 객체를 매개변수로 하는 생성자
//    @Autowired
//    public DemoController(DemoService demoService) {
//        this.demoService = demoService;
//    }

    // 생성자 주입 좀 더 편하게
//    private final DemoService demoService;
//    private final DemoService demoService1;
//    private final DemoService demoService2;

}
