package com.bitca.shakesbit.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("sys_metadata")
@AllArgsConstructor
@NoArgsConstructor
public class Metadata {

    @TableId(value = "id",type = IdType.AUTO)
    Long id;

    String description;

    String external_url;

    String animation_url;

    String image;

    String name;

}
