package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.enetity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author wenbaoxie
 * @Date 2020/10/22
 */
public interface UserMapper extends BaseMapper<User> {
    int insertx(User user);
}
