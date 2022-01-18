<template>
    <div>
      <front-view-header></front-view-header>
      <front-view-sidebar></front-view-sidebar>
    </div>
</template>

<script>
  import FrontViewHeader from "./components/FrontViewHeader"
  import FrontViewSidebar from "./components/FrontViewSidebar"

    export default {
        name: "FrontView",
        components: {FrontViewHeader, FrontViewSidebar}
    }
</script>

<style scoped>
.header{
  height: 60px;
  top: 0px;
  left: 0px;
  right: 0px;
  background-color: #fefffd;
  font-size: 52px;
  color: #b4b5b3;
  border-bottom: 4px solid #b5b6b4;
  background-image: linear-gradient(90deg, #fefffd 0%, #d3d4d2 40%, #b5b6b4 100%);
}

  .sidebar{
    position: absolute;
    width: 100%;
    top: 60px;
    left: 0px;
    bottom: 0px;
    overflow-y: auto;
    background-color: #fefffd;
    border-top: none;
    border-right: 2px solid #b5b6b4 ;

  }

</style>
