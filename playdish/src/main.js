import { createApp } from 'vue'
import App from './App.vue'
import './registerServiceWorker'
import router from './router'
import vuetify from './plugins/vuetify'

new Vue({
    vuetify,
    render: h => h(App)
}).$mount('#app');

createApp(App).use(router).mount('#app')
