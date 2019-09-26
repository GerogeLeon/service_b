package com.practice.multimodule.service_b;

import java.math.BigDecimal;

public class BidDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.05 + 0.01);
        BigDecimal b1 = new BigDecimal("0.05");//注意构造BigDecimal类时候必须用String类型才能得到精确的值
        BigDecimal b2 = new BigDecimal("0.01");
        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);
    }
}