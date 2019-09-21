package com.example.demo.mapper;

import com.example.demo.cache.RedisCache;
import com.example.demo.entities.User;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author: swg
 * @created: 2018/8/11
 */
@Mapper
@CacheNamespace(implementation= RedisCache.class,eviction=RedisCache.class)
public interface UserMapper {

    User selectOne(Integer id);

    void insertOne(User user);

}
