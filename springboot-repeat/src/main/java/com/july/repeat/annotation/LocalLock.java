package com.july.repeat.annotation;

import java.lang.annotation.*;

/**
 * 防止重复提交锁
 * @author zqk
 * @since 2019/12/26
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LocalLock {

    /**
     * key
     * @author zqk
     * @return
     */
    String key() default "";

}
