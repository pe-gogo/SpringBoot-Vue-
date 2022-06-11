<template>
  <div style="width: 100%; height: 100vh;background-color: whitesmoke; overflow: hidden">
    <div style="width: 400px; margin: 150px auto">
      <div :rules="rules" style="color: dodgerblue ;font-size: 30px; text-align: center">欢迎登录</div>
      <el-form :model="form" style="padding: 30px  0">
        <el-form-item prop="username">
          <el-input v-model="form.username" placeholder="请输入用户名"/>
        </el-form-item >
        <el-form-item >
          <el-input v-model="form.password" show-password placeholder="请输入密码"/>
        </el-form-item >
        <el-form-item>
          <el-input v-model="form.confirm" show-password placeholder="确认密码"/>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="register" style="width: 100%">注册</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import request from "@/utils/request";

export default {
  name: "Login",
  data() {
    return {
      form: {},

    }
  },
  methods: {
    register() {
      if (this.form.password !== this.form.confirm) {
        this.$message({
          type: "error",
          message: "密码不一致"
        })
        return
      }

      request.post("/user/register", this.form).then(
          res => {
            if (res.code === '0') {
              this.$message({
                type: "success",
                message: "注册成功"
              })
              this.$router.push("/login")
            } else {
              this.$message({
                type: "error",
                message: res.msg
              })
            }
            console.log(res)
            this.load();
          }
      )
    }
  }
}
</script>

<style scoped>

</style>