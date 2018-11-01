package com.rose.demo.service.dozer.permission;

import com.rose.demo.service.dozer.BasDozer;
import com.rose.demo.common.po.permission.User;
import com.rose.demo.common.vo.permission.UserVo;
import org.springframework.stereotype.Component;

/**
 * Created by BG331163 on 2018/11/1.
 * Version 1.0.1
 */
@Component
public class DozerUser extends BasDozer{

    public UserVo convert2Vo(User user) {

        UserVo vo = convert(user, UserVo.class);
        //do other thing
        return vo;
    }

    public User convert2Po(UserVo userVo) {

        User user = convert(userVo, User.class);
        //do other thing
        return user;
    }

}
