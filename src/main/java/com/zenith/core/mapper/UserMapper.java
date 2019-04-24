package com.zenith.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zenith.core.pojo.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> findAll();
}
