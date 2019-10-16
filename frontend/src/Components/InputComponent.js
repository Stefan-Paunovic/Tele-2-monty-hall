import React, {useState} from 'react';
import {retreiveMontyHallSimulation} from "../Service/MontyHallService"

import DropdownComponent from "./DropdownComponent"

function InputComponent({setResult}) {

    const [iterations, setIterations] = useState(10000);
    const [gameMode, setGameMode] = useState("KEEP_DOOR");

    function handleClick () {
        retreiveMontyHallSimulation(iterations, gameMode).then(response => {
            setResult(response.data)
        })
    }

    return(
        <div>
            <h4>Iterationer</h4>
            <input 
                value={iterations}
                type="number"
                placeholder="100"
                onChange={e => setIterations(e.target.value)}
            />
            <br/>

            <h4>Spelläge</h4>
            <DropdownComponent setGameMode={setGameMode}/>
            <br/>

            <button onClick={handleClick}>Simulate</button>
                
        </div>
    );
}

export default InputComponent;