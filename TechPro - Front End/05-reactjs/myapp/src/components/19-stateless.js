import React from "react";

const Stateless = () => {

    let counter = 10;

    const artir = ()=> {
        counter++;
        console.log(counter);
        document.querySelector("b").innerText = counter;
        // bu örnekte state kullanılmadı document.querySelector ile SANAL DOM
        // bypass edilerek doğrudan gerçek DOM'a yazıldı
        // BU REACT İÇİN İSTENİLEN BİR DURUM DEĞİL
    }

  return (

    <>
    
        <b>{counter}</b>
        <button onClick={artir}>Artır</button>
    
    </>

    )
};

export default Stateless;
