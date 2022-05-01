import React from "react";
import { Button } from "react-bootstrap";

const Country = ({data, index, onRemoveCountry}) => {
    console.log(data);
    let stil = {
        textAlign: 'center',
        verticalAlign:'middle',
    }

    const {flags, name, population, capital, ccn3} = data;

  return (
  
    <tr key={index} style={stil}>
        <td>{index+1}</td>
        <td><img width="150" className="img-fluid" style={stil} src={flags.svg}></img></td>
        <td>{name.common}</td>
        <td>{population}</td>
        <td>{capital}</td>
        <td><Button variant="danger" onClick={()=>onRemoveCountry(ccn3)}>Sil</Button></td>
    </tr>
  
  
    )
};

export default Country;
