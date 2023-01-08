import { createRouter, createWebHistory } from 'vue-router'
import CreateSticker from '../components/CreateSticker.vue'
import Home from '../components/Home.vue'
import EditAllStickers from '../components/EditAllStickers.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/create-sticker',
      name: 'createSticker',
      component: CreateSticker
    },
    {
      path: '/edit-stickers',
      name: 'editAllStickers',
      component: EditAllStickers
    }

  ]
})

export default router
