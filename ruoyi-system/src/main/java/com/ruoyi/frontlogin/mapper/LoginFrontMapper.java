package com.ruoyi.frontlogin.mapper;

import com.ruoyi.frontlogin.domain.LoginFront;
import com.ruoyi.user.domain.TUserInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * TODO
 *
 * @author yfj
 * @date 2022/1/7
 */
public interface LoginFrontMapper {
    /**
     *
     * @Author yfj
     * @Date 2022/1/7 9:51
     * @param loginFront
     * @return java.util.List<com.ruoyi.frontlogin.domain.LoginFront>
     **/
    public List<LoginFront> selectUserInformationList(LoginFront loginFront);
}
