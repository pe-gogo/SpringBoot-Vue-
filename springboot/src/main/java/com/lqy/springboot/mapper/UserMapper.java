package com.lqy.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lqy.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

public interface UserMapper extends BaseMapper<User> {
}
