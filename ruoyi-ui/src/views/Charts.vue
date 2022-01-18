<template>
  <div>
  <el-button @click="showDialog">
    OPEN
  </el-button>
  <el-dialog
    title="标题"
    v-model="shujixiaoForm"
    :visible="shujixiaoForm"
    width="650px"
    :modal-append-to-body="false"
    @close="closeDialog">
    <div id="zhuSalesProv"  style="height:500px;width:600px;border:1px solid #ccc;" ref="zhuSalesProv"></div>
  </el-dialog>
  </div>
</template>

<script>
    export default {
        name: "Charts",

        data(){
            return{
                shujixiaoForm:false
                //先将该弹框默认为隐藏，根据具体的需求，你可以给想要显示这个弹框的元素加点击事件，将它设为true即可
            }
        },
        methods:{
            closeDialog(){
                this.shujixiaoForm = false;
            },
            showDialog(){
                this.shujixiaoForm = true;
                this.$nextTick(() =>{ //延迟等待渲染完再加载
                    this.zhuzhuang()
                })
            },
            //柱状图显示
            zhuzhuang(){
                //来获取存放柱状图的dom元素
                var motank = this.$echarts.init(document.getElementById("zhuSalesProv"));
                window.addEventListener('resize', function () {
                    motank.resize()
                })
                //柱状图动态获取数据
                var that = this;
                that.$axios.get('http://localhost:8088/score/information/chartone',{
                    //参数
                }).then(res=>{
                    console.log(JSON.stringify(res));
                    //先声明一个空数组来存放获取到的柱状条的数据
                    let seriesData = [];
                    //还需声明一个空数组来存放与柱状条数据对应的名称
                    let nameDatas = [];
                    //获取到的数据需要转换成Json字符串,这里我也不是很明白，在控制台调试的时候，获取到的数据都是[object,Object]这样的格式，所以我只能转换一下
                    let outdata =JSON.stringify(res.data.data);
                    //这里还需eval来处理一下字符串转为json对象，如此就能获取到数据了
                    let xqo = eval('('+outdata+')');
                    //根据返回的数据，循环遍历出你要展示的数据
                    for(var i in xqo){
                        //这里我展示的是后台返回的每条数据里面的 testName和 num
                        nameDatas.push(xqo[i].testName);
                        seriesData.push(xqo[i].num);
                    }
                    //这里是柱状图的配置，最重要的是series里面的data和xAxis中的data都是数组，用来存放数据，上面从后台获取到的seriesData和nameDatas赋值给它们，就可以展示所需要的数据
                    motank.setOption({
                        title: {
                            text:'',//柱状图大标题
                            subtext:'',//柱状图小标题,
                            left: 'left'//标题摆放的位置
                },
                    color:['#3398DB'],
                        tooltip:{
                        trigger:'axis',
                            axisPointer:{
                            type:'shadow'
                        }
                    },
                    legend:{
                        data:['']
                    },
                    grid:{
                        left:'3%',
                            right:'4%',
                            bottom:'3%',
                            containLabel:true
                    },
                    xAxis:[
                        {
                            type:'category',
                            data:nameDatas,//这里是和柱状条数据对应的名称
                            axisTick:{
                                alignWithLabel:true
                            }
                        }
                    ],
                        yAxis:[
                        {
                            type:'value'
                        }
                    ],
                        series:[
                        {
                            name: '',//数据的名称，例如销量
                            type: 'bar',
                            barWidth:'60%',
                            data:seriesData//一定要赋值给data
                        }
                    ],
                })
                }).catch(res=>{
                    that.$message.error('不好意思,图表请求数据失败啦！')
                })
            },
        },
    }
</script>

<style scoped>

</style>
