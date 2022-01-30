package com.bitca.shakesbit.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sys_whitelist")
public class Whitelist {
    @TableId
    private Long id;
    private String address;
}
