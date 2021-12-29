import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listInformation(query) {
  return request({
    url: '/system/scoreinformation/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getInformation(id) {
  return request({
    url: '/system/scoreinformation/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addInformation(data) {
  return request({
    url: '/system/scoreinformation',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateInformation(data) {
  return request({
    url: '/system/scoreinformation',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delInformation(id) {
  return request({
    url: '/system/scoreinformation/' + id,
    method: 'delete'
  })
}