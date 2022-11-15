package com.dong.computer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dong.computer.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
