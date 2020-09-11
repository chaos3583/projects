package com.chaos.demo2020;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.*;

/**
 * @program: demo
 * * @description:
 * * @author: liaopeng
 * * @create: 2020-08-11 16:13
 **/
public class WXBizMsgCrypt {

    /**
     * 检验数据的真实性，并且获取解密后的明文.
     * @param encryptedData string 加密的用户数据
     * @param iv            string 与用户数据一同返回的初始向量
     * @param sessionKey            string session_key秘钥
     * @param appid            string appid
     * @return String 返回解密后的用户信息
     */
    public static String decryptData(String encryptedData, String iv, String sessionKey, String appid) {
        if (StringUtils.length(sessionKey) != 24) {
            return "非法密钥";
        }

        // 对称解密秘钥 aeskey = Base64_Decode(session_key), aeskey 是16字节。
        byte[] aesKey = Base64.decodeBase64(sessionKey);

        if (StringUtils.length(iv) != 24) {
            return "非法初始向量";
        }
        // 对称解密算法初始向量 为Base64_Decode(iv)，其中iv由数据接口返回。
        byte[] aesIV = Base64.decodeBase64(iv);

        // 对称解密的目标密文为 Base64_Decode(encryptedData)
        byte[] aesCipher = Base64.decodeBase64(encryptedData);

        try {
            byte[] resultByte = decrypt(aesCipher, aesKey, aesIV);
            if (null != resultByte && resultByte.length > 0) {
                String userInfo = new String(resultByte, "UTF-8");
                JSONObject jsons = JSON.parseObject(userInfo);
                String id = jsons.getJSONObject("watermark").getString("appid");
                if (!StringUtils.equals(id, appid)) {
                    return "非法密文";
                }
                return userInfo;
            } else {
                return "数据不正确";
            }
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] decrypt(byte[] content, byte[] keyByte, byte[] ivByte)
            throws InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            Key sKeySpec = new SecretKeySpec(keyByte, "AES");
            //生成iv
            AlgorithmParameters params = AlgorithmParameters.getInstance("AES");
            params.init(new IvParameterSpec(ivByte));
            cipher.init(Cipher.DECRYPT_MODE, sKeySpec, params);// 初始化
            return cipher.doFinal(content);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
