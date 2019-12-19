package com.july.mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.july.mybatis.entity.Userinfo;
import com.july.mybatis.mapper.UserinfoMapper;
import com.july.mybatis.service.UserinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务实现类
 * @author zqk
 * @since 2019-12-17
 */
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo>
        implements UserinfoService {

    /**
     * 查询某个用户
     * @param id
     * @return com.july.mybatis.entity.Userinfo
     * @author zqk
     * @since 2019/12/17
     */
    public Userinfo getUserInfo(String id){
        QueryWrapper<Userinfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(!StringUtils.isEmpty(id),"id",id);
        return this.getOne(queryWrapper);
    }

    @Resource
    private UserinfoMapper userinfoMapper;

    /**
     * 分页查询
     * @param pager
     * @param userinfo
     * @return null
     * @author zqk
     * @since 2019/12/18
     */
    @Override
    public IPage<Userinfo> findUserInfos(Page<Userinfo> pager, Userinfo userinfo) {
        return userinfoMapper.findUserInfos(pager,userinfo);
    }

}
