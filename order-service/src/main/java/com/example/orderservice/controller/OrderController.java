package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
    @GetMapping("/add")
    public String add(){
        return "库存增加了";
    }
    @GetMapping("/reduce")
    public String reduce(){
        return "库存减少了";
    }
}
