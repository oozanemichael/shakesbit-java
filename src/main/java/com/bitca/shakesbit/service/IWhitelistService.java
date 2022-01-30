package com.bitca.shakesbit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bitca.shakesbit.bean.Whitelist;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-05-13
 */
public interface IWhitelistService extends IService<Whitelist> {

    boolean isWhite(String address);

}

