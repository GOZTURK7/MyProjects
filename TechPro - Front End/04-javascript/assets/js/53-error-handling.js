document.querySelector("#frmLogin").addEventListener("submit", (e)=>{
    e.preventDefault(); // !!!! ÖNEMLİ: submit aşağıdaki kontrolleri geçmeden defuault göndermesin veriyi diye burada devre dışı bıraktık 
    try {
        let email = document.querySelector("#email").value;
        let password = document.querySelector("#password").value;
        if(!isEmail(email)) throw("Geçerli bir eposta giriniz"); 
        if(!password) throw("Şifre boş geçilemez"); 
        document.querySelector("#frmLogin").submit(); // kontrolleri geçtikten sonra manuel olarak submit ettik.
    } catch (error) {
       alert(error);
    }
});
function isEmail(email){
    let reg = /\S+@\S+\.\S{2,5}$/;
    return reg.test(email);
}