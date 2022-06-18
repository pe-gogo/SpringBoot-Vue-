<template>
  <div style="width: 100%; height: 100vh;background-color: whitesmoke; overflow: hidden">
    <div style="width: 400px; margin: 50px auto;">
      <div style="color: dodgerblue ;font-size: 30px; text-align: center">注册</div>
      <el-form :model="form" label-width="120px" style="padding: 30px  0" >
        <el-form-item prop="username" label="用户名">
          <el-input v-model="form.username" />
        </el-form-item>
        <el-form-item prop="nickname" label="昵称">
          <el-input v-model="form.nickName" />
        </el-form-item>
        <el-form-item prop="password" label=" 密码">
          <el-input show-password v-model="form.password" />
        </el-form-item>
        <el-form-item prop="confirm" label=" 重复密码">
          <el-input show-password v-model="form.confirm" />
        </el-form-item>
        <el-form-item prop="age" label="年龄">
          <el-input show-password v-model="form.age" />
        </el-form-item>
        <el-form-item prop="sex" label="性别">
          <el-radio-group v-model="form.sex">
            <el-radio label="男" />
            <el-radio label="女" />
          </el-radio-group>
        </el-form-item>
        <el-form-item prop="address" label="地址">
          <el-input v-model="form.address" type="textarea" />
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="register">注册</el-button>
          <el-button @click="clear">取消</el-button>
        </el-form-item>
      </el-form>
<!--      <el-form :model="form" :rules="rules"-->
<!--               style="padding: 30px  0">-->
<!--        <el-form-item label="用户名" prop="username">-->
<!--          <el-input v-model="form.username" placeholder="请输入用户名"/>-->
<!--        </el-form-item >-->
<!--        <el-form-item label="密码" prop="password" >-->
<!--          <el-input v-model="form.password" show-password placeholder="请输入密码"/>-->
<!--        </el-form-item >-->
<!--        <el-form-item label="确认密码" prop="confirm">-->
<!--          <el-input v-model="form.confirm" show-password placeholder="确认密码"/>-->
<!--        </el-form-item>-->
<!--        <el-form-item label="昵称" prop="nickname">-->
<!--          <el-input v-model="form.nickName" placeholder="请输入昵称"/>-->
<!--        </el-form-item >-->

<!--        <el-form-item label="性别">-->
<!--          <el-radio-group v-model="form.sex">-->
<!--            <el-radio label="女" />-->
<!--            <el-radio label="男" />-->
<!--          </el-radio-group>-->
<!--        </el-form-item>-->
<!--        <el-form-item label="地址" prop="addr">-->
<!--          <el-input  v-model="form.address" placeholder="地址"/>-->
<!--        </el-form-item >-->

<!--        <el-form-item>-->
<!--          <el-button type="primary" @click="register" style="width: 100%">注册</el-button>-->
<!--        </el-form-item>-->
<!--      </el-form>-->
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
      rules: {
        username: [
          { required: true,
            message: '请输入用户名',
            trigger: 'blur' },
        ],
        password: [
          { required: true,
            message: '请输入密码',
            trigger: 'blur' },
        ],
        confirm: [
          { required: true,
            message: '请重复密码',
            trigger: 'blur' },
        ]
      }

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
          }
      )
    }
  }
}
</script>

<style scoped>

</style>