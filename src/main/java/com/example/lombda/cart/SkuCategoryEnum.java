package com.example.lombda.cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SkuCategoryEnum {
    CLOTHING(10,"服装类"),
    SPORT(20,"体育类"),
    BOOK(30,"书");
    private Integer code;
    private String name;
}
