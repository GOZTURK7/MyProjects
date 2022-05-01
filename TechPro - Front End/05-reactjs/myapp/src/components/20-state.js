import React, { useState } from "react";

const State = () => {

    const [counter, setCounter] = useState(10)

    const artir = ()=> {
        setCounter(counter+1);
    };

    console.log(counter);

  return (

    <>
    
        <b>{counter}</b>
        <button onClick={artir}>Artır</button>
    
    </>

    )
};

export default State;
