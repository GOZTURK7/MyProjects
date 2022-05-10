import React, { useContext } from "react";
import { Button } from "react-bootstrap";
import { StoreContext } from "../store";

const Anasayfa = () => {

  const context = useContext(StoreContext);

  const handleChange = (e)=>{
    console.log(e.target.textContent);
    
    if(e.target.textContent=="-"){
      context.setCount(context.count-1);
    }
    
    if(e.target.textContent=="+"){
      context.setCount(context.count+1);
    }
    
    if(e.target.textContent=="Reset"){
      context.setCount(0);
    }

  }

  return (
  <div>

    <h1>{context.count}</h1>
     <Button onClick={handleChange}>+</Button>
     <Button onClick={handleChange}>-</Button> 
     <Button onClick={handleChange}>Reset</Button> 
 
     
  </div>
  );
};

export default Anasayfa;
