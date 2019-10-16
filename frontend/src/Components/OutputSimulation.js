import React, {useState} from 'react';

function OutputSimulation({result}) {

    return (
        <div >
            <h3>Simulation result</h3>
            <div align="center">
                <table>
                    <thead>
                        <tr>
                            <th>Iterations</th>
                            <th>Wins</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>{result.numberOfIterations}</td>
                            <td>{result.numberOfWins}</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    )

}

export default OutputSimulation;