
let listem = document.querySelector(".container");
let mlz1 = document.querySelector(".bir");
let mlz2 = document.querySelector(".iki");
let mlz3 = document.querySelector(".uc");
let mlz4 = document.querySelector(".dort");
let mlz5 = document.querySelector(".bes");

mlz1.innerText = "1.Elma";
mlz2.innerText = "2.Armut";
mlz3.innerText = "3.Karpuz";
mlz4.innerText = "4.Portakal";
mlz5.innerText = "5.Kiraz";




mlz5.innerHTML = `<ol style='list-style-position:inside;'">
<li>Kiraz</li>
<li>Elma</li>
<li>Muz</li>
</ol>`