import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Anasayfa from "./components/Anasayfa";
import Footer from "./components/Footer";
import Hakkimizda from "./components/Hakkimizda";
import Header from "./components/Header";
import Register from "./components/Register";

const Routers = () => {
  return (
  
    <BrowserRouter>
    <Header/>

    <Routes>
      <Route path="/hakkimizda" element={<Hakkimizda/>}/>
      <Route path="/register" element={<Register/>}/>
      <Route path="/" element={<Anasayfa/>}/>
    </Routes>

    <Footer/>
  </BrowserRouter>
  
    )
};

export default Routers;
