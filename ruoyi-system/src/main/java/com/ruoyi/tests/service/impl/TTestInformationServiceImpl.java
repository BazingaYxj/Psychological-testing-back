package com.ruoyi.tests.service.impl;

import java.util.List;

import com.ruoyi.tests.domain.TTestInformation;
import com.ruoyi.tests.domain.TestUrls;
import com.ruoyi.tests.mapper.TTestInformationMapper;
import com.ruoyi.tests.service.ITTestInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yfj
 * @date 2021-12-27
 */
@Service
public class TTestInformationServiceImpl implements ITTestInformationService
{
    @Autowired
    private TTestInformationMapper tTestInformationMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TTestInformation selectTTestInformationById(Long id)
    {
        return tTestInformationMapper.selectTTestInformationById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tTestInformation 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TTestInformation> selectTTestInformationList(TTestInformation tTestInformation)
    {
        return tTestInformationMapper.selectTTestInformationList(tTestInformation);
    }

    @Override
    public List<TestUrls> selectPictureUrl(TestUrls testUrls) {
        return tTestInformationMapper.selectPictureUrl(testUrls);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tTestInformation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTTestInformation(TTestInformation tTestInformation)
    {
        return tTestInformationMapper.insertTTestInformation(tTestInformation);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tTestInformation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTTestInformation(TTestInformation tTestInformation)
    {
        return tTestInformationMapper.updateTTestInformation(tTestInformation);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTTestInformationByIds(Long[] ids)
    {
        return tTestInformationMapper.deleteTTestInformationByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTTestInformationById(Long id)
    {
        return tTestInformationMapper.deleteTTestInformationById(id);
    }
}
