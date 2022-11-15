package com.dong.computer.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dong.computer.entity.Goods;
import com.dong.computer.mapper.GoodsMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class GoodsService extends ServiceImpl<GoodsMapper, Goods> {



}
