<template>
  <div>
    <el-form ref="form" :rules="rules" :model="loginForm" class="login-container" label-width="70px">
      <h3>系统登录</h3>
      <el-form-item label="用户名" prop="username">
        <el-input type="text" v-model="loginForm.username" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input type="password" v-model="loginForm.password" placeholder="请输入密码"></el-input>
      </el-form-item>
      <el-form-item label="验证码" class="captcha-box" prop="code">
        <el-input type="text" v-model="loginForm.code" placeholder="点击图片" auto-complete="false"></el-input>
        <img :src="captchaUrl" alt="" @click="updateCaptcha">
      </el-form-item>

      <el-checkbox :checked="checked" class="loginMember">记住我</el-checkbox>
      <el-button type="primary" style="width:100%" @click="onsubmit">登录</el-button>
    </el-form>
  </div>
</template>

<script>
export default {
  name: 'Login',
  data () {
    return {
      captchaUrl: '/captcha?time=' + new Date(),
      loginForm: {
        username: '',
        password: ''
      },
      checked: true,
      rules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' },
          { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' },
          { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
        ],
        code: [
          { required: true, message: '请输入验证码', trigger: 'blur' },
          { min: 4, max: 4, message: '只能四位', trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    onsubmit () {
      this.$refs.form.validate((valid) => {
        if (valid) {
          alert('submit!')
        } else {
          this.$message.error('输入有误！')
          return false
        }
      })
    },
    updateCaptcha () {
      this.captchaUrl = '/captcha?time=' + new Date()
    }
  }
}
</script>

<style scoped lang="scss">
  .login-container {
    border-radius: 15px;
    margin: 180px auto;
    width: 400px;
    padding: 15px 35px;
    border: 1px solid #eaeaea;
    background: #fff;
    box-shadow: 0 0 25px #cac6c6;

    h3 {
      text-align: center;
      margin: 0 0 20px 0;
    }

    .el-button {
      margin-top: 20px;
    }

    .captcha-box {
      /*display: flex;*/
      /*justify-content: left;*/
      /*align-items: center;*/
      /*background: orange;*/
      .el-input {
        width: 240px;
        /*margin-right: 50px;*/
      }

      img {
        width: 50px;
        margin-left: 10px;
        height: 30px;
      }
    }

    .loginMember {
      margin-left: 60px;
    }

    .el-form-item__content {
      display: flex;
      align-items: center;
    }
  }

</style>
