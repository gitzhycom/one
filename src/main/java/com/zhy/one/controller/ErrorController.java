package com.zhy.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 错误页控制器
 */
@Controller
@RequestMapping("/error")
public class ErrorController {
    // 401页面
    @GetMapping(value = "/401")
    public String error_401() {
        return "error/error_401";
    }

    // 404页面
    @GetMapping(value = "/404")
    public String error_404() {
        return "error/error_404";
    }

    // 500页面
    @GetMapping(value = "/500")
    public String error_500() {
        return "error/error_500";
    }
}
