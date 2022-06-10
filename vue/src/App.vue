<template>
  <div id="nav">
    <Header></Header>
    <div style="display: flex">
      <Aside></Aside>
      <router-view style="flex: 1"></router-view>

    </div>
  </div>
</template>


<style>

</style>

<script>
import Header from "./components/Header";
import Aside from "./components/Aside";
export default {
  name: "Layout",
  components:{
    Aside,
    Header
  }
}
</script>