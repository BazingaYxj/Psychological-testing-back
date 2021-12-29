package com.ruoyi.score.service.impl;

import java.util.List;

import com.ruoyi.score.domain.TScoreInformation;
import com.ruoyi.score.mapper.TScoreInformationMapper;
import com.ruoyi.score.service.ITScoreInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 成绩信息管理Service业务层处理
 * 
 * @author yfj
 * @date 2021-12-28
 */
@Service
public class TScoreInformationServiceImpl implements ITScoreInformationService
{
    @Autowired
    private TScoreInformationMapper tScoreInformationMapper;

    /**
     * 查询成绩信息管理表
     * 
     * @param id 成绩信息表主键
     * @return 成绩信息
     */
    @Override
    public TScoreInformation selectTScoreInformationById(Long id)
    {
        return tScoreInformationMapper.selectTScoreInformationById(id);
    }

    /**
     * 查询成绩信息列表
     * 
     * @param tScoreInformation 成绩管理信息
     * @return 成绩信息集合
     */
    @Override
    public List<TScoreInformation> selectTScoreInformationList(TScoreInformation tScoreInformation)
    {
        return tScoreInformationMapper.selectTScoreInformationList(tScoreInformation);
    }

    /**
     * 新增
     * 
     * @param tScoreInformation
     * @return 结果
     */
    @Override
    public int insertTScoreInformation(TScoreInformation tScoreInformation)
    {
        return tScoreInformationMapper.insertTScoreInformation(tScoreInformation);
    }

    /**
     * 修改
     * 
     * @param tScoreInformation
     * @return 结果
     */
    @Override
    public int updateTScoreInformation(TScoreInformation tScoreInformation)
    {
        return tScoreInformationMapper.updateTScoreInformation(tScoreInformation);
    }

    /**
     * 批量删除
     * 
     * @param ids 需要删除的成绩信息主键
     * @return 结果
     */
    @Override
    public int deleteTScoreInformationByIds(Long[] ids)
    {
        return tScoreInformationMapper.deleteTScoreInformationByIds(ids);
    }

    /**
     * 删除信息
     * 
     * @param id 成绩信息主键
     * @return 结果
     */
    @Override
    public int deleteTScoreInformationById(Long id)
    {
        return tScoreInformationMapper.deleteTScoreInformationById(id);
    }
}
