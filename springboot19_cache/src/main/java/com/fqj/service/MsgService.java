package com.fqj.service;

public interface MsgService {
    public String get(String tele);
    public boolean check(String tele, String code);
}
