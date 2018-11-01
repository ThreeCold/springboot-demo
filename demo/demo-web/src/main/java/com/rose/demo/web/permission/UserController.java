package com.rose.demo.web.permission;

import com.rose.demo.common.bas.PackVo;
import com.rose.demo.common.vo.permission.UserVo;
import com.rose.demo.service.permission.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BG331163 on 2018/11/1.
 * Version 1.0.1
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/get")
    public PackVo<UserVo> getUserById(@RequestParam Long id) {
        PackVo<UserVo> packVo = new PackVo<>();
        packVo.setRow(userService.getUserById(id));
        return packVo;
    }


}
