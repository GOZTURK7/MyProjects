

const mesaj = () => {

    let saat = document.querySelector("#saat").value;

    let date = saat;

    if(date < 7 && date >= 0){
        document.querySelector(".msj").innerText = `saat: ${date} : ${new Date().getMinutes()} İyi Geceler`
    }

}