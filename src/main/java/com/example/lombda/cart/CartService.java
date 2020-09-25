package com.example.lombda.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CartService
 * @Description: TODO
 * @Author 有丶优秀的少年
 * @Date 2020/9/25
 * @Version V1.0
 **/
public class CartService {
    private static List<Sku> cartSkuList=new ArrayList<Sku>(){
        {
            add(new Sku(1,"无人机",
                    100.00,1,
                    100.00,SkuCategoryEnum.CLOTHING));
            add(new Sku(1,"无人机2",
                    100.00,1,
                    100.00,SkuCategoryEnum.CLOTHING));
            add(new Sku(1,"无人机3",
                    100.00,1,
                    100.00,SkuCategoryEnum.CLOTHING));
            add(new Sku(1,"无人机4",
                    100.00,1,
                    100.00,SkuCategoryEnum.CLOTHING));
            add(new Sku(1,"无人机5",
                    100.00,1,
                    100.00,SkuCategoryEnum.CLOTHING));
            add(new Sku(1,"无人机6",
                    100.00,1,
                    100.00,SkuCategoryEnum.CLOTHING));
        }
    };


}
