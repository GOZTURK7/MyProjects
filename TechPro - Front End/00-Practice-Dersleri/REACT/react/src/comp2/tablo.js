import React from 'react'
import students from '../assets/data/students.json';

const Tablo = () => {

    const still ={
        color:"crimson",
        fontWeight:"bolder",
        backgroundColor:"aquamarine",
        textAlign:"left"
    };

    const still2 ={
        color:"yellow",
        fontWeight:"bolder",
        backgroundColor:"gray",
        textAlign:"left"
    };

  return (

    <>
        <h1 style={{color:"brown"}}>KURSİYERLER</h1>
        <table>
            <thead>
                <tr style={still}>
                    <th>İsim</th><th>Yaş</th><th>Aldığı Kurs</th>
                </tr>
            </thead>
            <tbody>
                {
                    students.map((student, index)=>{
                        return(
                            <tr style={index % 2 == 0 ? still : still2} key={index}>
                                <td>{student.isim}</td>
                                <td>{student.yas}</td>
                                <td>{student.kurs}</td>
                            </tr>
                        )
                    })
                }
            </tbody>
        </table>
    </>

  )
}

export default Tablo