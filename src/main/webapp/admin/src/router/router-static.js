import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import ganranxinxi from '@/views/modules/ganranxinxi/list'
    import wuzishenqing from '@/views/modules/wuzishenqing/list'
    import gelixinxi from '@/views/modules/gelixinxi/list'
    import jumin from '@/views/modules/jumin/list'
    import wuzixinxi from '@/views/modules/wuzixinxi/list'
    import wuzifenpei from '@/views/modules/wuzifenpei/list'
    import renyuanbaobei from '@/views/modules/renyuanbaobei/list'
    import jiankangdaka from '@/views/modules/jiankangdaka/list'
    import fengkongxinxi from '@/views/modules/fengkongxinxi/list'
    import shenqingchuru from '@/views/modules/shenqingchuru/list'
    import fangyixinxi from '@/views/modules/fangyixinxi/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import jubaoxinxi from '@/views/modules/jubaoxinxi/list'
    import yimiaoxinxi from '@/views/modules/yimiaoxinxi/list'
    import jiezhongxinxi from '@/views/modules/jiezhongxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/ganranxinxi',
        name: '感染信息',
        component: ganranxinxi
      }
      ,{
	path: '/wuzishenqing',
        name: '物资申请',
        component: wuzishenqing
      }
      ,{
	path: '/gelixinxi',
        name: '隔离信息',
        component: gelixinxi
      }
      ,{
	path: '/jumin',
        name: '居民',
        component: jumin
      }
      ,{
	path: '/wuzixinxi',
        name: '物资信息',
        component: wuzixinxi
      }
      ,{
	path: '/wuzifenpei',
        name: '物资分配',
        component: wuzifenpei
      }
      ,{
	path: '/renyuanbaobei',
        name: '人员报备',
        component: renyuanbaobei
      }
      ,{
	path: '/jiankangdaka',
        name: '健康打卡',
        component: jiankangdaka
      }
      ,{
	path: '/fengkongxinxi',
        name: '封控信息',
        component: fengkongxinxi
      }
      ,{
	path: '/shenqingchuru',
        name: '申请出入',
        component: shenqingchuru
      }
      ,{
	path: '/fangyixinxi',
        name: '防疫信息',
        component: fangyixinxi
      }
      ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
      ,{
	path: '/jubaoxinxi',
        name: '举报信息',
        component: jubaoxinxi
      }
      ,{
	path: '/yimiaoxinxi',
        name: '疫苗信息',
        component: yimiaoxinxi
      }
      ,{
	path: '/jiezhongxinxi',
        name: '接种信息',
        component: jiezhongxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
