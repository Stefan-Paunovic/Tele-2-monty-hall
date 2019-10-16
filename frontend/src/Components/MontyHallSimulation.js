import React, {useState} from 'react';
import InputComponent from "./InputComponent.js"
import OutputSimulation from "./OutputSimulation"


function MontyHallSimulation() {

    const [result, setResult] = useState();

    return (
        <div>
            <h1>Simulation</h1>
            <InputComponent setResult={setResult} />
            {!result ? "" : <OutputSimulation result={result} />}
        </div>
    )
}
export default MontyHallSimulation;