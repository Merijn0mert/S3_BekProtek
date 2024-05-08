import { createApp } from 'vue'
// import { createPinia } from 'pinia'
//import PrimeVue from 'primevue/config';

import App from './App.vue'
import router from '@/Routers/index'

//import '@/assets/styles/cssloader'

const app = createApp(App)

if (process.env.NODE_ENV === 'development')
    app.config.devtools = true;

//app.use(createPinia())
app.use(router)
//app.use(PrimeVue)

app.mount('#app')