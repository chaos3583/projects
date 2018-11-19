package com.chaos.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @program: demo
 * @description: web类
 * @author: 廖鹏
 * @create: 2018-11-19
 **/
@RestController
public class WebController {

    @Autowired
    public RedisTemplate redisTemplate;

    /**
     * 校验登录
     * @param userId
     * @param age
     * @return
     */
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public Object first(String userId,Integer age) {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@方法执行中ing..................");
        Long count = redisTemplate.opsForList().size(userId);
        Long total = count+1;
        if(count<5){
            redisTemplate.opsForList().rightPush(userId,new Date());
        }else{
            Object obj = redisTemplate.opsForList().index(userId, 0);
            Date date = null;
            if(obj!=null){
                date =  (Date)obj;
            }
            Date nowDate = new Date();
            long l = (nowDate.getTime() - date.getTime())/1000;//秒数
            System.out.println("时间差为："+l);
            if(l<3600){
                return "1小时内登录超过5次，当前为第"+total+"次登录";
            }else{
                redisTemplate.opsForList().leftPop(userId);
                redisTemplate.opsForList().rightPush(userId,new Date());
            }
        }
        return "第"+total+"次登录";
    }

    @RequestMapping("/doError")
    public Object error() {
        return 1 / 0;
    }

    /**
     * 清空当前list
     * @param userId
     */
    @RequestMapping(value="/clear",method = RequestMethod.GET)
    public void clear(String userId) {
        redisTemplate.delete(userId);
    }

    /**
     * 打印当前list中的值
     * @param userId
     * @return
     */
    @RequestMapping(value="/printAll",method = RequestMethod.GET)
    public Object printAll(String userId) {
        StringBuilder sb = new StringBuilder();
        List range = redisTemplate.opsForList().range(userId, 0, -1);
        for (Object o : range) {
                sb.append(o).append(",");
        }
        return sb.toString();
    }

}
