package com.bitca.shakesbit.controller;

import com.bitca.shakesbit.bean.Metadata;
import com.bitca.shakesbit.service.IMetadataService;
import com.bitca.shakesbit.service.IWhitelistService;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/metadata")
@Api(tags = "metadata json")
public class MetadataController {

    @Resource
    private IMetadataService metadataService;

    //增
    @PostMapping("/insert")
    @ApiOperation("新增")
    public void insertMetadata(Metadata metadata) {
        metadataService.save(metadata);
    }

    //增
    @PostMapping("/insertBatch")
    @ApiOperation("新增")
    public void insertMetadata(Metadata metadata,int quality) {
        List<Metadata> list=new ArrayList();
        for (int i=0;i<quality;i++){
            list.add(metadata);
        }
        metadataService.saveBatch(list);
    }


    //查
    @ApiOperation("获取")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String selectMetadata(@PathVariable("id") String id) {
        Metadata metadata=metadataService.getById(id);
        Gson gson=new Gson();
        return gson.toJson(metadata);
    }

}
