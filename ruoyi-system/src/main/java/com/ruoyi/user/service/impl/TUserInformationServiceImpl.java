package com.ruoyi.user.service.impl;

import java.util.List;

import com.ruoyi.user.domain.TUserInformation;
import com.ruoyi.user.mapper.TUserInformationMapper;
import com.ruoyi.user.service.ITUserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-27
 */
@Service
public class TUserInformationServiceImpl implements ITUserInformationService
{
    @Autowired
    private TUserInformationMapper tUserInformationMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TUserInformation selectTUserInformationById(Long id)
    {
        return tUserInformationMapper.selectTUserInformationById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tUserInformation 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TUserInformation> selectTUserInformationList(TUserInformation tUserInformation)
    {
        return tUserInformationMapper.selectTUserInformationList(tUserInformation);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tUserInformation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTUserInformation(TUserInformation tUserInformation)
    {
        return tUserInformationMapper.insertTUserInformation(tUserInformation);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tUserInformation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTUserInformation(TUserInformation tUserInformation)
    {
        return tUserInformationMapper.updateTUserInformation(tUserInformation);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTUserInformationByIds(Long[] ids)
    {
        return tUserInformationMapper.deleteTUserInformationByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTUserInformationById(Long id)
    {
        return tUserInformationMapper.deleteTUserInformationById(id);
    }
}
