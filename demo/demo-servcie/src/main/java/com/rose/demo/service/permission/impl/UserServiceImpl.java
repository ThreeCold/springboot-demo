package com.rose.demo.service.permission.impl;

import com.rose.demo.common.po.permission.User;
import com.rose.demo.common.vo.permission.UserVo;
import com.rose.demo.dao.permission.UserDao;
import com.rose.demo.service.dozer.permission.DozerUser;
import com.rose.demo.service.permission.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by BG331163 on 2018/11/1.
 * Version 1.0.1
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private DozerUser dozerUser;

    @Override
    public UserVo getUserById(Long id) {
        User user = userDao.getUserById(id);
        return dozerUser.convert2Vo(user);
    }
}
