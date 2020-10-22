package com;

import com.enetity.User;
import com.mapper.UserMapper;
import java.util.List;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author wenbaoxie
 * @Date 2020/10/22
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.mapper"})
public class App implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
    @Autowired
    private UserMapper userMapper;
    @Override public void run(String... args) throws Exception {

            List<User> users = userMapper.selectList(null);
            System.out.println(users);

    }
}
