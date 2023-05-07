<template>
    <div id="app" class="">
        <router-view></router-view>
    </div>
</template>

<script>
export default {
    name: "app",
};
</script>

<style lang="scss">
* {
    padding: 0;
    margin: 0;
}
html,
body {
    width: 100%;
    height: 100%;
}
#app {
    height: 100%;
}
body {
    padding: 0;
    margin: 0;
}
.index-aside .menulist-item[data-v-0175fa3e] {
    padding: 0 !important;
}
.index-aside .index-aside-inner[data-v-0175fa3e] .el-menu {
    background-color: floralwhite !important;
}
.loginIn .left {
    width: 400px !important;
    border-width: 0 !important;
    border-radius: 12px !important;
    margin: 0 auto !important;
    padding: 30px 40px 16px !important;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.15) !important;
    opacity: 0.95 !important;
}
.loginIn .left .title-container .title {
    width: 100% !important;
    margin: 0 auto 40px !important;
    font-size: 28px !important;
    background-color: unset !important;
    color: #333333 !important;
    padding: 0 !important;
    font-family: cursive !important;
}

.loginIn .loginInBt {
    background-color: #708eea !important;
    color: white !important;
    border-radius: 8px !important;
    width: 200px !important;
    height: 44px !important;
    font-size: 18px !important;
    letter-spacing: 5px !important;
    padding: 0 !important;
    margin: 0 67px !important;
}

.loginIn .left .el-form-item .el-radio.is-checked .el-radio__inner {
    background-color: #708eea !important;
    border-color: #708eea !important;
}
.loginIn .left .el-form-item .el-radio.is-checked .el-radio__label {
    color: #708eea !important;
}

.navbar {
    background-image: unset !important;
    background-color: #708eea !important;
}
.navbar .title-menu .title-name {
    color: white !important;
}
.navbar .right-menu div {
    color: white !important;
    background-color: #708eea !important;
}
.navbar .right-menu div.logout:hover {
    background-color: white !important;
    color: #708eea !important;
}
.app-breadcrumb {
    background-color: white !important;
    border-radius: 8px !important;
}
.index-aside .menulist-item {
    background-image: unset !important;
    background-color: #222d32 !important;
}

.index-aside .el-menu-demo .el-menu.el-menu--inline {
    width: 100% !important;
    margin: 0 !important;
    color: white !important;
    border-width: 0 !important;
    text-align: left !important;
    padding: 0 !important;
    text-indent: 35px !important;
}
.index-aside .el-menu-demo .el-menu.el-menu--inline .el-menu-item {
    text-align: left !important;
    padding: 0 !important;
    text-indent: 35px !important;
    color: white !important;
    height: 44px !important;
    line-height: 44px !important;
    border-radius: 0 !important;
    box-shadow: unset !important;
}
.index-aside .el-menu-demo .el-menu.el-menu--inline .el-menu-item:hover {
    height: 44px !important;
    border: 0 !important;
    border-radius: 0 !important;
    background-color: #708eea !important;
    line-height: 44px !important;
}
.index-aside .el-menu-demo .el-menu.el-menu--inline .el-menu-item.is-active {
    height: 44px !important;
    border: 0 !important;
    border-radius: 0 !important;
    background-color: #708eea !important;
    line-height: 44px !important;
}
.index-aside .el-menu-demo .el-submenu__title .el-submenu__icon-arrow {
    color: white !important;
}

.el-button {
    border-radius: 6px !important;
    border: 1px solid transparent !important;
    background-color: #708eea !important;
    color: white !important;
    margin-right: 5px !important;
}
.el-pagination.is-background .el-pager li:not(.disabled).active {
    background-color: #708eea !important;
}

.el-button.el-button--danger {
    background-color: #f52713 !important;
}
.el-checkbox__input.is-checked .el-checkbox__inner {
    background-color: #708eea !important;
    border-color: #708eea !important;
}
.el-checkbox__input.is-indeterminate .el-checkbox__inner {
    background-color: #708eea !important;
    border-color: #708eea !important;
}
.el-checkbox__inner:hover {
    border-color: #708eea !important;
}
.el-input__inner {
    border-color: #d9d9d9 !important;
    border-radius: 6px !important;
}
.el-input__inner:focus {
    border-color: #708eea !important;
}
.el-textarea__inner {
    border-color: #d9d9d9 !important;
    border-radius: 6px !important;
}
.el-textarea__inner:focus {
    border-color: #708eea !important;
}

// 背景图
.container {
    background-image: url("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fnimg.ws.126.net%2F%3Furl%3Dhttp%253A%252F%252Fdingyue.ws.126.net%252F2022%252F0324%252F76190a9ej00r97ixe0025d200ku00ejg00g200b7.jpg%26thumbnail%3D660x2147483647%26quality%3D80%26type%3Djpg&refer=http%3A%2F%2Fnimg.ws.126.net&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1653531406&t=9cb7d37c637846f8f2642cdee23e976d") !important;
    min-height: 100vh;
    position: relative;
    background-repeat: no-repeat;
    background-position: center center;
    background-size: cover;
    background-repeat: no-repeat;
    background-size: 100% 100%;
    background-repeat: repeat-x;
}






.loginIn .register{
    margin: 0px !important;
}
</style>
