import React, {useState} from 'react';
import 'react-dropdown/style.css'

function DropdownComponent({setGameMode}) {

    return (
        <div>
            <select id="lang" onChange={(e) => setGameMode(e.target.value)}>
                  <option value="KEEP_DOOR">Keep door</option>
                  <option value="CHANGE_DOOR">Change door</option>
                  <option value="RANDOM">Random door</option>
               </select>
        </div>
    );
}

export default DropdownComponent;