package com.example.lombda.cart;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName Sku
 * @Description: TODO
 * @Author 有丶优秀的少年
 * @Date 2020/9/25
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
public class Sku {
    //编号
    private Integer skuId;
    //商品名称
    private  String  skuName;
    //单价
    private Double  skuPrice;
    //购买个数
    private Integer totalNum;
    //总价
    private Double totalPrice;
    //商品类型
    private Enum skuCategory;

}
