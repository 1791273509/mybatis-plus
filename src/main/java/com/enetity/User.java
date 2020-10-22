package com.enetity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author wenbaoxie
 * @Date 2020/10/22
 */
@Data
@TableName(value = "user")
public class User {
    @TableId
    private Long id;
    @TableField("name")
    String name;
    Long age;
    String email;
    String managerId;
    Date createTime;

//    三种方式不映射到数据库
//    1.transient，但是不可以序列化了
    transient String remark;
//    2.静态变量
     static String remark1;
//     3.注解
    @TableField(exist = false)
    private String remark3;

}
