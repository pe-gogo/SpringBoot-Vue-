<template>
      <el-menu
          default-active="user"
          class="el-menu-vertical-demo"
          :default-openeds="[1]"
          style="width: 200px; min-height: calc(100vh - 50px)"
      >
        <el-sub-menu index="1">
          <template #title>
            <span>系统管理</span>
          </template>
            <el-menu-item index="user" :route="{path: '/'}">用户管理</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="2">
          <template #title>
            <span>数据管理</span>
          </template>
        </el-sub-menu>
      </el-menu>

</template>

<script>
export default {
  name: "Aside"
}
</script>

<style scoped>

</style>