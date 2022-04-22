import React from 'react'
import countries from '../assets/data/countries.json';

const JsxPractice = () => {

    
  const selectedCountry = "DZ"  
  return (

    <>

        <h2>Select a country</h2>
        <select defaultValue={selectedCountry}>

            <option disabled value="">Select a Country</option>
            {
                countries.map( (item, index) => 
                <option key={index} value={item.code}>{item.name}</option> )
            }

        </select>


        
        <h1>Countries &amp; Codes</h1>
        <table>
            <thead>
            <tr><th>Ülke Adı</th><th>Ülke Kodu</th></tr>
            </thead>

            <tbody>
            {
                countries.map((country, index)=>{

                    return(
                        <tr key={index}>
                            <td>{country.name}</td>
                            <td>{country.code}</td>
                        </tr>
                    )

            })
            }
            </tbody>
        </table>


        <h1>Countries</h1>
        <ul>
            {
            countries.map((country, index) => <li key={index}>{country.name}</li>)
            }
        </ul>


    

    </>
  )
}

export default JsxPractice