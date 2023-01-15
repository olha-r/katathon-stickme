import { createRouter, createWebHistory } from 'vue-router'
import Home from '../components/Home.vue'
import CreateSticker from '../components/CreateSticker.vue'
import StickerDetails from '../components/StickerDetails.vue'
import EditAllStickers from '../components/EditAllStickers.vue'
import UpdateSticker from '../components/UpdateSticker.vue'

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
      path: '/sticker/:id',
      name: 'sticker',
      component: StickerDetails
    },
    {
      path: '/edit-stickers',
      name: 'editAllStickers',
      component: EditAllStickers
    },
    {
      path: '/sticker/update/:id',
      name: 'updateSticker',
      component: UpdateSticker
    }

  ]
})

export default router
