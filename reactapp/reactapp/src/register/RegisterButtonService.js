import axios from 'axios'

const PATH_API_URL = 'http://localhost:8080'

const BUTTON_API_URL = `${PATH_API_URL}/cusrest/cusinsert`


class RegisterDataService {

    RegisterNewCustomer(newCustomer) {

        return axios.post(`${BUTTON_API_URL}`, newCustomer);
    }
}

export default new RegisterDataService()

