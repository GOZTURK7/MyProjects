import React, { useState } from "react";

const Tour = ({id, name, info, image, price, removeTour}) => {
    const [readMore, setReadMore] = useState(false);
    
  return (
    <div>
        <img src={image} alt=""/>
        <h4>{name}</h4>
        <h4>$ {price}</h4>
        <p>{readMore ? info: `${info.substring(0,150)}...`}
            <button onClick={()=>setReadMore(!readMore)}>
                {readMore ? 'show less' : 'read more'}
            </button>
        </p>

        <button onClick={()=>removeTour(id)}>Not İnterested</button>

    </div>
  )
};

export default Tour;
