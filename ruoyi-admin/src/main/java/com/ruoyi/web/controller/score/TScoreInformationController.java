package com.ruoyi.web.controller.score;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.score.domain.TScoreInformation;
import com.ruoyi.score.domain.TestPopularity;
import com.ruoyi.score.service.ITScoreInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 成绩信息表Controller
 * 
 * @author yfj
 * @date 2021-12-28
 */
@RestController
@RequestMapping("/score/information")
public class TScoreInformationController extends BaseController
{
    @Autowired
    private ITScoreInformationService tScoreInformationService;

    /**
     * 查询成绩信息列表
     *
     * @Author yfj
     * @Date 2021/12/28 9:43
     * @param tScoreInformation
     * @return com.ruoyi.common.core.page.TableDataInfo
     **/
    @PreAuthorize("@ss.hasPermi('score:information:list')")
    @GetMapping("/list")
    public TableDataInfo list(TScoreInformation tScoreInformation)
    {
        startPage();
        List<TScoreInformation> list = tScoreInformationService.selectTScoreInformationList(tScoreInformation);
        return getDataTable(list);
    }

    /**
     * 获取成绩列表详细信息
     *
     * @Author yfj
     * @Date 2021/12/28 9:43
     * @param id
     * @return com.ruoyi.common.core.domain.AjaxResult
     **/
    @PreAuthorize("@ss.hasPermi('score:information:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tScoreInformationService.selectTScoreInformationById(id));
    }

    /**
     * 新增
     *
     * @Author yfj
     * @Date 2021/12/28 9:42
     * @param tScoreInformation
     * @return com.ruoyi.common.core.domain.AjaxResult
     **/
    @PreAuthorize("@ss.hasPermi('score:information:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TScoreInformation tScoreInformation)
    {
        return toAjax(tScoreInformationService.insertTScoreInformation(tScoreInformation));
    }

    /**
     * 修改
     *
     * @Author yfj
     * @Date 2021/12/28 9:42
     * @param tScoreInformation
     * @return com.ruoyi.common.core.domain.AjaxResult
     **/
    @PreAuthorize("@ss.hasPermi('score:information:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TScoreInformation tScoreInformation)
    {
        return toAjax(tScoreInformationService.updateTScoreInformation(tScoreInformation));
    }

    /**
     * 删除
     *
     * @Author yfj
     * @Date 2021/12/28 9:42
     * @param ids
     * @return com.ruoyi.common.core.domain.AjaxResult
     **/
    @PreAuthorize("@ss.hasPermi('score:information:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tScoreInformationService.deleteTScoreInformationByIds(ids));
    }

    /**
     *
     * @Author yfj
     * @Date 2022/1/17 11:30
     * @param testPopularity
     * @return com.ruoyi.common.core.domain.AjaxResult
     **/
    @GetMapping("/chartone")
    public AjaxResult chartfordatalist(TestPopularity testPopularity){
        return AjaxResult.success(tScoreInformationService.chartfordata(testPopularity));
    }
}
