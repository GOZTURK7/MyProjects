import React from 'react'
import students from '../assets/data/students.json';

const Kurs = () => {
    
  return (
    <div>
        <h1>Kursiyerler</h1>
        <h3>Yaşı 25'ten büyük olanlar:</h3>


        {
            students.filter((students) => students.yas > 25).map((student, index)=>(
                <ul key={index}>
                    <li>{student.isim}</li>
                </ul>
            ))
        }
    </div>
  )
}

export default Kurs