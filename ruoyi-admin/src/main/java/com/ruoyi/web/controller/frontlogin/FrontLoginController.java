package com.ruoyi.web.controller.frontlogin;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.model.LoginBody;
import com.ruoyi.frontlogin.domain.LoginFront;
import com.ruoyi.frontlogin.service.LoginFrontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * TODO
 *
 * @author yfj
 * @date
 */
@RestController
@RequestMapping("/front")
public class FrontLoginController extends BaseController {
    @Autowired
    LoginFrontService login;
    /**
     * 登录方法
     *
     * @param loginFront 登录信息
     * @return 结果
     */
    @GetMapping("/login")
    public List<LoginFront> login(LoginFront loginFront)
    {
        return login.selectUserInformationList(loginFront);
    }
}
