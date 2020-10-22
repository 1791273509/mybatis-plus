package com.enetity;

import java.util.Date;
import lombok.Data;

/**
 * @Author wenbaoxie
 * @Date 2020/10/22
 */
@Data
public class User {
    private Long id;
    String name;
    Long age;
    String email;
    String managerId;
    Date createTime;
}
