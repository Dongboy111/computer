package com.dong.computer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dong.computer.entity.Goods;
import com.sun.org.glassfish.gmbal.ManagedObject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
}
