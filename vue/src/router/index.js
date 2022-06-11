import {createRouter, createWebHistory} from 'vue-router'
import Layout from '../layout/Layout.vue'
import Login from '../views/Login'

const routes = [
    {
        path: '/',
        name: 'Layout',
        component: Layout,
        redirect: "/home",
        children: [{
            path: 'home',
            name: 'home',
            component: () => import("@/views/HomeView")
        }
        ]
    },
    {
        path: '/login',
        name: 'Login',
        component: Login,
    }


]

const router = createRouter({
        history: createWebHistory(process.env.BASE_URL),
        routes
    }
)

export default router
