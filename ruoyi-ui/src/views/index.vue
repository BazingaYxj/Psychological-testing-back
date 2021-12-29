<template>
  <div class="xinliceshi">心理测试网站后台管理</div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "3.7.0",
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    },
  },
};
</script>

<style scoped>
  .xinliceshi{
    height: calc(90vh);
    line-height: calc(80vh);
    text-align: center;
    font-size: 50px;
    -ms-scrollbar-3dlight-color: #cde408;
  }
</style>

