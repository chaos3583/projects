package com.chaos.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liaopeng
 * @title: Offer50
 * @projectName myProjects
 * @description: 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母
 * @date 2020/12/93:31 下午
 */
public class Offer50 {
    public static char firstUniqChar(String s){
        char[] chars = s.toCharArray();
        char res=' ';
        Map<Character,Boolean> dic = new HashMap<>();
        for(int i=0;i<chars.length;i++){
            dic.put(chars[i],dic.containsKey(chars[i]));
        }
        for (char c : chars){
            if (!dic.get(c)) {
                res=c;
                break ;
            }
        }
        return res;
    }

    public static void main(String[] args){
        char res = firstUniqChar("abbaccaddeefef");
        System.out.println(res);
    }
}
