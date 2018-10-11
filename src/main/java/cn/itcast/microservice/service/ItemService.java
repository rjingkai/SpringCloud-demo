package cn.itcast.microservice.service;

import cn.itcast.microservice.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemService {

    private static final Map<Long,Item> MAP = new HashMap<Long, Item>();

    static {
        MAP.put(1L,new Item(1L,"商品标题1","pic1","商品描述1",1000L));
        MAP.put(2L,new Item(2L,"商品标题2","pic2","商品描述2",1000L));
        MAP.put(3L,new Item(3L,"商品标题3","pic3","商品描述3",1000L));
        MAP.put(4L,new Item(4L,"商品标题1","pic4","商品描述4",1000L));
    }

    public Item queryItemById(Long id){
        return MAP.get(id);
    }

}
