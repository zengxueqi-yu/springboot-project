package com.july.mybatis.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.july.mybatis.entity.Userinfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 服务类
 * @author zqk
 * @since 2019-12-17
 */
public interface UserinfoService extends IService<Userinfo> {

    /**
     * 分页查询
     * @param pager
     * @param userinfo
     * @return null
     * @author zqk
     * @since 2019/12/18
     */
    IPage<Userinfo> findUserInfos(Page<Userinfo> pager, Userinfo userinfo);

}
