import Vue from 'vue'
import App from './App.vue'
import './registerServiceWorker'
import router from './router'
import vuetify from './plugins/vuetify'


// import { rtdbPlugin } from 'vuefire'
// Vue.use(rtdbPlugin);

new Vue({
    router,
    vuetify,
    render: h => h(App)
}).$mount('#app');
