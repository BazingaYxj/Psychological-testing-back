import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listInformation(query) {
  return request({
    url: '/system/testsinformation/list',
    method: 'get',
    params: query
  })
}
//获取测试页面地址
export function getTestUrls(data) {
  return request({
    url: '/system/testsinformation/geturl',
    method: 'get',
  })
}
// 查询【请填写功能名称】详细
export function getInformation(id) {
  return request({
    url: '/system/testsinformation/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addInformation(data) {
  return request({
    url: '/system/testsinformation',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateInformation(data) {
  return request({
    url: '/system/testsinformation',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delInformation(id) {
  return request({
    url: '/system/testsinformation/' + id,
    method: 'delete'
  })
}
