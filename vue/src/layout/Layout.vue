<template>
  <div>
    <Header></Header>
    <div style="display: flex">
      <Aside></Aside>
      <router-view style="flex: 1">
      </router-view>
    </div>
  </div>
</template>

<script>
import Aside from "@/components/Aside";
import Header from "@/components/Header";

export default {
  name: "layout",
  components:{
    Aside,
    Header
  }
}
</script>

<style scoped>

</style>