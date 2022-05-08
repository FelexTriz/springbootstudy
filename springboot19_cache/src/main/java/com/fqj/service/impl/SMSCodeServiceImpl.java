package com.fqj.service.impl;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import com.fqj.controller.utils.CodeUtils;
import com.fqj.domain.SMSCode;
import com.fqj.service.SMSCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {
    @Autowired
    private CodeUtils codeUtils;

//    @CreateCache(area = "sms",name = "jetCache",expire = 3600)
    @CreateCache(area = "default",name = "jetCache",expire = 3600,cacheType = CacheType.LOCAL)
    private Cache<String ,String > jetcache;

    @Override
//    @CachePut(value = "smsCode",key = "#tele")
    public String SendSMSCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        jetcache.put(tele,code);
        return code;
    }

    @Override
    public boolean CheckCode(SMSCode smsCode) {
        String code = smsCode.getCode();
        String CacheCode = jetcache.get(smsCode.getTele());
//        String CacheCode = codeUtils.get(smsCode.getTele());
        return code.equals(CacheCode);
    }
}
