package com.july.mybatis.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.july.mybatis.config.PageParamVo;
import com.july.mybatis.config.PageVo;
import com.july.mybatis.config.Result;
import com.july.mybatis.config.ResultWrapper;
import com.july.mybatis.entity.Userinfo;
import com.july.mybatis.service.UserinfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 前端控制器
 * @author zqk
 */
@RestController
@RequestMapping("/userinfo")
public class UserinfoController {

    @Resource
    private UserinfoService userinfoService;

    /**
     * 增加
     * @param userinfo
     * @return java.lang.String
     * @author zqk
     * @since 2019/12/17
     */
    @PostMapping("/saveUserInfo")
    public String saveUserInfo(@RequestBody Userinfo userinfo){
        userinfoService.save(userinfo);
        return "保存成功";
    }

    /**
     * 删除
     * @param id
     * @return java.lang.String
     * @author zqk
     * @since 2019/12/17
     */
    @GetMapping("/delUserInfo")
    public String deleteUserInfo(String id){
        userinfoService.removeById(id);
        return "删除成功";
    }

    @PostMapping("/updateUserInfo")
    public String updateUserInfo(@RequestBody Userinfo userinfo){
        Userinfo userinfo1 = userinfoService.getById(userinfo.getId());
        if(userinfo1 != null){
            userinfo1.setUsername(userinfo.getUsername());
            userinfoService.updateById(userinfo1);
            return "修改成功";
        }
        return "该用户不存在";
    }

    /**
     * 查询
     * @param id
     * @return java.lang.String
     * @author zqk
     * @since 2019/12/17
     */
    @GetMapping("/getUserInfo")
    public String getUserInfo(String id){
        Userinfo userinfo = userinfoService.getById(id);
        return userinfo.getUsername();
    }

    /**
     * 分页查询
     * @param pageParamVo
     * @return com.july.mybatis.config.Result
     * @author zqk
     * @since 2019/12/18
     */
    @PostMapping("/findUserInfos")
    public Result findUserInfos(@RequestBody PageParamVo<Userinfo> pageParamVo) {
        PageVo<Userinfo> page = pageParamVo.getPager();
        IPage<Userinfo> evalRecordVos = userinfoService.findUserInfos(new Page<>(page.getCurrent(), page.getSize()), pageParamVo.getContent());
        return ResultWrapper.pageResultOk(evalRecordVos);
    }

}
