package com.july.mybatis.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 用户实体类
 * @author zqk
 * @since 2019-12-17
 */
@Data
@Accessors(chain = true)
public class Userinfo{

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("pwdsalt")
    private String pwdsalt;

    @TableField("mobile")
    private String mobile;

}
