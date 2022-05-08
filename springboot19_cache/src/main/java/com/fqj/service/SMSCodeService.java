package com.fqj.service;

import com.fqj.domain.SMSCode;

public interface SMSCodeService {
    public String SendSMSCodeToSMS(String tele);
    public boolean CheckCode(SMSCode smsCode);
}
