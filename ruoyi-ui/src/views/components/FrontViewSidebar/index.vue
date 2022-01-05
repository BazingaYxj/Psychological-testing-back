<template>
  <!--<div class="">-->
  <el-form class="sidebar" ref="form" :model="form">
    <el-row style="margin-left: 0px; width: 100%;">

    <el-col class="leftside">
      <el-table v-loading="loading" :data="testsList"
                style="margin-left: 0px; width: 100%; background-color: #F6F6F6; font-size: 13px"
                :row-style="{height:'35px'}"
                :cell-style="{padding:'0px'}">
        <el-table-column align="center" prop="testName" node-key="id"/>
        <el-table-column align="center" class-name="small-padding fixed-width" style=" width: 10px; background-color: #F6F6F6; ">
          <template slot-scope="scope">
            <el-button
              size="mini"
              type="text"
              icon="el-icon-edit"
              @click="handleUpdate(scope.row)"
              v-hasPermi="['system:alarm:edit']"
            >开始测试</el-button>
          </template>
        </el-table-column>
      </el-table>
    </el-col>

    <el-col class="mainside">
     <div class="banner">
          <div class="item">
            <img :src="dataList[currentIndex]">
          </div>
          <div class="page" v-if="this.dataList.length > 1">
            <ul>
              <li><a :href="testUrls[currentIndex]">人格测试集合>>click here</a></li>
              <li @click="gotoPage(prevIndex)">&lt;</li>
              <li v-for="(item,index) in dataList" @click="gotoPage(index)" :class="{'current':currentIndex == index}">  {{index+1}}</li>
              <li @click="gotoPage(nextIndex)">&gt;</li>
            </ul>
          </div>
     </div>

       <div class="banner">
        边缘性人格测试
       </div>

      <!--<div class="pp"><a href="index.vue"><img src="@/assets/logo/one.jpg" style="height: 200px; width: 200px; left: 800px"/>边缘性人格测试</a></div>
      <div class="pp"><a href="index.vue"><img src="@/assets/logo/one.jpg" style="height: 200px; width: 200px; left: 800px"/>边缘性人格测试</a></div>
      <div class="pp"><a href="index.vue"><img src="@/assets/logo/one.jpg" style="height: 200px; width: 200px; left: 800px"/>边缘性人格测试</a></div>-->

      </el-col>
      </el-row>
  </el-form>
</template>

<script>
  import { listInformation } from "@/api/tests/testsinformation";
 /* import { one, two, three}*/
  export default {
      name: "index",
      data() {
          return{
              loading: true,
              testsList: [],
              form:{},
              shopInfos: [],

              testUrls:["https://apesk.com/hbdi/", "https://apesk.com/holland/index.html", "https://apesk.com/mbti/lover/"],
              dataList:["http://localhost:8086/wx/storage/fetch/wagufxcpvhn9i9x22fv8.jpg", "http://localhost:8086/wx/storage/fetch/9aulzakswmjbi6srcg16.jpg", "http://localhost:8086/wx/storage/fetch/a9eep9d8eynrvo292fgw.jpg" ],
              currentIndex: 0,   //默认显示图片
              timer: null    //定时器
          }
      },
      created() {
          this.getList();
      },
      methods: {
          /** 查询【请填写功能名称】列表 */
          getList() {
              this.loading = true;
              listInformation(this.queryParams).then(response => {
                  console.log(JSON.stringify(response))
                  this.testsList = response.rows;
                  this.total = response.total;
                  this.loading = false;
                  this.testNames = response.rows.testName;
              });
          },
          /** 修改按钮操作 */
          handleUpdate(row) {
              this.reset();
              const id = row.id || this.ids
              getAlarm(id).then(response => {
                  this.form = response.data;
                  this.open = true;
                  this.title = "修改报警管理";
              });
          },

          gotoPage(index) {
              this.currentIndex = index;
          },

      },
      computed: {
          //上一张
          prevIndex() {
              if(this.currentIndex == 0) {
                  return this.dataList.length - 1;
              }else{
                  return this.currentIndex - 1;
              }
          },
          //下一张
          nextIndex() {
              if(this.currentIndex == this.dataList.length - 1) {
                  return 0;
              }else {
                  return this.currentIndex + 1;
              }
          }
      }

  }
</script>

<style scoped>
  .leftside{
    width: 23%;
    top: 0px;
    left: 0px;
    bottom: 0px;
    overflow-y: auto;
    background-color: #fefffd;
    border-top: none;
    border-right: 1000px solid #b5b6b4;
    border-right-width: 2px;
  }
  .mainside{
    width: 77%;
    top: 0px;
    left: 0px;
    bottom: 0px;
    overflow-y: auto;
    background-color: #fefffd;
    border-top: none;
    border-right: 2px solid #b5b6b4;
  }
  * {
    margin: 0;
    padding: 0;
  }
  ul li {
    list-style: none;
    float: left;
    width: 30px;
    height: 40px;
    line-height: 40px;
    text-align: center;
    cursor: pointer;
    color: rgba(255,255,255,.8);
    font-size: 10px;
  }
  .banner {
    max-width: 600px;
    margin: 0 auto;
    position: relative;
    margin-top: 20px;
    margin-left: 20px;
    display: inline-block;
  }
  .banner img {
    width: 50%;
    display: block;
  }
  .banner .page {
    background: rgba(0,0,0,.5);
    position: absolute;

    left: 0;
    bottom: 0px;
    width: 50%;
  }
  .banner .page ul {
    float: right;
  }
  .current {
    color: #80817f;
  }

  .pp{
    display: inline-block;
  }
</style>
