package com.ruoyi.tests.service;

import com.ruoyi.tests.domain.TTestInformation;
import com.ruoyi.tests.domain.TestUrls;

import java.util.List;


/**
 * 【请填写功能名称】Service接口
 * 
 * @author yfj
 * @date 2021-12-27
 */
public interface ITTestInformationService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public TTestInformation selectTTestInformationById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tTestInformation 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TTestInformation> selectTTestInformationList(TTestInformation tTestInformation);

    /**
     *
     * @Author yfj
     * @Date 2022/1/5 11:16
     * @param testUrls
     * @return java.util.List<com.ruoyi.tests.domain.TTestInformation>
     **/
    public List<TestUrls> selectPictureUrl(TestUrls testUrls);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tTestInformation 【请填写功能名称】
     * @return 结果
     */
    public int insertTTestInformation(TTestInformation tTestInformation);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tTestInformation 【请填写功能名称】
     * @return 结果
     */
    public int updateTTestInformation(TTestInformation tTestInformation);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteTTestInformationByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTTestInformationById(Long id);
}
