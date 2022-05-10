import React, { useContext } from "react";
import { StoreContext } from "../store";

const Hakkimizda = () => {
  const context = useContext(StoreContext)
  return (

    <div><h1>{context.count}</h1></div>

  );
};

export default Hakkimizda;
