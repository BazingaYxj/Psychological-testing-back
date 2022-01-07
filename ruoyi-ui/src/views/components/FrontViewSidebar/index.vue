<template>
  <!--<div class="">-->

    <el-row style="margin-left: 0px; width: 100%;">

    <el-col class="mainside">
     <div class="banner">
          <div class="item">
            <img :src="dataList[currentIndex]">
          </div>
          <div class="page" v-if="this.dataList.length > 1">
            <ul>
              <li style="width: 130px"><a :href="testUrls[currentIndex]">>>> 人格测试 </a></li>
              <li @click="gotoPage(prevIndex)">&lt;</li>
              <li v-for="(item,index) in dataList" @click="gotoPage(index)" :class="{'current':currentIndex == index}">{{index+1}}</li>
              <li @click="gotoPage(nextIndex)">&gt;</li>
            </ul>
          </div>
     </div>

       <div class="banner">
         <img src="@/assets/logo/two.jpg" style="height: 100px; width: 100px; left: 800px"/>
         <a href="">啥子叫边缘性人格障碍？</a>
         <span class="text">
           <br> 边缘性的人格障碍以极不稳定的情绪、行为、人际关系和自我形象为特点。女性多于男性。
         情绪不稳定，可以表现为上一刻好争论而下一刻变得抑郁，强烈的愤怒爆发导致暴力或者行为暴躁。
         其次，人际关系也不稳定，强烈的时好时坏，要么与人关系极好，要么极坏，几乎没有持久的朋友。害怕被抛弃，不能忍受孤独而疯狂的寻找伴侣，无论自己是否满意，这可能会导致连续的情绪危机，并可能伴有一连串的自杀威胁或者是自伤行为。
         患者还缺乏持久的自我认同感，自尊心不足，常有持续的空虚感，挫折的耐受性低。患者事先进行计划的能力差，行为不计后果容易冲动。
         </span>
         <br>
         <span class="warn">>>>> </span>
         <a href="https://www.apesk.com/xinliceshi/start_m/?1500.html"> 边缘性人格障碍测试</a>
         <span class="warn"> >>>></span>
       </div>

      <div class="line"/>
      <div class="ff" style="color: #ffffff">医学心理测试与评估</div>
      <div class="ff">医学心理测试与评估</div>
      <div class="ff" style="color: #ffffff">医学心理测试与评估</div>
      <div class="pp">
          <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
          <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
          <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
          <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
      </div>
      <div class="pp"/>
      <div class="pp">
        <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
        <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
        <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
        <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
      </div>
      <div class="pp"/>
      <div class="pp">
        <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
        <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
        <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
        <div class="ll"><a href="index.vue">边缘性人格测试</a></div><br>
      </div>
      </el-col>

      <el-col class="leftside">
        <div class="gg">
          <el-table v-loading="loading" :data="testsList"
                    style="margin-left: 0px; width: 100%; background-color: #F6F6F6; font-size: 13px"
                    :row-style="{height:'35px'}"
                    :cell-style="{padding:'0px'}">
            <el-table-column prop="testName" node-key="id">
              <template slot-scope="scope">
                <span class="one">enter</span><span class="two">  >></span>
                <a :href="scope.row.testUrl">{{scope.row.testName}}</a>
              </template>
            </el-table-column>
          </el-table>
        </div>
      </el-col>
      </el-row>

</template>

<script>
  import { listInformation, getTestUrls } from "@/api/tests/testsinformation";
 /* import { one, two, three}*/
  export default {
      name: "index",
      data() {
          return{
              loading: true,
              testsList: [],
              form:{},
              shopInfos: [],

              tests:[],
              testUrls:["https://apesk.com/hbdi/", "https://apesk.com/holland/index.html", "https://apesk.com/mbti/lover/"],
              dataList:["http://localhost:8086/wx/storage/fetch/wagufxcpvhn9i9x22fv8.jpg", "http://localhost:8086/wx/storage/fetch/9aulzakswmjbi6srcg16.jpg", "http://localhost:8086/wx/storage/fetch/a9eep9d8eynrvo292fgw.jpg" ],
              currentIndex: 0,   //默认显示图片
              timer: null,   //定时器
              form: {},
          }
      },
      created() {
          this.getList();
          this.getUrl()
      },
      methods: {
          /** 查询【请填写功能名称】列表 */
          getList() {
              this.loading = true;
              listInformation(this.queryParams).then(response => {
                  this.testsList = response.rows;
                  this.total = response.total;
                  this.loading = false;
                  this.form =response.data;
              });
          },
          getUrl() {
              getTestUrls().then(response => {
                  if (200 == response.code) {
                      this.tests = response.data
                      console.log(JSON.stringify(response.data))
                  }
              })
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
    width: 20%;
    top: 0px;
    left: 0px;
    bottom: 0px;
    background-color: #fefffd;
    border-top: none;
    border-right: 1000px solid #b5b6b4;
    border-right-width: 2px;
  }
  .mainside{
    width: 80%;
    top: 0px;
    left: 0px;
    bottom: 0px;
    background-color: #fefffd;
    border-top: none;
    border-right: 2px solid #b5b6b4;
  }

  .forget {
    height: 30px;
    line-height: 30px;
    text-align: center;
    cursor: pointer;
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
    text-align: left;
    cursor: pointer;
    color: rgba(255,255,255,.8);
    font-size: 14px;
  }
  .banner {
    max-width: 450px;
    margin: 0 auto;
    position: relative;
    margin-top: 20px;
    margin-left: 20px;
    max-height: 600px;
    display: inline-block;
    font-size: 15px;
    bottom: 10px;
  }
  .banner img {
    width: 70%;
    display: block;
  }
  .banner .page {
    background: rgba(167, 167, 180, 0.5);
    position: absolute;
    left: 0;
    bottom: 0px;
    width: 70%;
  }
  .banner .page ul {
    float: right;

  }
  .current {
    color: #80817f;
  }

  .pp{
    display: inline-block;
    top: 100px;
    width: 20%;
    text-align: center;
    font-size: 15px;
  }

  .ll{
    top: 50px;
    height: 50px;
    text-align: center;
  }

  .one{
    left: 0px;
    color: #99a9bf;
  }
  .two{
    color: #556277;
  }
  .warn{
    color: #ede212;
    font-size: 20px;
  }
 .banner .text{
   display: inline-block;
    color: #80817f;
    font-size: 13px;
   width: 100%;
  }
a{
  color: rgba(11, 73, 180, 0.73);
  text-decoration: black;
}
a:hover{color: #df2026}

  .line{
    left: 10%;
    right: 10%;
    width: 80%;
    height: 1.5px;
    margin-top: -0.5em;
    background: #b4b2b2;
    position: relative;
    text-align: center;
  }

  .ff{
    font-size: 25px;
    color: #5a5e66;
  }
</style>
