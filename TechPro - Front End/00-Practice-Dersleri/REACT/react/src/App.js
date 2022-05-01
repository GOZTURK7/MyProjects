
import Liste from './comp2/liste';
import Tablo from './comp2/tablo';
import Aders from './components/Aders';
import Bders from './components/Bders';
import Cders from './components/Cders';
import students from './assets/data/students.json'
import Kisi from './comp3/Kisi';
import "./assets/css/style.css";
import Kurs from './comp3/Kurs';
import Cards from './comp4/Cards';
import Akis from './comp4/Akis';



function App() {
  return <div className="App">
  {/* 
    <Aders/>
    <Bders/>
    <Cders/>
    <Tablo/>
    <Liste/>
    <Kurs/>

    <div className="card">
          {students.map((student, index) =>{

            const{isim, img, yas, kurs}=student;

            return (

            <Kisi 
            key={index} 
            ad = {isim} 
            img={img} 
            yas={yas} 
            kurs={kurs}
            />
          )})}
      </div>

 */}

 <Akis/>

<div className="yanyana">
          {students.map((student, index) =>{

            const{isim, img, yas, kurs}=student;

            return (

            <Cards 
            key={index} 
            ad = {isim} 
            img={img} 
            yas={yas} 
            kurs={kurs}
            />
          )})}
      </div>

      
  </div>;
}

export default App;
