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


const App =()=> {
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


 */}
 
  
    <Clock2 color="green" bgcolor="black"/>
    <Clock2 color="red" bgcolor="yellow"/>
    <Clock2 color="yellow" bgcolor="blue"/>

    </div>
  );
}

export default App;
