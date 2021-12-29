package com.ruoyi.user.service;

import com.ruoyi.user.domain.TUserInformation;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author yfj
 * @date 2021-12-27
 */
public interface ITUserInformationService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public TUserInformation selectTUserInformationById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tUserInformation 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TUserInformation> selectTUserInformationList(TUserInformation tUserInformation);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tUserInformation 【请填写功能名称】
     * @return 结果
     */
    public int insertTUserInformation(TUserInformation tUserInformation);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tUserInformation 【请填写功能名称】
     * @return 结果
     */
    public int updateTUserInformation(TUserInformation tUserInformation);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteTUserInformationByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTUserInformationById(Long id);
}
