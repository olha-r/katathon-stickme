<script>
import { RouterLink, RouterView } from 'vue-router'
import Toast from "./components/Toast.vue"
import Navbar from "./components/Navbar.vue"

export default {

  name: "App",

  components: {
    Toast: Toast,
    Navbar: Navbar
  }

};

</script>

<template>
  <header>

    <div class="wrapper">

      <Navbar></Navbar>

    </div>
  </header>
  <RouterView />
  <Toast></Toast>

</template>


