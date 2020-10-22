package com;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.enetity.User;
import com.mapper.UserMapper;
import java.sql.Wrapper;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author wenbaoxie
 * @Date 2020/10/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStart {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void get(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);

    }
    @Test
    public void getById(){
        User user = userMapper.selectById(1088250446457389056L);

        userMapper.update(null,
                Wrappers.<User>lambdaUpdate().set(User::getEmail,"1212121L").eq(User::getId,1088250446457389056L));
        userMapper.update(
                null,
                Wrappers.<User>lambdaUpdate().set(User::getEmail, "123@123").eq(User::getId, 2)
        );
        System.out.println(getById(1088250446457389056L));
//        查询为空的
        System.out.println(getById(1088254464573890156L));
        userMapper.delete(new QueryWrapper<User>()
                .lambda().eq(User::getName, "smile"));
        userMapper.insert(new User());
    }
    public User getById(Long id){
        return userMapper.selectById(id);
    }
}
