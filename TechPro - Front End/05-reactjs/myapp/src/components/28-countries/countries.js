import React, {useEffect, useState} from "react";
import {Container, Table, Spinner} from "react-bootstrap";
import axios from 'axios';
import Country from "./country";



const Countries = () => {

  const [countries, setCountries] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    
    axios("https://restcountries.com/v3.1/all")
    .then(resp=>{
      console.log(resp);
      setCountries(resp.data);
      setLoading(false);

    })
    }, []);

  
  const removeCountry = (id) => {
    const arr = countries.filter((item)=>item.ccn3 != id);
    setCountries(arr);
   }
  

  

  return (
  <Container className="mt-5">
      <Table striped bordered hover>
    <thead>
      <tr>
        <th>#</th>
        <th>Bayrak</th>
        <th>Ülke</th>
        <th>Nüfus</th>
        <th>Başkent</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
        <tr className={loading ? "d-block" : "d-none"}>
          <td><Spinner animation="border"/>Loading...</td>
        </tr>

        {
          countries.map((country, index)=><Country key={index} data={country} index={index} onRemoveCountry={removeCountry}/>)
        }
    </tbody>
  </Table>
</Container>


  
    )
};

export default Countries;
