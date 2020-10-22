package com;

import com.enetity.User;
import com.mapper.UserMapper;
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
}
