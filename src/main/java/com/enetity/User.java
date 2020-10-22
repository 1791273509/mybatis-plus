package com.enetity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.util.Date;
import lombok.Data;

/**
 * @Author wenbaoxie
 * @Date 2020/10/22
 */
@Data
public class User {
    @TableId
    private Long id;
    String name;
    Long age;
    String email;
    String managerId;
    Date createTime;
}
