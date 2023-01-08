import { createRouter, createWebHistory } from 'vue-router'
import CreateSticker from '../components/CreateSticker.vue'
import Home from '../components/Home.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/create-sticker',
      name: 'createSticker',
      component: CreateSticker
    },
    {
      path: '/',
      name: 'home',
      component: Home
    }

  ]
})

export default router
