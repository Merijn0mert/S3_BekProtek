export default [
    /**
     * Login Route
     * Path: /login
     * Name: login
     * Componenet: Login.vue
     */
    { 
        path: '/', 
        strict: true,
        sensitive: true,
        component: () => import('@/Views/HelloWorld.vue') 
    },
]