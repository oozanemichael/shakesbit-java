package com.bitca.shakesbit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bitca.shakesbit.bean.Metadata;
import com.bitca.shakesbit.mapper.MetadataMapper;
import com.bitca.shakesbit.service.IMetadataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MetadataServiceImpl extends ServiceImpl<MetadataMapper, Metadata> implements IMetadataService {

    @Resource
    private MetadataMapper metadataMapper;

}
