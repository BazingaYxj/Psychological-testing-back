package com.ruoyi.tests.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 【请填写功能名称】对象 t_test_information
 * 
 * @author yfj
 * @date 2021-12-27
 */
@Data
public class TTestInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 试题id */
    private Long id;

    /** 测试题名称 */
    @Excel(name = "测试题名称")
    private String testName;

    /** 测试题页面地址 */
    @Excel(name = "测试题页面地址")
    private String testUrl;

    /** 创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 图片地址*/
    private String testPictureUrl;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("testName", getTestName())
            .append("testUrl", getTestUrl())
            .append("createTime", getCreateTime())
            .toString();
    }
}
