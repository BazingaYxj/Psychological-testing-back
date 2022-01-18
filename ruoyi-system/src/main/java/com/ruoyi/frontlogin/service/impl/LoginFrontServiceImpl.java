package com.ruoyi.frontlogin.service.impl;

import com.ruoyi.frontlogin.domain.LoginFront;
import com.ruoyi.frontlogin.mapper.LoginFrontMapper;
import com.ruoyi.frontlogin.service.LoginFrontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author yfj
 * @date
 */
@Service
public class LoginFrontServiceImpl implements LoginFrontService {
    @Autowired
    LoginFrontMapper loginFrontMapper;
    /**
     *
     * @Author yfj
     * @Date 2022/1/7 9:54
     * @param loginFront
     * @return java.util.List<com.ruoyi.frontlogin.domain.LoginFront>
     **/
    @Override
    public List<LoginFront> selectUserInformationList(LoginFront loginFront) {
        return loginFrontMapper.selectUserInformationList(loginFront);
    }
}
