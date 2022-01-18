package com.ruoyi.frontlogin.service;

import com.ruoyi.frontlogin.domain.LoginFront;
import com.ruoyi.frontlogin.mapper.LoginFrontMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * TODO
 *
 * @author yfj
 * @date
 */
public interface LoginFrontService {
    /**
     *
     * @Author yfj
     * @Date 2022/1/7 9:51
     * @param loginFront
     * @return java.util.List<com.ruoyi.frontlogin.domain.LoginFront>
     **/
    public List<LoginFront> selectUserInformationList(LoginFront loginFront);
}
