import axios from 'axios'

const BASE_API_URL = 'https://localhost:8081'

async function getById(id) {
    var data = null

    try {
        if (isNaN(id))
            return null
    
        var response = await axios.get(`${BASE_API_URL}/${id}`)
        if (response.status != 200)
            return null

        data = response.data
    } catch {
        console.log('[Error]: Failed to fetch products')
    }

    return data
}


export default {
    GetByID  
}