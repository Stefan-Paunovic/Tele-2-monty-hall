import axios from 'axios'

const API_URL = 'http://localhost:8080/simulate'

export function retreiveMontyHallSimulation(iterations, gamemode){

    var URL = API_URL + "?iterations=" + iterations + "&gamemode=" + gamemode;
    
    return axios.get(`${URL}`)
}
