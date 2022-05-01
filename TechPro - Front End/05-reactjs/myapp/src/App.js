import HelloWorld from "./components/01-hello-world";
import Comp from './components/02-comp';
import Jsx, {Test1, Test2} from './components/03-jsx'
import Jsx2 from "./components/04-jsx-2";
import JsxLoop from "./components/05-jsx-loop";
import JsxPractice from "./components/06-jsx-practice";
import StyleInline from "./components/07-style-inline";
import StyleInternal from "./components/08-style-internal";
import StyleExternal from "./components/09-style-external";
import Props from "./components/11-props";
import Clock1 from "./components/Clock1/10-Clock1";
import Clock2 from "./components/Clock2/10-Clock1";
import Image from "./components/13-image";
import ImagePractice from "./components/14-image-practice";
import ProfileCard from "./components/15-profile-cards";
import BootstrapStatic from "./components/16-bootstrap-static";
import BootstrapDinamik from "./components/17-bootstrap-dinamik";
import Shop from "./components/18-bootstrap-practice/shop";
import Stateless from "./components/19-stateless";
import State from "./components/20-state";
import Counter from "./components/21-counter";
import Birthday1 from "./components/22-birthday-homework/birthday";
import Birthday from "./components/22-birthday/birthday";
import UseEffect from "./components/23-useEffect";
import Clock3 from "./components/Clock3/10-Clock3";
import { Button } from "react-bootstrap";
import {useState} from 'react'
import UseEffect2 from "./components/24-useeffect";
import RandomImage from "./components/25-randomimage";
import RandomImage2 from "./components/26-randomimage-2";
import UserCards from "./components/27-usercards/user-cards";
import Countries from "./components/28-countries/countries";




const App =()=> {

  const [test, setTest] = useState(true);

  return (
    <div className="App">
      {/* bu benim ilk çalışmam */}
      {/* <HelloWorld/>
      <Comp/>
      <Jsx/>
      <Test1/>
      <Test2/>
      <Jsx2/>
      <JsxLoop/>
      <JsxPractice/>
       <StyleInline/>
      <StyleExternal/>
      <Clock1/>
      <Props ad="Metin" yas="33"/>
      <Props ad="Ali" yas="55"/>
      <Clock2 color="green" bgcolor="black"/>
    <Clock2 color="red" bgcolor="yellow"/>
    <Clock2 color="yellow" bgcolor="blue"/>
    <Image/>
    <ImagePractice/>

    <ProfileCard 
    name="Ali Gel" 
    location="İstanbul, Türkiye" 
    avatar="profile-image.jpg" 
    shot="4" 
    followers="4523" 
    followings="50"/>

      <br/>

    <ProfileCard 
    name="Ali Gel" 
    location="İstanbul, Türkiye" 
    avatar="profile-image.jpg" 
    shot="4" 
    followers="4523" 
    followings="50"/>
      <BootstrapStatic/>
          <BootstrapDinamik/>
      <Shop/>
      <Stateless/>
      <State/>  
      <Counter/>
          <Birthday1/>
    <Birthday/>
      <UseEffect/>  

     {test && <Clock3/>}
    <Button onClick={()=>setTest(false)}>Test</Button>
    <Button onClick={()=>setTest(true)}>Restart</Button>
       
    <UseEffect2/>

       <RandomImage/>
   <RandomImage2/>

        <UserCards/>


 */}
    <Countries/>
    </div>
  );
}

export default App;
