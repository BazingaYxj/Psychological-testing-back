<template>
  <div class="header">
  <img v-if="logo" :src="logo" class="sidebar-logo" />
    心理站

    <!-- 头像下拉菜单 -->
    <div class="header-avatar">
      <div class="user">
        用户，您好！
      </div>
      <el-dropdown @command="handleCommand">
              <span class="el-dropdown-link">
                <img width="40" height="40" style="border-radius:50%;background:#dddddd" src="@/assets/logo/three.jpg" alt="">
                <i class="el-icon-arrow-down el-icon--right"></i>
              </span>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item command="update-password">修改密码</el-dropdown-item>
          <el-dropdown-item command="logout">退出登录</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
    </div>
  </div>
</template>

<script>
    import logoImg from '@/assets/logo/two.jpg'
    export default {
        name: "index",
        data() {
            return {
                logo: logoImg
            }
        },
        methods: {
            // 右上角下拉菜单点击事件
            handleCommand(command) {
                switch (command) {
                    // 退出
                    case 'logout':
                        //消息提示
                        this.msg.success('退出登录')
                        //重置vuex中的数据
                        this.$store.commit('clearVUEX')
                        //跳转到首页
                        this.$router.push("/index");
                        break
                    //修改密码
                    case 'update-password':
                        //消息提示
                        this.msg.success('修改密码')
                        break
                }
            }
        }
    }
</script>

<style scoped>
.sidebar-logo{
  /*position: absolute;*/
  width: 35px;
  height: 35px;
  position: center;

}

.header-avatar{
  float:right;
  width:50%;
  display: flex;
  align-items: center;
  justify-content:flex-end;
  padding-right:20px;

}
.user{
  font-size: 20px;
  font-weight: bold;
  padding: 0 10px;
  color: #1f2d3d;
}
.el-dropdown-link {
  cursor: pointer;
}
</style>
