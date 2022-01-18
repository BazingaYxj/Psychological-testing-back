<template>
  <div>
    <el-form ref="userList" :model="queryParams" :rules="loginRules" label-width="100px">
      <el-form-item label="用户名" prop="username">
        <el-col :span="8">
          <el-input ref="username" v-model="queryParams.username" placeholder="用户名">
          </el-input>
        </el-col>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-col :span="8">
          <el-input ref="password" type="password" v-model="queryParams.password" placeholder="密码"></el-input>
        </el-col>
      </el-form-item>
      <el-form-item>
        <el-col :span="8">
          <el-button @click="login">登录</el-button>
        </el-col>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
    import { frontLogin } from '@/api/user/userinformation'
    export default {
        name: '',
        data () {
            return {
                userList:['username', 'password'],
                res: '',
                /*username: '',
                password: '',*/
                showDialog: 'false',
                loginRules: {
                    username: [{ required: true, message: '请输入用户名', trigger: 'blur' }],
                    password: [{ required: true, message: '请输入密码', trigger: 'blur' }]
                },
                queryParams: {
                    username: null,
                    password: null
                },
            }
        },
        created() {
            this.getList();
        },
        methods: {
            /** 查询列表 */
            getList() {
                this.loading = true;
                frontLogin(this.queryParams).then(response => {
                    console.log(JSON.stringify(response))
                    this.userList= response.data;
                    this.total = response.total;
                    this.loading = false;
                });
            },
            login () {
                console.log('username' + this.queryParams.username)
                console.log('password' + this.queryParams.password)
                frontLogin(this.queryParams).then(response => {
                    console.log(JSON.stringify(response.row.password))
                    var res = response.data
                    console.log('****res123**' + response.data)
                    if (res === true) {
                        alert('登录成功')
                        this.$router.push('/login')
                    } else {
                        alert('用户名密码错误')
                    }
                    // console.log('****res123**' + response.data)
                })
                // console.log('qwe' + handlelogin(this.loginForm))
            }
        }
    }
</script>

<style scoped>

</style>
