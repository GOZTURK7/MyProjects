import React from "react";
const Jsx2 = () => {
  const yas = 18;
  return (
    <div>
      
      {/* TERNARY YÖNTEMİ */}
      {yas>=15 ? <h2>TERNARY :      İçerik 15 Yaş ve Üstüne Özel</h2> : ""}


      {/* SHORT CİRCUIT YÖNTEMİ */}
      {yas>=15 && <h2>SHORT CIRCUIT :       İçerik 15 Yaş ve Üstüne Özel</h2>}

      {yas>15 || <h2>İçerik 15 Yaş ve Altına Özel</h2>}

   
    </div>
  );
};
export default Jsx2;
