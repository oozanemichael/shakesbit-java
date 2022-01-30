package com.bitca.shakesbit.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bitca.shakesbit.bean.Whitelist;
import com.bitca.shakesbit.mapper.WhitelistMapper;
import com.bitca.shakesbit.service.IWhitelistService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-05-13
 */
@Service
public class WhitelistServiceImpl extends ServiceImpl<WhitelistMapper, Whitelist> implements IWhitelistService {

    @Resource
    private WhitelistMapper whitelistMapper;

    @Override
    public boolean isWhite(String address) {
        QueryWrapper<Whitelist> queryWrapper = new QueryWrapper<Whitelist>();
        queryWrapper.eq("address",address);
        List<Whitelist> lis=whitelistMapper.selectList(queryWrapper);
        return lis.size()>0;
    }
}

