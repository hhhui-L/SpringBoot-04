package com.example.webadmin.service.impl;

import com.example.webadmin.bean.Account;
import com.example.webadmin.mapper.AccountMapper;
import com.example.webadmin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getByid(Long id){
        return  accountMapper.getAcct(id);

    }
}
