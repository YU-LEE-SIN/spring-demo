package com.service.impl;

import com.entity.UserInfo;
import com.service.UserInfoService;
import config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserInfoServiceImplTest {

    @Autowired
    UserInfoService service;
    @Test
    public void pageListAll() {
        List<UserInfo> result = service.pageListAll(1, 3);
        for (UserInfo One : result) {
            System.out.println("-----debug: One = " + One);
        }
    }
}