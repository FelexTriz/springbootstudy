package com.fqj.service.impl;

import com.fqj.service.MsgService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MsgServiceImpl implements MsgService {


    private HashMap<String,String> cache = new HashMap<>();
    @Override
    public String get(String tele) {
        String code = tele.substring(tele.length()-6);
        cache.put(tele, code);
        return code;
    }

    @Override
    public boolean check(String tele, String code) {
        String query = cache.get(tele);
        return query.equals(code);
    }
}
