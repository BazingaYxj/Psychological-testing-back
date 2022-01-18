package com.ruoyi.frontlogin.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * TODO
 *
 * @author yfj
 * @date
 */
@Data
public class LoginFront extends BaseEntity {

    private String username;

    private String password;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("username", getUsername())
                .append("password", getPassword())
                .toString();
    }
}