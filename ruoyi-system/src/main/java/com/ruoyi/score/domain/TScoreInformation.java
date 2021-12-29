package com.ruoyi.score.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 成绩信息管理对象 t_score_information
 * 
 * @author yfj
 * @date 2021-12-28
 */
@Data
public class TScoreInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 成绩信息id */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 试题id */
    @Excel(name = "试题id")
    private Long testId;

    /** 成绩 */
    @Excel(name = "成绩")
    private String score;

    /** 创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 试题名称*/
    private String testName;

    /** 用户名*/
    private String username;

    /** 性别*/
    private String sex;

    /** 年龄*/
    private Integer age;


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("testId", getTestId())
            .append("score", getScore())
            .toString();
    }
}
