package com.ruoyi.score.mapper;

import com.ruoyi.score.domain.TScoreInformation;

import java.util.List;
/**
 * 成绩信息管理Mapper接口
 * 
 * @author yfj
 * @date 2021-12-28
 */
public interface TScoreInformationMapper 
{
    /**
     * 查询成绩信息管理表
     * 
     * @param id 成绩信息管理表主键
     * @return 成绩信息管理信息
     */
    public TScoreInformation selectTScoreInformationById(Long id);

    /**
     * 查询成绩信息管理列表
     * 
     * @param tScoreInformation 成绩信息管理
     * @return 成绩信息管理集合
     */
    public List<TScoreInformation> selectTScoreInformationList(TScoreInformation tScoreInformation);

    /**
     * 新增
     * 
     * @param tScoreInformation
     * @return 结果
     */
    public int insertTScoreInformation(TScoreInformation tScoreInformation);

    /**
     * 修改
     * 
     * @param tScoreInformation
     * @return 结果
     */
    public int updateTScoreInformation(TScoreInformation tScoreInformation);

    /**
     * 删除
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteTScoreInformationById(Long id);

    /**
     * 批量删除
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTScoreInformationByIds(Long[] ids);
}
