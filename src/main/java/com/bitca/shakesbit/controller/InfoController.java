package com.bitca.shakesbit.controller;

import com.bitca.shakesbit.service.IWhitelistService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: jingbao
 * @Date: 2022/1/26
 * @Description:
 */
@RestController
@RequestMapping("/info")
@Api(tags = "shakesbit info")
public class InfoController {

    private static int stage=0;

    private static int tokenid=0;

    @Resource
    private IWhitelistService whitelistService;

    @GetMapping("/isWhite")
    @ApiOperation("该地址是否是白名单")
    public ResponseEntity<Boolean> isWhite(@RequestParam String address) {
        return ResponseEntity.ok(whitelistService.isWhite(address));
    }

    @GetMapping("/getTokenId")
    @ApiOperation("获取tokenid")
    public ResponseEntity<Integer> getTokenId() {
        int id=tokenid+1;
        tokenid=tokenid+1;
        return ResponseEntity.ok(id);
    }

    @PostMapping("/upTokenId")
    @ApiOperation("更改tokenid")
    public void upTokenId(@RequestParam int upTokenid) {
        tokenid=upTokenid-1;
    }

}