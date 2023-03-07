import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import axios from 'axios';


const app = createApp(App);

const axiosInstance = axios.create({
    // Configuration
    baseURL: 'http://localhost:8080',
    headers: {
        Accept: 'application/json'
    },
});

app.config.globalProperties.$axios = axiosInstance;
app.use(router);


app.mount('#app');
app.use(router);

