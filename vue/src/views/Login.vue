<template>
  <div style="width: 100%; height: 100vh;background-color: whitesmoke; overflow: hidden">
    <div style="width: 400px; margin: 150px auto">
      <div style="color: dodgerblue ;font-size: 30px; text-align: center">欢迎登录</div>
      <el-form :model="form" style="padding: 30px  0">
        <el-form-item>
          <el-input prefix-icon="el-icon-search" v-model="form.name" placeholder="请输入用户名"/>
        </el-form-item>
        <el-form-item>
          <el-input v-model="form.password" placeholder="请输入密码"/>
        </el-form-item>
        <el-form-item>
          <el-button v-model="form.name" style="width: 100%">登录</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  name: "Login",
  data(){
    return {
      form: {}
    }
  }
}
</script>

<style scoped>

</style>