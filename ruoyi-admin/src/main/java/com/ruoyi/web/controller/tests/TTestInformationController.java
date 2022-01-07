package com.ruoyi.web.controller.tests;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;

import com.ruoyi.tests.domain.TTestInformation;
import com.ruoyi.tests.domain.TestUrls;
import com.ruoyi.tests.service.ITTestInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 试题表Controller
 * 
 * @author yfj
 * @date 2021-12-27
 */
@RestController
@RequestMapping("/system/testsinformation")
public class TTestInformationController extends BaseController
{
    @Autowired
    private ITTestInformationService tTestInformationService;

    /**
     * 查询测试题列表
     *
     * @Author yfj
     * @Date 2021/12/28 8:31
     * @param tTestInformation
     * @return com.ruoyi.common.core.page.TableDataInfo
     **/
    @PreAuthorize("@ss.hasPermi('system:testsinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(TTestInformation tTestInformation)
    {
        startPage();
        List<TTestInformation> list = tTestInformationService.selectTTestInformationList(tTestInformation);
        return getDataTable(list);
    }

    /**
     * 获取试题详细信息
     *
     * @Author yfj
     * @Date 2021/12/28 8:30
     * @param id
     * @return com.ruoyi.common.core.domain.AjaxResult
     **/
    @PreAuthorize("@ss.hasPermi('system:testsinformation:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tTestInformationService.selectTTestInformationById(id));
    }

    /**
     *获取试题页面地址接口
     *
     * @Author yfj
     * @Date 2022/1/6 10:30
     * @param testUrls
     * @return com.ruoyi.common.core.domain.AjaxResult
     **/
    @PreAuthorize("@ss.hasPermi('system:testsinformation:geturl')")
    @GetMapping("/geturl")
    public AjaxResult getUrls(TestUrls testUrls)
    {
        return AjaxResult.success(tTestInformationService.selectPictureUrl(testUrls));
    }

    /**
     * 新增
     *
     * @Author yfj
     * @Date 2021/12/28 8:32
     * @param tTestInformation
     * @return com.ruoyi.common.core.domain.AjaxResult
     **/
    @PreAuthorize("@ss.hasPermi('system:testsinformation:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TTestInformation tTestInformation)
    {
        return toAjax(tTestInformationService.insertTTestInformation(tTestInformation));
    }

    /**
     * 修改
     *
     * @Author yfj
     * @Date 2021/12/28 8:26
     * @param tTestInformation
     * @return com.ruoyi.common.core.domain.AjaxResult
     **/
    @PreAuthorize("@ss.hasPermi('system:testsinformation:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TTestInformation tTestInformation)
    {
        return toAjax(tTestInformationService.updateTTestInformation(tTestInformation));
    }

    /**
     * 删除
     *
     * @Author yfj
     * @Date 2021/12/27 16:58
     * @param ids
     * @return com.ruoyi.common.core.domain.AjaxResult
     **/
    @PreAuthorize("@ss.hasPermi('system:testsinformation:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tTestInformationService.deleteTTestInformationByIds(ids));
    }
}
