package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author huyuanjia
 * @date 2019/4/2 16:55
 */
@RestController
@Api(value = "测试相关接口", description = "测试相关接口")
@RequestMapping("/api/test")
public class TestController {
    @Resource
    private HttpServletRequest request;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private UserMapper userMapper;


    @ApiOperation(value = "测试")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object  test(Integer id) {
        System.out.println("start check");
       return userMapper.selectOne(id);

    }



}
