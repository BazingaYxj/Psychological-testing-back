package com.ruoyi.score.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * TODO
 *
 * @author
 * @date
 */
@Data
public class TestPopularity extends BaseEntity {
    /** 试题名称*/
    private String testName;

    /** 试题被答次数*/
    private Integer num;

    /** 成绩 */
    @Excel(name = "成绩")
    private String score;

    /** 性别*/
    private String sex;

    /** 年龄*/
    private Integer age;

    /** 试题id */
    @Excel(name = "试题id")
    private Long testId;
}
