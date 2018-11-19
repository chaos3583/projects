package com.chaos.demo.demo1119;


import freemarker.template.utility.DateUtil;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: demo
 * @description: 用redis实现用户1小时内访问不能超过5次
 * @author: 廖鹏
 * @create: 2018-11-19
 **/
@RestController
public class RedisDemo01 {

    @Autowired
    public static RedisTemplate redisTemplate;

    @RequestMapping("/login")
    public void login(String userId){
        userId= "chaos";
        Long count = redisTemplate.opsForList().size(userId);
        if(count<5){
            redisTemplate.opsForList().rightPush(userId,new Date());
        }else{
            Object obj = redisTemplate.opsForList().index(userId, 0);
            Date date = null;
            if(obj!=null){
               date =  (Date)obj;
            }
            Date nowDate = new Date();
            long l = nowDate.getTime() - date.getTime();
            System.out.println("时间差为："+l);
        }
    }
}
