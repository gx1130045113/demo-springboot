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

    //新增
    public static List<Sku> cartSkuList=new ArrayList<Sku>(){
        {
            add(new Sku(1,"无人机",
                    100.00,1,
                    100.00,SkuCategoryEnum.CLOTHING));
            add(new Sku(1,"无人机2",
                    100.00,1,
                    100.00,SkuCategoryEnum.CLOTHING));
            add(new Sku(1,"书",
                    100.00,1,
                    100.00,SkuCategoryEnum.BOOK));
            add(new Sku(1,"书2",
                    100.00,1,
                    100.00,SkuCategoryEnum.BOOK));
            add(new Sku(1,"体育",
                    100.00,1,
                    100.00,SkuCategoryEnum.SPORT));
            add(new Sku(1,"体育2",
                    100.00,1,
                    100.00,SkuCategoryEnum.SPORT));
        }
    };

    //查询
    public static List<Sku> getCartSkuList(){
        return cartSkuList;
    }

    //查询体育类
    public List<Sku> filterBookSku(List<Sku> cartSkuList){
        List<Sku> result=new ArrayList<Sku>();
        for (Sku sku:cartSkuList){
            if (SkuCategoryEnum.BOOK.equals(sku.getSkuCategory())){
                 result.add(sku);
            }
        }
        return result;
    }

}
