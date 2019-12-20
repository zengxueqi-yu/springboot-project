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
@ApiModel(value = "用户信息",description = "测试用户信息")
public class Userinfo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id",required = true)
    private Long id;

    @ApiModelProperty(value = "用户名称",required = true)
    private String username;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("用户密码盐值")
    private String pwdsalt;

    @ApiModelProperty("用户手机号")
    private String mobile;

}
