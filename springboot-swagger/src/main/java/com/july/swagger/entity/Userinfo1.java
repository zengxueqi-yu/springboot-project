package com.july.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户实体类
 * @author zqk
 * @since 2019-12-17
 */
@Data
@ApiModel(value = "用户信息1",description = "测试用户信息1")
public class Userinfo1 {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id")
    private Long id;

    @ApiModelProperty("用户名称")
    private String username;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("用户密码盐值")
    private String pwdsalt;

    @ApiModelProperty("用户手机号")
    private String mobile;

}
