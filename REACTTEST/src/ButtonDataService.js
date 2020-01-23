import axios from 'axios'

//The PATH is the connection and port to the java backend.  This should always be the same.
//The backend should be set to localhost so that only this can connect to it.
const PATH_API_URL = 'http://localhost:8080'
//Just getting the full path to send to the Java backend.
const BUTTON_API_URL = `${PATH_API_URL}/buttonz`


class ButtonDataService {

    //A method to actually get the data.
    retrieveButtonName() {
        //The axios is what will actually make the call to the backend.
        //You can put post or get.  The other stuff isn't really needed.
        return axios.post(`${BUTTON_API_URL}`);
        //return axios.post('${BUTTON_API_URL}', 5);
    }
}

//Defining that when you import this class, it automatically instantiates itself.
//Notice how in ListCoursesComponent it can still call this stuff without being first created?
export default new ButtonDataService()

