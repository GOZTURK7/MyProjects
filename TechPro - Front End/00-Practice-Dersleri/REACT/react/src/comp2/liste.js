import React from 'react'
import students from "../assets/data/students.json";





const Liste = () => {
    let  durum="Aktif";

   const student1=students.filter(student=>student.yas>15);

   //Array donduruyor             =>  console.log(students.filter(student=>student.yas>15));
   //Tek tek eleman donduruyor    =>  console.log(students.map(student=>student+{durum}));
    
  return (
    <div><h1 >KURSIYERLER</h1>
    <table>
      <thead>
        <tr  >
          <th>ISIM</th>
          <th>YAS</th>
          <th>KURSU</th>
        </tr>  
      </thead>
      <tbody>


 


        {
       
        
        student1.map((student,index)=>{  
                                                     
          return (
            <tr key={index}  >
              <td>{student.isim}</td>
              <td>{student.yas}</td>
              <td>{student.kurs}</td>
            </tr>
          );
        })}
      </tbody>
    
    </table>

    </div>
  )
}

export default Liste;