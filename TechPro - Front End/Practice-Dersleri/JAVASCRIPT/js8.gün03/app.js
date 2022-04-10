/* Kullanıcın girdiği karakter sayısını sayan bir sayaç yapalım.
Reset butonumuz inputu ve sayacı sıfırlasın.
sayfa açıldığında 3 sn içinde bir şey yazmasa
"Haydi söyle" mesajı gelsin, yazmaya başlayınca da mesaj silinsin.*/

const sayac = document.querySelector(".sayac");
const girisBtn = document.querySelector("#giris");
const resetBtn = document.querySelector("#sil");
const mesaj = document.querySelector(".msj");

girisBtn.addEventListener("keyup", () => {
    mesaj.innerHTML = "";
    sayac.innerHTML = girisBtn.value.length;
})


resetBtn.addEventListener("click", () => {
    sayac.innerHTML = 0;
})


// if(!girisBtn.value.length == 0){
//     clearTimeout(durdur);
// }


let durdur = setTimeout(()=>{
    if(girisBtn.value) return ;
    mesaj.innerHTML = `<h1>Haydi Söyle</h1>`
}, 3000)