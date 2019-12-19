package com.july.mybatis.config;

import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author zqk
 * @since 2019/07/22
 */
public class ResultWrapper {

    public static Result pageResultOk(IPage<?> page) {
        return Result.ok(page.getRecords(), new PageVo<>(page.getCurrent(), page.getSize(), page.getTotal()));
    }

}
