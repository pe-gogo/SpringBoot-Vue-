import {createRouter, createWebHistory} from 'vue-router'
import Layout from '../layout/Layout.vue'
import Login from '../views/Login'
import Register from "@/views/register";

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
    },
    {
        path: '/register',
        name: 'Register',
        component: Register,
    }


]

const router = createRouter({
        history: createWebHistory(process.env.BASE_URL),
        routes
    }
)

export default router
