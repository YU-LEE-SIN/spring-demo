package com.service;

import com.dao.DeptDao;
import com.dao.UserInfoDao;


public class UserInfoServiceImpl {
    private DeptDao deptDao;
    private UserInfoDao userInfoDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setUserInfoDao(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }

    public void deleteWholeById( int id){
        userInfoDao.deleteUserById(id);
        deptDao.deleteDeptById(id);
    }
}
