package com.july.mybatis.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.july.mybatis.entity.Userinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper接口
 * @author zqk
 * @since 2019-12-17
 */
public interface UserinfoMapper extends BaseMapper<Userinfo> {

    Userinfo getUserInfo(String id);

    /**
     * 分页查询
     * @param pager
     * @param userinfo
     * @return null
     * @author zqk
     * @since 2019/12/18
     */
    IPage<Userinfo> findUserInfos(Page<Userinfo> pager, @Param("param") Userinfo userinfo);

}
