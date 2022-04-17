let hour = document.querySelector("#clock li:nth-child(1)");

let second = document.querySelector("#clock li:nth-child(2)");
let minute = document.querySelector("#clock li:nth-child(3)");
let second1 = document.querySelector("#clock li:nth-child(5)");
let second2 = document.querySelector("#clock li:nth-child(4)")




let tick = () =>{

    let date = new Date();


    hour.innerHTML = `${date.getHours()}`;
    minute.innerHTML = `${(date.getMinutes()<10?'0':'') + date.getMinutes() }`;

    second1.innerHTML = `${(date.getSeconds()<10 ?'0': '') + date.getSeconds()}`;
    

    console.log(`${date.getHours()}: ${date.getMinutes()} : ${date.getSeconds()}`);

    // if(second2.innerText.includes(":")){
    //     second2.style.color = "rgb(58, 53, 53)";
    //     second2.innerText = ".";
    // }else{
    //     second2.style.color = "green"
    //     second2.innerText = ":";
    // }
    // saati güncelleyecek fonksiyon

    if(second2.style.opacity==0) second2.style.opacity=1;
    else second2.style.opacity=0;
   

}


setInterval(tick,1000)
